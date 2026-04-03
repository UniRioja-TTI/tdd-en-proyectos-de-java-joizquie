package com.tt1.test.mock;
import com.tt1.test.IMailer;

public class MailerMock implements IMailer {
    @Override public boolean enviarCorreo(String d, String m) { return true; }
}
