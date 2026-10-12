package edu.unisabana.dyas.notas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BloqueoPipelineTest {

    @Test
    void pruebaQueFallaAProposito() {
        assertEquals(1, 2, "Prueba de evidencia: debe bloquear el Pull Request");
    }
}
