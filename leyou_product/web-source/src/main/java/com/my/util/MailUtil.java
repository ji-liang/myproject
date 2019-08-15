package com.my.util;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class MailUtil {
        /**
         * 发送邮件方法
         * @param toAddress 收件人
         * @param code 激活码：程序中产生一个随机的激活码
         */
        public static void sendMail(String toAddress,String code){
            //1,获取连接
            Properties props=new Properties();
            props.setProperty("mail.host", "localhost");//邮件服务器主机
            Session session=Session.getInstance(props, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    // TODO
                    return new PasswordAuthentication("service@xasxt.com", "service");
                }
            });
            //2,创建邮件对象
            Message msg=new MimeMessage(session);
            try {
                //设置发件人
                msg.setFrom(new InternetAddress("service@xasxt.com"));
                //设置收件人
                msg.addRecipient(RecipientType.TO, new InternetAddress(toAddress));
                //设置邮件标题
                msg.setSubject("来自西安粤嵌的激活邮件");
                //设置邮件正文（注意：实际使用中，这里的超链接最好写成ip地址，而不能写成localhost）
                msg.setContent("<h1>西安粤嵌友情提示您：</h1><h3>点击下面的链接激活邮件</h3><a href='http://localhost:8080/MailTest/jihuo.jsp?code="+code+"'>激活链接</a>", "text/html;charset=utf-8");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            //3,发送邮件
            try {
                Transport.send(msg);
            } catch (MessagingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        public static void main(String[] args) {
            sendMail("zhangsan@xasxt.com", "54321");
        }
    }
