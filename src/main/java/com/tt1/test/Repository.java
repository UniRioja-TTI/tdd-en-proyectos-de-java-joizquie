package com.tt1.test;

public class Repository implements IToDoRepository {
    private IDBStub db;

    public Repository(IDBStub db) { this.db = db; }

    public ToDo encontrarTarea(String nombre) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public void marcarComoCompletada(String nombre) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public void guardarTarea(ToDo todo) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public void guardarEmail(String email) { throw new UnsupportedOperationException("Clase aún no implementada."); }
}
