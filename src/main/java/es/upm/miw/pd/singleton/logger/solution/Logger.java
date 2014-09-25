package es.upm.miw.pd.singleton.logger.solution;

import java.util.Date;

public final class Logger {
    private static final Logger LOGGER = new Logger();

    private String logs;

    private Logger() {
        this.clear();
    }

    public static Logger getLogger() {
        return LOGGER;
    }

    public String getLogs() {
        return logs;
    }

    public void addLog(String log) {
        this.logs = this.logs + ">>> " + log + "\n";
    }

    public void clear() {
        this.logs = new Date().toString() + "\n";
    }

    public void print() {
        System.out.print(this.logs);
    }
}
