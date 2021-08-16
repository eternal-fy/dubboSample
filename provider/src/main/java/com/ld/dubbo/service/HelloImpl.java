package com.ld.dubbo.service;

import com.ld.util.Mail;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.io.*;

@DubboService
@Service
public class HelloImpl implements Hello {
    @Autowired
    Mail mail;

    @Override
    public void goodMorning() throws MessagingException, IOException {
        File file = new File("/root/myProgram/morning.txt");
        String msg="";
        if(file.exists()){
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String str;
            while((str=bufferedReader.readLine())!=null){
                msg+=str;
            }
        }
        if(msg==""){
            msg="早安！工具人！";
        }
        mail.sendComplexMail(msg);
    }

    @Override
    public void goodNight() throws MessagingException, IOException {
        File file = new File("/root/myProgram/night.txt");
        String msg="";
        if(file.exists()){
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String str;
            while((str=bufferedReader.readLine())!=null){
                msg+=str;
            }
        }
        if(msg==""){
            msg="晚安！工具人！";
        }
        mail.sendComplexMail(msg);
    }
}
