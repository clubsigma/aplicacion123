package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import java.util.*;

@Entity
public class Usuario extends Model {
	
	public String nombre;
	public String apellido;
	public String password;
	public String email;
	
	public Usuario(String nombre, String apellido, String password, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.email = email;
	}
	
	
    
}
