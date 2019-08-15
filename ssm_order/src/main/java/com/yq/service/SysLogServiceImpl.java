package com.yq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yq.entity.SysLog;
import com.yq.mapper.ISysLogDaoMapper;

@Service("sysLogService")
public class SysLogServiceImpl implements ISysLogService {

	@Autowired
	private ISysLogDaoMapper sysLogDaoMapper;

	
	public void save(SysLog log) {
		try {
			sysLogDaoMapper.save(log);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<SysLog> findAll() {
		try {
			return sysLogDaoMapper.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
