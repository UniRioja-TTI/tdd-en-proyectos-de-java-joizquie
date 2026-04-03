package com.tt1.test;

import java.util.*;

public class DBStub {
    private List<ToDo> tareas;
    private Set<String> agendaEmails;

    public void create(ToDo todo) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public ToDo read(String nombre) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public void update(ToDo todo) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public void delete(String nombre) { throw new UnsupportedOperationException("Clase aún no implementada."); }

    public List<ToDo> getAllTodos() { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public void addEmail(String email) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public Set<String> getEmails() { throw new UnsupportedOperationException("Clase aún no implementada."); }
}
