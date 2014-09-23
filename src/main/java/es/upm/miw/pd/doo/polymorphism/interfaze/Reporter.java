package es.upm.miw.pd.doo.polymorphism.interfaze;

import java.util.ArrayList;
import java.util.List;

public class Reporter {
    private List<Receptor> receptors;

    public Reporter() {
        this.receptors = new ArrayList<>();
    }

    public void addReceptor(Receptor receptor) {
        this.receptors.add(receptor);
    }

    public void deleteReceptor(Receptor receptor) {
        this.receptors.remove(receptor);
    }

    public void broadcast(String msg) {
        for (Receptor receptor : receptors) {
            receptor.report(msg);
        }
    }

}
