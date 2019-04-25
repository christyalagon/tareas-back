package proyecto.tareas.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class EstaCompuesto implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;
    @Column(name = "codigo")
    private String codigoCiclo;
    @Column(name = "codigo_mod")
    private String codigoMod;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoCiclo() {
        return codigoCiclo;
    }

    public void setCodigoCiclo(String codigoCiclo) {
        this.codigoCiclo = codigoCiclo;
    }

}