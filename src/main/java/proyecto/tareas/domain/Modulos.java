package proyecto.tareas.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Modulos implements Serializable {
	@Id
	@Column(name = "id")
	@GeneratedValue
	private Long id;
	@Column(name = "codigo_mod")
	private String codigoMod;
	@Column(name = "denominacion_mod")
	private String denominacion;
	@Column(name = "curso")
	private char curso;
	@Column(name = "horas")
	private Long horas;

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

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public char getCurso() {
		return curso;
	}

	public void setCurso(char curso) {
		this.curso = curso;
	}

	public Long getHoras() {
		return horas;
	}

	public void setHoras(Long horas) {
		this.horas = horas;
	}

}
