package com.tt1.test;

public class MailerStub implements IMailer {
    public boolean enviarCorreo(String direccion, String mensaje) {
        System.out.println("ENVIANDO MAIL A: " + direccion);
        System.out.println("MENSAJE: " + mensaje);
        return true;
    }
}
