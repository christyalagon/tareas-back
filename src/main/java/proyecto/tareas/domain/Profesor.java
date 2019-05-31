package proyecto.tareas.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Profesor implements Serializable {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "centro_educativo")
    private String centroEducativo;

    public Profesor() {

    }

    public Profesor(UsuarioFusion usuarioFusion) {
        this.id = usuarioFusion.getId();
        this.centroEducativo = usuarioFusion.getCentroEmpresa();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCentroEducativo() {
        return centroEducativo;
    }

    public void setCentroEducativo(String centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

}
