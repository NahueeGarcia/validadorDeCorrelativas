package domain;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private List<Materia> asignaturas;
    private Alumno alumno;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.asignaturas = new ArrayList<Materia>();
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Materia> getAsignaturas() {
        return asignaturas;
    }

    public void agregarAsignaturas(Materia asignatura) {
        asignaturas.add(asignatura);
    }

    public Boolean aprobada() {
        return this.asignaturas.stream().allMatch(materia -> alumno.materiasEstanAprobadas(materia.getCorrelativas()));
    }
}
