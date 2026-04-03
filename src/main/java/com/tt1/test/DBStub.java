package com.tt1.test;

import java.util.*;

public class DBStub implements IDBStub {
    private List<ToDo> tareas = new ArrayList<>();
    private Set<String> agendaEmails = new HashSet<>();

    public void create(ToDo todo) { tareas.add(todo); }
    public ToDo read(String nombre) {
        return tareas.stream().filter(t -> t.getNombre().equals(nombre)).findFirst().orElse(null);
    }
    public void update(ToDo todo) { /* Lógica de actualización simple */ }
    public void delete(String nombre) { tareas.removeIf(t -> t.getNombre().equals(nombre)); }

    public List<ToDo> getAllTodos() { return tareas; }
    public void addEmail(String email) { agendaEmails.add(email); }
    public Set<String> getEmails() { return agendaEmails; }
}
