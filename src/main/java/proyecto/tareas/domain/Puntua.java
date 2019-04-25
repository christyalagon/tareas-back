package proyecto.tareas.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Puntua implements Serializable {
	@Id
	@Column(name = "id")
	@GeneratedValue
	private Long id;

	@Column(name = "codigo_mod")
	private String codigoMod;

	@Column(name = "codigo_RA")
	private String codigoRa;

	@Column(name = "codigo_CE")
	private String codigoCe;

	@Column(name = "codigo_tarea")
	private String codigoTarea;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoMod() {
		return codigoMod;
	}

	public void setCodigoMod(String codigoMod) {
		this.codigoMod = codigoMod;
	}

	public String getCodigoRa() {
		return codigoRa;
	}

	public void setCodigoRa(String codigoRa) {
		this.codigoRa = codigoRa;
	}

	public String getCodigoCe() {
		return codigoCe;
	}

	public void setCodigoCe(String codigoCe) {
		this.codigoCe = codigoCe;
	}

	public String getCodigoTarea() {
		return codigoTarea;
	}

	public void setCodigoTarea(String codigoTarea) {
		this.codigoTarea = codigoTarea;
	}

}
