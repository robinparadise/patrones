package es.upm.miw.pd.state.conection;

import es.upm.miw.pd.state.connection.Link;

public final class LinkMock implements Link {
    private String msg;

    private int respuesta;

    public String getMsg() {
        return msg;
    }

    public int getRespuesta() {
        return respuesta;
    }

    @Override
    public void enviar(String msg) {
        this.msg = msg;
    }

    @Override
    public void recibir(int respuesta) {
        this.respuesta = respuesta;
    }

}
