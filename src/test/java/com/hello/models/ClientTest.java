package com.hello.models;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClientTest {

    @Test
    public void testClient()
    {
        Client client1 = new Client("IDB82-ADB-89", "Dupont", "Bertrand");
        assertEquals("Dupont", client1.getNom());

    }
}
