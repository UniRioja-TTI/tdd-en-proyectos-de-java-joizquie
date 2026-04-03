package com.tt1.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.tt1.test.mock.RepositoryMock;
import com.tt1.test.mock.MailerMock;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ServicioTest {
    private Servicio servicio;
    private RepositoryMock mockRepo;
    private MailerMock mockMailer;

    @Test
    void testCrearTareaUnitario() {
        // Arrange: simulado (Mocks)
        RepositoryMock mockRepo = new RepositoryMock();
        Servicio servicio = new Servicio(mockRepo, new MailerMock());
        // Act
        servicio.crearNuevaTarea("Prueba", LocalDate.now());
        // Assert: Verificamos solo la lógica de Servicio
        assertEquals(1, mockRepo.tareasEnMemoria.size());
    }

    @BeforeEach
    void setUp() {
        mockRepo = new RepositoryMock();
        mockMailer = new MailerMock();
        servicio = new Servicio(mockRepo, mockMailer);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void crearNuevaTarea() {
    }

    @Test
    void agregarEmailAgenda() {
    }

    @Test
    void finalizarTarea() {
    }

    @Test
    void consultarPendientes() {
    }
}