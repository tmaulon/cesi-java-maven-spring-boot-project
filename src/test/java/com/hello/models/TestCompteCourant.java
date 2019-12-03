package com.hello.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCompteCourant {

    @Test
    public void testCrediterCompteCourantWithValidAmount() {
        CompteCourant cc = new CompteCourant("Numero", "Intitule", 1000, 200);
        try {
            cc.crediter(500);
            assertEquals(1500, cc.getSolde(), 0.1);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void testCrediterCompteCourantWithNullAmount() {
        CompteCourant cc = new CompteCourant("Numero", "Intitule", 1000, 200);
        assertThrows(Exception.class, () -> cc.crediter(0));
    }

    @Test
    public void testCrediterCompteCourantWithNegativeAmount() {
        CompteCourant cc = new CompteCourant("Numero", "Intitule", 1000, 200);

        assertThrows(Exception.class, () -> cc.crediter(-200));
    }

    @Test
    public void testDebiterCompteCourantWithValidAmount() {
        CompteCourant cc = new CompteCourant("Numero", "Intitule", 1000, 200);

        try {
            cc.debiter(500);
            assertEquals(500, cc.getSolde(), 0.1);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void testDebiterCompteCourantWithNullAmount() {
        CompteCourant cc = new CompteCourant("Numero", "Intitule", 1000, 200);
        assertThrows(Exception.class, () -> cc.debiter(0));
    }

    @Test
    public void testDebiterCompteCourantWithNegativeAmount() {
        CompteCourant cc = new CompteCourant("Numero", "Intitule", 1000, 200);
        assertThrows(Exception.class, () -> cc.debiter(-200));
    }



}
