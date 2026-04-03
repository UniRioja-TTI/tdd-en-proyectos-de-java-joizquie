package com.tt1.test;

import com.tt1.test.mock.DBStubMock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    @Test
    void testGuardarTareaUnitario() {
        // Arrange: Usamos el Mock de la DB para que sea unitario
        DBStubMock mockDb = new DBStubMock();
        Repository repo = new Repository(mockDb);
        // Act
        repo.guardarTarea(new ToDo());
        // Assert: Comprobamos que el repo llamó a la DB
        assertEquals(1, mockDb.tareas.size());
    }
}