package ar.edu.unahur.obj2.integrador.perfiles;

import ar.edu.unahur.obj2.integrador.Pelicula;

public class PerfilModerno implements Perfilable {

    private Integer anioMinimo;

    public PerfilModerno(Integer anioMinimo) {
        this.anioMinimo = anioMinimo;
    }

    @Override
    public Boolean aceptaSugerencia(Pelicula pelicula) {
        return pelicula.getAnioEstreno();
    }
    
}
