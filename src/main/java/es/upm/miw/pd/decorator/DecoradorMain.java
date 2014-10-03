package es.upm.miw.pd.decorator;

public final class DecoradorMain {
    private DecoradorMain() {
    }

    public static void main(String[] args) {
        Componente c = new Componente1();
        Componente da = new DecoradorA(c);
        da.view();
        new DecoradorB(c).view();
        new DecoradorB(da).view();
    }
}
