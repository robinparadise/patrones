package es.upm.miw.pd.singleton.factory.solution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class FactoryReferencesTest {

    @Test
    public void testFactoryReferencesIsSingleton() {
        assertSame(FactoryReferences.getFactory(), FactoryReferences.getFactory());
    }
    
    @Test
    public void testFactoryReferencesSingletonNotNull() {
        assertNotNull(FactoryReferences.getFactory());
    }

    @Test
    public void testFactoryReferences() {
        assertEquals(0, FactoryReferences.getFactory().getReference("cero"));
        assertEquals(1, FactoryReferences.getFactory().getReference("uno"));
        FactoryReferences.getFactory().removeReference("cero");        
        assertEquals(2, FactoryReferences.getFactory().getReference("cero"));
    }
}
