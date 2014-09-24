package es.upm.miw.pd.singleton.logger;

public class Clase2 {
    private Logger logger;

    public Clase2(Logger logger) {
        this.logger = logger;
    }
    
    public void method1(){
        //...
        this.logger.addLog("Registrado");
    }
    
    public void method2(){
        //...
        Clase3 c3= new Clase3(this.logger);
        c3.method1();
        this.logger.addLog("Registrado");
    }
    

}
