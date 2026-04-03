package com.tt1.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MailerStubTest {
    @Test
    void testEnviar() {
        // Arrange
        MailerStub mailer = new MailerStub();
        // Act
        boolean result = mailer.enviarCorreo("test@test.com", "Hola");
        // Assert
        assertTrue(result);
    }
}