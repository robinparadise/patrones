package es.upm.miw.pd.reporter;

import es.upm.miw.pd.doo.interfaze.Receptor;

public class ReceptorMock implements Receptor {
    private String msg = null;

    public String getMsg() {
        return msg;
    }

    @Override
    public void report(String msg) {
        this.msg = msg;
    }

}
