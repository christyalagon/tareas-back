package proyecto.tareas.models;

import lombok.NoArgsConstructor;
import proyecto.tareas.domain.Usuario;

import javax.persistence.*;
import java.io.Serializable;

@SuppressWarnings("serial")
@Entity
@Table(name = "Usuario_fusion")
@NoArgsConstructor
public class UsuarioFusion implements Serializable {
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
    @Column(name = "centro_empresa")
    private String centroEmpresa;

    public UsuarioFusion(Usuario usuario){
        this.id = usuario.getId();
        this.nombre = usuario.getNombre();
        this.primerApellido = usuario.getPrimerApellido();
        this.segundoApellido = usuario.getSegundoApellido();
        this.perfil = usuario.getPerfil();
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

    public String getCentroEmpresa() {
        return centroEmpresa;
    }

    public void setCentroEmpresa(String centroEmpresa) {
        this.centroEmpresa = centroEmpresa;
    }
}
