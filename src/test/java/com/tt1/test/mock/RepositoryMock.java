package com.tt1.test.mock;
import com.tt1.test.*;

import java.util.ArrayList;
import java.util.List;

public class RepositoryMock implements IToDoRepository{
    public List<ToDo> tareasEnMemoria = new ArrayList<>();

    @Override public void guardarTarea(ToDo t) { tareasEnMemoria.add(t); }
    @Override public ToDo encontrarTarea(String n) { return null; }
    @Override public void marcarComoCompletada(String n) {}
    @Override public void guardarEmail(String e) {}
}
