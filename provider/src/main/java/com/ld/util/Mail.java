package com.ld.util;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Component
public class Mail {
    @Autowired
    JavaMailSenderImpl javaMailSender;

    public void sendSimpleMail(){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("java发送的邮件");
        simpleMailMessage.setText("自动发送的内容");
        simpleMailMessage.setFrom("906542557@qq.com");
        simpleMailMessage.setTo("906542557@qq.com");
        javaMailSender.send(simpleMailMessage);
    }

    public void sendComplexMail(String str) throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
        helper.setSubject(str);
        helper.setText("<img src='https://img1.baidu.com/it/u=3915247208,1658971365&fm=26&fmt=auto&gp=0.jpg'/>",true);
//        helper.addAttachment("mywebpage.html",new File("D:\\MyWorkSpace\\springbootlearn\\target\\classes\\static\\hello.html"));
        helper.setFrom("906542557@qq.com");
        helper.setTo("906542557@qq.com");
        javaMailSender.send(mimeMessage);
    }
}
