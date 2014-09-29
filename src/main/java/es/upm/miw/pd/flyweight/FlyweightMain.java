package es.upm.miw.pd.flyweight;

public final class FlyweightMain {
    private FlyweightMain() {
    }

    public static void main(String[] args) {
        Factory factoria = new Factory();
        FlyweightConcrete[] array = new FlyweightConcrete[5];
        array[0] = factoria.get("ocho");
        array[1] = factoria.get("tres");
        array[2] = factoria.get("ocho");
        array[3] = factoria.get("dos");
        array[4] = factoria.get("tres");

        for (FlyweightConcrete pesoLigeroConcreto : array) {
            System.out.println(pesoLigeroConcreto.operation("--"));
        }

        for (FlyweightConcrete pesoLigeroConcreto : array) {
            System.out.println(pesoLigeroConcreto.operation(".."));
        }

    }
}
