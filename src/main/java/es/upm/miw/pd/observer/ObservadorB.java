package es.upm.miw.pd.observer;

import upm.jbb.IO;

public class ObservadorB implements Observador {
    private Sujeto sujeto;

    public ObservadorB(Sujeto sujeto) {
        this.sujeto = sujeto;
        this.sujeto.aniadir(this);
    }

    @Override
    public void actualizar() {
        IO.out.println("B: sujeto a cambiado: " + this.sujeto.getEstado());
    }
}
