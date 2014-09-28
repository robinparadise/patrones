package es.upm.miw.pd.state.connection;

public interface Link {
    static final int ACK = 0;

    void enviar(String msg);
    void recibir (int respuesta);
}
