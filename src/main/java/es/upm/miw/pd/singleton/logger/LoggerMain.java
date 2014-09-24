package es.upm.miw.pd.singleton.logger;

public class LoggerMain {
    public void prueba() {
        Logger.getLogger().addLog("Uno");
        Logger.getLogger().addLog("Dos");
        Logger.getLogger().addLog("Tres");
        Logger.getLogger().print();
        Logger.getLogger().clear();
        Logger.getLogger().addLog("Cuatro");
        Logger.getLogger().print();
    }

    public static void main(String[] args) {
        new LoggerMain().prueba();
    }

}
