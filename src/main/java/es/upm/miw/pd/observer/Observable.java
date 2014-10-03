package es.upm.miw.pd.observer;

import java.util.HashSet;
import java.util.Set;

public class Observable {
    private final Set<Observador> lista = new HashSet<Observador>();

    public void aniadir(Observador observador) {
        this.lista.add(observador);
    }

    public void quitar(Observador observador) {
        this.lista.remove(observador);
    }

    public void notificar() {
        for (Observador observador : lista) {
            observador.actualizar();
        }
    }
}
