package colleague;

import mediator.Mediator;
import model.Libro;

public class Estudiante {

    private String nombre;
    private Mediator mediator;

    public Estudiante(String nombre, Mediator mediator) {
        this.nombre = nombre;
        this.mediator = mediator;
    }

    public String getNombre() {
        return nombre;
    }

    public void solicitarLibro(Libro libro) {
        mediator.solicitarLibro(this, libro);
    }

    public void devolverLibro(Libro libro) {
        mediator.devolverLibro(this, libro);
    }
}