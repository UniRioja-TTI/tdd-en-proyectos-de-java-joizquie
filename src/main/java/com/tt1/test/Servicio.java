package com.tt1.test;

import java.time.LocalDate;
import java.util.List;

public class Servicio {
    private Repository repo;
    private MailerStub mailer;

    public void crearNuevaTarea(String nombre, LocalDate fecha) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public void agregarEmailAgenda(String email) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public void finalizarTarea(String nombre) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public List<ToDo> consultarPendientes() { throw new UnsupportedOperationException("Clase aún no implementada."); }

    private void checkDeadlinesAndAlert() { throw new UnsupportedOperationException("Clase aún no implementada."); }
}
