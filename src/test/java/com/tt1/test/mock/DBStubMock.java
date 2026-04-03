package com.tt1.test.mock;

import com.tt1.test.IDBStub;
import com.tt1.test.ToDo;
import java.util.*;

public class DBStubMock implements IDBStub {
    public List<ToDo> tareas = new ArrayList<>();

    public void create(ToDo t) { tareas.add(t); }
    public ToDo read(String n) { return null; }
    public void update(ToDo t) {}
    public void delete(String n) {}
    public List<ToDo> getAllTodos() { return tareas; }
    public void addEmail(String e) {}
    public Set<String> getEmails() { return new HashSet<>(); }
}
