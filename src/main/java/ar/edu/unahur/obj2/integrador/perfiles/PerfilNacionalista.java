package ar.edu.unahur.obj2.integrador.perfiles;

import ar.edu.unahur.obj2.integrador.Pelicula;
import ar.edu.unahur.obj2.integrador.Usuario;

public class PerfilNacionalista implements Perfilable{

    private final Usuario usuario;

    public PerfilNacionalista(Usuario usuario){
        this.usuario = usuario;
    }

    @Override
    public Boolean aceptaSugerencia(Pelicula pelicula) {
       return pelicula.getIdiomaOriginal() == usuario.getIdiomaConfigurado();
    }
}
