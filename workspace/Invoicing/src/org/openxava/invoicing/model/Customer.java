package org.openxava.invoicing.model;

import javax.persistence.*;
import org.openxava.annotations.*;

@Entity // Esto marca la clase Customer como una entidad
public class Customer {
	@Id // La propiedad number es la clave. Las claves son obligatorias
		// (required) por defecto
	@Column(length = 6) // La longitud de columna se usa a nivel UI y a nivel DB
	private int number;

	@Column(length=50) // La longitud
	private String name;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}