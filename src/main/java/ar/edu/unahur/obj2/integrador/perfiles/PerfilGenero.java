package ar.edu.unahur.obj2.integrador.perfiles;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.integrador.Pelicula;

public class PerfilGenero implements Perfilable {
    
    private List <String> generos = new ArrayList<>(); 


    public PerfilGenero(List<String> generos) {
        this.generos = generos;
    }


    @Override
    public Boolean aceptaSugerencia(Pelicula pelicula) {
        return generos.contains(pelicula.getGenero());
    }


    public List<String> getGeneros() {
        return generos;
    }
    
}
