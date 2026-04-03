package com.tt1.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Servicio {
    private IToDoRepository repo;
    private IMailer mailer;

    public Servicio(IToDoRepository repo, IMailer mailer) {
        this.repo = repo;
        this.mailer = mailer;
    }

    public void crearNuevaTarea(String nombre, LocalDate fecha) {
        if (nombre == null || nombre.isEmpty()) return;
        ToDo t = new ToDo();
        t.setNombre(nombre);
        t.setFechaLimite(fecha);
        repo.guardarTarea(t);
        checkDeadlinesAndAlert();
    }

    public List<ToDo> consultarPendientes() {
        checkDeadlinesAndAlert();

        return new ArrayList<>();
    }

    public void agregarEmailAgenda(String email) {
        repo.guardarEmail(email);
    }

    public void finalizarTarea(String nombre) {
        repo.marcarComoCompletada(nombre);
    }

    private void checkDeadlinesAndAlert() {
        System.out.println("Chequeando fechas límite...");
    }
}
