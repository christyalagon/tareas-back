package proyecto.tareas.domain;

import proyecto.tareas.models.UsuarioFusion;

import java.io.Serializable;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
public class Usuario implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "primer_apellido")
    private String primerApellido;
    @Column(name = "segundo_apellido")
    private String segundoApellido;
    @Column(name = "perfil")
    private char perfil;

    public Usuario(UsuarioFusion usuarioFusion) {
        this.id = usuarioFusion.getId();
        this.nombre = usuarioFusion.getNombre();
        this.primerApellido = usuarioFusion.getPrimerApellido();
        this.segundoApellido= usuarioFusion.getSegundoApellido();
        this.perfil = usuarioFusion.getPerfil();
    }

    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public char getPerfil() {
        return perfil;
    }

    public void setPerfil(char perfil) {
        this.perfil = perfil;
    }

}
