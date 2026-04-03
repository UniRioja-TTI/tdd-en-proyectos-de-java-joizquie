package com.tt1.test;

import java.util.List;
import java.util.Set;

public interface IDBStub {
    void create(ToDo todo);
    ToDo read(String nombre);
    void update(ToDo todo);
    void delete(String nombre);
    List<ToDo> getAllTodos();
    void addEmail(String email);
    Set<String> getEmails();
}
