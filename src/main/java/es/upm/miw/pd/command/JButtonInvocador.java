package es.upm.miw.pd.command;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class JButtonInvocador extends JButton implements ActionListener {
    private static final long serialVersionUID = 1L;

    private Orden orden;

    public JButtonInvocador(String name, Orden orden) {
        super(name);
        this.orden = orden;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.orden.ejecutar();
    }

}
