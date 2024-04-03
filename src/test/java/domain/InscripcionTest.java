package domain;

import org.junit.Assert;
import org.junit.Test;

public class InscripcionTest {
    @Test
    public void inscripcionAprobada() {
        Materia syo = new Materia("syo");
        Materia ads = new Materia("ads");
        ads.agregarCorrelativas(syo);

        Alumno juan = new Alumno("Juan");
        juan.agregarAprobada(syo);
        Inscripcion inscripcion = new Inscripcion(juan);
        inscripcion.agregarAsignaturas(ads);
        Assert.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void inscripcionNoAprobada() {
        Materia am1 = new Materia("am1");
        Materia algebra = new Materia("algebra");
        Materia am2 = new Materia("am2");
        am2.agregarCorrelativas(am1);
        am2.agregarCorrelativas(algebra);

        Alumno juan = new Alumno("Juan");
        juan.agregarAprobada(am1);
        Inscripcion inscripcion = new Inscripcion(juan);
        inscripcion.agregarAsignaturas(am2);
        Assert.assertFalse(inscripcion.aprobada());
    }
}
