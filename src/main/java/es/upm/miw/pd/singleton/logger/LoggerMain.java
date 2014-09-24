package es.upm.miw.pd.singleton.logger;

public class LoggerMain {

    public static void main(String[] args) {
        Logger logger = new Logger();
        new Clase1().method1(logger);
        Clase2 c2 = new Clase2(logger);
        c2.method1();
        c2.method2();
    }

}
