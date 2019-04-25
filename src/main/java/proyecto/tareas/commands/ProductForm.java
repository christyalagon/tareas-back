package proyecto.tareas.commands;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jt on 1/10/17.
 */
public class ProductForm {
	private Long id;
	private String description;
	private double price;
	private boolean baja;

	public ProductForm(String des) {
		description = des;
	}

	public ProductForm() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean isBaja() {
		return baja;
	}

	public void setBaja(boolean baja) {
		this.baja = baja;
	}
}
