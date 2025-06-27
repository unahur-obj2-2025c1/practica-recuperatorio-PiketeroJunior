package ar.edu.unahur.obj2.integrador;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.integrador.perfiles.PerfilCombinado;
import ar.edu.unahur.obj2.integrador.perfiles.PerfilGenero;
import ar.edu.unahur.obj2.integrador.perfiles.PerfilModerno;
import ar.edu.unahur.obj2.integrador.perfiles.PerfilSubtitulado;
import ar.edu.unahur.obj2.integrador.perfiles.Perfilable;

public class PeliculaTest {

    Pelicula peli = new Pelicula("Drama", 2003, "Español");

    @BeforeEach
    void setUp(){
        peli.quitarSubtitulos();
    }


    @Test
    void aceptaSugerencia() {
        List<String> generos = new ArrayList<>(Arrays.asList("Terror", "Drama", "Policial")); // asi genero una lista que no varia
        Perfilable perfilDeGenero = new PerfilGenero(generos);
        assertTrue(perfilDeGenero.aceptaSugerencia(peli));
    }

    /*@Test
    void aceptaSugerencia() {
        List<String> generos = new ArrayList<>(); // asi genero la lista normal
        generos.add("Drama");
        generos.add("Policial");
        generos.add("Comedia");
        Perfilable perfilDeGenero = new PerfilGenero(generos);
        assertTrue(perfilDeGenero.aceptaSugerencia(peli));
    }*/

    @Test
    void aceptaSugerenciaDePerfilModerno(){
        Perfilable perfilModerno = new PerfilModerno(2000);
        assertTrue(perfilModerno.aceptaSugerencia(peli));
    }

    @Test
    void noAceptaSugerenciaDePerfilModerno(){
        Perfilable perfilModerno = new PerfilModerno(2010);
        assertTrue(perfilModerno.aceptaSugerencia(peli));
    }

    @Test
    void aceptaSugerenciaDePerfilSub(){
        Perfilable perfilSubtitulo = new PerfilSubtitulado();
        peli.agregarSubtitulos("Español");
        peli.agregarSubtitulos("Ingles");
        assertTrue(perfilSubtitulo.aceptaSugerencia(peli));
    }

    @Test
    void noAceptaSugerenciaDePerfilSubPorNoTenerSub(){
        Perfilable perfilSubtitulo = new PerfilSubtitulado();
        assertFalse(perfilSubtitulo.aceptaSugerencia(peli));
    }

    @Test
    void noAceptaSugerenciaDePerfilSubPorNoSerDeIdiomaOriginal(){
        Perfilable perfilSubtitulo = new PerfilSubtitulado();
        peli.agregarSubtitulos("Ingles");
        assertFalse(perfilSubtitulo.aceptaSugerencia(peli));
    }

    @Test
    void aceptaSugerenciaDePerfilCombi(){
        Perfilable perfilCombinado = new PerfilCombinado(Arrays.asList(
            new PerfilSubtitulado();
            new PerfilGenero(Arrays.asList("Terror", "Drama", "Policial"));
        ));
        assertTrue(perfilCombinado.aceptaSugerencia(peli));
    }

    @Test
    void noAceptaSugerenciaDePerfilCombi(){
        Perfilable perfilCombinado = new PerfilCombinado(Arrays.asList(
            new PerfilSubtitulado();
            new PerfilGenero(Arrays.asList("Terror", "Drama", "Policial"));
        ));
        assertFalse(perfilCombinado.aceptaSugerencia(peli));
    }

    @Test
    void todoAceptaSugerenciaDePerfilCombi(){
        Perfilable perfilCombinado = new PerfilCombinado(Arrays.asList(
            new PerfilSubtitulado();
            new PerfilGenero(Arrays.asList("Terror", "Drama", "Policial"));
        ));
        assertTrue(perfilCombinado.aceptaSugerencia(peli));
    }
}
