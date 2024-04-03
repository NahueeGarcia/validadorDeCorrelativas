package domain;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String  nombre;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.materiasAprobadas = new ArrayList<Materia>();
    }

    public Boolean materiasEstanAprobadas(List<Materia> materias){
        return materiasAprobadas.containsAll(materias);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void agregarAprobada(Materia aprobada) {
        materiasAprobadas.add(aprobada);
    }
}
