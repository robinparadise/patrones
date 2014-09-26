package es.upm.miw.pd.state;


public class StateA extends State {

    @Override
    public void action1(Context context) {
        context.setState(new StateB());
    }

    @Override
    public void action2(Context context) {
    }

    @Override
    public String toString() {
        return "Estado A";
    }

}
