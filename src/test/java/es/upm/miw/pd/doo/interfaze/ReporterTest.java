package es.upm.miw.pd.doo.interfaze;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.pd.doo.polymorphism.interfaze.Reporter;

public class ReporterTest {
    private Reporter reporter;

    private ReceptorMock mock;

    @Before
    public void before() {
        this.reporter = new Reporter();
        this.mock = new ReceptorMock();
        this.reporter.addReceptor(this.mock);
    }

    @Test
    public void testDeleteReceptor() {
        this.reporter.deleteReceptor(this.mock);
        this.reporter.broadcast("...");
        assertNull(this.mock.getMsg());
    }

    @Test
    public void testBroadcast() {
        final String msg="pruebaBroadcast";
        this.reporter.broadcast(msg);
        assertEquals(msg,this.mock.getMsg());
    }
}
