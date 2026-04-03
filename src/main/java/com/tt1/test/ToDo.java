package com.tt1.test;

import java.io.Serializable;
import java.time.LocalDate;

public class ToDo {
    private String nombre;
    private String descripcion;
    private LocalDate fechaLimite;
    private boolean completado;

    public ToDo() {} // Constructor vacío obligatorio para JavaBean

    // Getters y Setters
    public String getNombre() { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public void setNombre(String nombre) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public String getDescripcion() { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public void setDescripcion(String descripcion) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public LocalDate getFechaLimite() { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public void setFechaLimite(LocalDate fechaLimite) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public boolean isCompletado() { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public void setCompletado(boolean completado) { throw new UnsupportedOperationException("Clase aún no implementada."); }
}
