package com.tt1.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ToDoTest {
    @Test
    void testJavaBean() {
        // Arrange & Act
        ToDo todo = new ToDo();
        todo.setNombre("Tarea 1");
        // Assert
        assertEquals("Tarea 1", todo.getNombre());
    }
}