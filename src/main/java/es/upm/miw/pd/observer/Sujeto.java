package es.upm.miw.pd.observer;

public class Sujeto extends Observable {
    private int estado;

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
        this.notificar();
    }
}
