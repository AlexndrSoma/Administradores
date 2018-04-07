/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administradores;

/**
 *
 * @author alex
 */
public class Administradores {
    private String Nombre;
    
    public Administradores(String Nom){
        this.Nombre = Nom;     
    }
    
    
 public void setNombre(String Nom) {
        this.Nombre = Nom;
    }


    //GETTERS
    
    public String getNombre() {
        return this.Nombre;  
    }
    
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
