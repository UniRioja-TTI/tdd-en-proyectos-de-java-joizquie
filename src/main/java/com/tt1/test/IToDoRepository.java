package com.tt1.test;

public interface IToDoRepository {
    ToDo encontrarTarea(String nombre);
    void marcarComoCompletada(String nombre);
    void guardarTarea(ToDo todo);
    void guardarEmail(String email);
}
