package com.yq.controller;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yq.entity.SysLog;
import com.yq.service.ISysLogService;
@Component
@Aspect
public class LogAop {
	private Date visitTime;
	private Class clazz;
	private Method method;
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private ISysLogService sysLogService;
	@Around("execution(* com.yq.controller.*.*(..))")
	public Object doAround(ProceedingJoinPoint pjp)  {
		try {
			visitTime=new Date();
			clazz=pjp.getTarget().getClass();
			String methodName=pjp.getSignature().getName();
			Object[]args=pjp.getArgs();
			Class[]params=new Class[args.length];
			for(int i=0;i<args.length;i++){
				params[i]=args[i].getClass();
			}
			method=clazz.getMethod(methodName, params);
			
			//时锟斤拷
			long time=new Date().getTime()-visitTime.getTime();
			//锟斤拷取Ip
			String ip=request.getRemoteAddr();
			//锟斤拷取username
			SecurityContext sc=SecurityContextHolder.getContext();
			User user=(User)sc.getAuthentication().getPrincipal();
			String username=user.getUsername();
			//锟斤拷取url
			String url="";
			if(clazz!=null&method!=null&clazz!=LogAop.class){
				RequestMapping classRequestMapping=(RequestMapping)clazz.getAnnotation(RequestMapping.class);
				if(classRequestMapping!=null){
					String[]clazzValue=classRequestMapping.value();
					RequestMapping methodRequestMapping=method.getAnnotation(RequestMapping.class);
					String[]methodValue=methodRequestMapping.value();
					url=clazzValue[0]+methodValue[0];
				}
			}
			SysLog sysLog=new SysLog(UUID.randomUUID().toString().replace("-", ""),visitTime,visitTime.toLocaleString(),username,ip,url,time,method.getName());
			
			// 璋冪敤Service锛岃皟鐢╠ao灏唖ysLog insert鏁版嵁搴�
			sysLogService.save(sysLog);
			System.out.println(sysLog);
			return pjp.proceed();
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
