package ar.edu.unahur.obj2.integrador;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {

    private final String nombre;
    private final Integer anioEstreno;
    private final String genero;
    private final String idiomaOriginal;
    private List <String> subtitulos = new ArrayList<>();
    
    public Pelicula(String nombre, String genero, Integer anioEstreno, String idiomaOriginal) {
        this.nombre = nombre;
        this.genero = genero;
        this.anioEstreno = anioEstreno;
        this.idiomaOriginal = idiomaOriginal;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getAnioEstreno() {
        return anioEstreno;
    }

    public String getIdiomaOriginal() {
        return idiomaOriginal;
    }

    public void agregarSubtitulos(String subtitulo){
        subtitulos.add(subtitulo);
    }

    public Boolean esSubtitulada() {
       return subtitulos.contains(idiomaOriginal);
    }
    
    public void quitarSubtitulos(){
        subtitulos.clear();
    }
}
