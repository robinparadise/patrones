package es.upm.miw.pd.doo.interfaze;

import es.upm.miw.pd.doo.polymorphims.interfaze.Receptor;


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
