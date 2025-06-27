package ar.edu.unahur.obj2.integrador.perfiles;

import ar.edu.unahur.obj2.integrador.Pelicula;

public class PerfilSubtitulado implements Perfilable{



    @Override
    public Boolean aceptaSugerencia(Pelicula pelicula) {
        return pelicula.esSubtitulada();
    }
    
}
