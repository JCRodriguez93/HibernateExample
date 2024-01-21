package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class User {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String name;
	
	@Column(name="apellidos")
	private String surname;
	
	@Column(name="direccion")
	private String direction;

	public User() {}
	public User(String name, String surname, String direction) {
		this.name = name;
		this.surname = surname;
		this.direction = direction;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", surname=" + surname + ", direction=" + direction + "]";
	}
	
	
	
	

}
