package ar.edu.unahur.obj2.integrador.perfiles;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.integrador.Pelicula;
import ar.edu.unahur.obj2.integrador.Usuario;

public class PerfilNacionalistaTest {
    Pelicula peli = new Pelicula("NombreDrama", "Drama", 2003, "Español");
    Usuario usuario = new Usuario("facundoromangimenez@gmail.com", 
        new PerfilSubtitulado(), "Español");
    
    @Test
    void testAceptaSugerencia() {
        usuario.setPerfilCinefilo(new PerfilNacionalista(usuario));
        assertTrue(usuario.aceptaSugerencia(peli));
    }

    @Test
    void testNoAceptaSugerencia() {
        usuario.setPerfilCinefilo(new PerfilNacionalista(usuario));
        usuario.setIdiomaConfigurado("Ingles");
        assertFalse(usuario.aceptaSugerencia(peli));
    }
}
