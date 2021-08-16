package com.ld.dubbo.service;

import javax.mail.MessagingException;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface Hello {
    public void goodMorning() throws MessagingException, IOException;

    public void goodNight() throws MessagingException, IOException;
}
