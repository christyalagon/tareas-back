package proyecto.tareas.domain;

import proyecto.tareas.models.UsuarioFusion;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class TutorEmpresa implements Serializable {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "empresa")
    private String empresa;

    public TutorEmpresa(UsuarioFusion usuarioFusion) {
        this.id = usuarioFusion.getId();
        this.empresa = usuarioFusion.getCentroEmpresa();
    }
    public TutorEmpresa(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

}
