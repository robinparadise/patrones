package es.upm.miw.pd.state.conection;

public class Conection {
    private State estado;

    private Link emisor;

    public Conection() {
        this.estado = State.CERRADO;
    }

    public Link getEmisor() {
        return emisor;
    }

    public void setEmisor(Link emisor) {
        this.emisor = emisor;
    }

    public State estado() {
        return this.estado;
    }

    public void abrir() {
        if (this.estado == State.CERRADO) {
            this.estado = State.PREPARADO;
        } else if (this.estado == State.PARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == State.PREPARADO) {
        } else if (this.estado == State.ESPERANDO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else
            assert false : "estado imposible";
    }

    public void cerrar() {
        if (this.estado == State.CERRADO) {
        } else if (this.estado == State.PARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == State.PREPARADO) {
            this.estado = State.CERRADO;
        } else if (this.estado == State.ESPERANDO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        }
        assert false : "estado imposible";
    }

    public void parar() {
        if (this.estado == State.CERRADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == State.PARADO) {
        } else if (this.estado == State.PREPARADO) {
            this.estado = State.PARADO;
        } else if (this.estado == State.ESPERANDO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        }
        assert false : "estado imposible";
    }

    public void iniciar() {
        if (this.estado == State.CERRADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == State.PARADO) {
            this.estado = State.PREPARADO;
        } else if (this.estado == State.PREPARADO) {
        } else if (this.estado == State.ESPERANDO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        }
        assert false : "estado imposible";
    }

    public void enviar(String msg) {
        if (this.estado == State.CERRADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == State.PARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == State.PREPARADO) {
            this.emisor.enviar(msg);
            this.estado = State.ESPERANDO;
        } else if (this.estado == State.ESPERANDO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        }
        assert false : "estado imposible";
    }

    public void recibir(int respuesta) {
        if (this.estado == State.CERRADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == State.PARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == State.PREPARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == State.ESPERANDO) {
            if (respuesta == 0) {
                this.estado = State.PREPARADO;
            } else {
                this.estado = State.CERRADO;
            }
        }
        assert false : "estado imposible";
    }

}
