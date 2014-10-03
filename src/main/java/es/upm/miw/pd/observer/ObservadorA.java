package es.upm.miw.pd.observer;

import upm.jbb.IO;

public class ObservadorA implements Observador {
    private Sujeto sujeto;

    public ObservadorA(Sujeto sujeto) {
        this.sujeto = sujeto;
        this.sujeto.aniadir(this);
    }

    @Override
    public void actualizar() {
        IO.out.println("A: sujeto a cambiado: " + this.sujeto.getEstado());
    }
}
