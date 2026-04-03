package com.tt1.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DBStubTest {
    @Test
    void testCreate() {
        // Arrange
        DBStub db = new DBStub();
        // Act
        db.create(new ToDo());
        // Assert
        assertEquals(1, db.getAllTodos().size());
    }
}