package es.upm.miw.pd.observer;

import upm.jbb.IO;

public final class MainObserver {
    private MainObserver() {
    }

    public static void main(String[] args) {
        Sujeto sujeto = new Sujeto();
        new ObservadorA(sujeto);
        new ObservadorB(sujeto);
        IO.out.println("Leo sujeto... " + sujeto.getEstado());
        IO.out.println("Cambio sujeto...");
        sujeto.setEstado(2);
    }
}
