package com.tt1.test;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class ServicioIntegracionTest {
    @Test
    void testFlujoCompletoIntegracion() {
        // Arrange: AQUÍ NO HAY MOCKS. Usamos las clases REALES.
        DBStub dbReal = new DBStub();
        Repository repoReal = new Repository(dbReal);
        MailerStub mailerReal = new MailerStub();
        Servicio servicio = new Servicio(repoReal, mailerReal);

        // Act: Ejecutamos desde la capa más alta
        servicio.crearNuevaTarea("Tarea Integración", LocalDate.now());

        // Assert: Verificamos que el dato recorrió toda la cadena hasta la "DB"
        assertEquals(1, dbReal.getAllTodos().size());
    }
}
