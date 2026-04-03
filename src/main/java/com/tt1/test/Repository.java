package com.tt1.test;

public class Repository implements IToDoRepository {
    private IDBStub db;

    public Repository(IDBStub db) { this.db = db; }

    public void guardarTarea(ToDo todo) { db.create(todo); }
    public ToDo encontrarTarea(String nombre) { return db.read(nombre); }
    public void marcarComoCompletada(String nombre) {
        ToDo t = db.read(nombre);
        if (t != null) t.setCompletado(true);
    }
    public void guardarEmail(String email) { db.addEmail(email); }
}
