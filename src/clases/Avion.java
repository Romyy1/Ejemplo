/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Alejandro
 */
public class Avion {
    
    String nombre;
    
    int motores;

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre = "Bloqueado";
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }
    
    public Avion(String nombre,int motores){
        
        this.nombre=nombre;
        
        this.motores=motores;
        
    }
    
    void imprimirFabricante(){
        
        System.out.println("El nombre del fabricante actual es "+nombre);
        
    }
    
    void cambiarFabricante(Avion a){
        
        this.nombre="Bloquedo";
        
    }
    
}
