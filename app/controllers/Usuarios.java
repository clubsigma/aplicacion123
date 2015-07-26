package controllers;

import java.util.List;

import models.Usuario;
import play.mvc.*;

public class Usuarios extends Controller {

    public static void index() {
    	List<Usuario> usuarios=Usuario.findAll();
        render(usuarios);
    }
    
    public static void registro(){
    	render();
    }
    
    public static void guardar(String nombre, String apellido,
    		String password, String email){
    	
    	Usuario usuarioNuevo=new Usuario(nombre,apellido,password,email);
    	usuarioNuevo.save();
    	index();
    	
    	
    	
    }
    
    
    public static void eliminar(long id){
    	Usuario usuarioEliminar=Usuario.findById(id);
    	usuarioEliminar.delete();
    	index();
    	
    }
    
    

}
