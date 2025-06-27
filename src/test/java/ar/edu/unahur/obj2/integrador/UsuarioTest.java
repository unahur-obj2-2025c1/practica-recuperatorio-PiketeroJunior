package ar.edu.unahur.obj2.integrador;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.integrador.excepciones.SugerenciaNoEncontradaException;
import ar.edu.unahur.obj2.integrador.perfiles.PerfilSubtitulado;

public class UsuarioTest {
    Usuario usuario = new Usuario("facundoromangimenez@gmail.com", new PerfilSubtitulado(), "Español");

    @Test
    void testVerPeliculaAlAzar(){
        assertThrows(SugerenciaNoEncontradaException.class, 
        ()->usuario.verPeliculaAlAzar(), 
        "No tenes sugeridas aún");
    }

    
}
