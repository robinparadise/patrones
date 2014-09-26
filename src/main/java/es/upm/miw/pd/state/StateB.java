package es.upm.miw.pd.state;

public class StateB extends State {

    @Override
    public void action1(Context contexto) {
    }

    @Override
    public void action2(Context context) {
        context.setState(new StateA());
    }

    @Override
    public String toString() {
        return "Estado B";
    }

}
