package es.upm.miw.pd.factoryMethod;

import upm.jbb.IO;

public class FactoryMethodMain {
    private Creator[] creadores = {new Creator1(), new Creator2()};

    private Creator creador = creadores[0];

    public void tipoCreador() {
        this.creador = (Creator) IO.in.select(creadores, "Elige un creador");
    }

    public void crearProducto() {
        IO.out.println("Creado producto: " + this.creador.crearProducto().toString());
    }

    public static void main(String[] args) {
        IO.in.addController(new FactoryMethodMain());
    }
}
