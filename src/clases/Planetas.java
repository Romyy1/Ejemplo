/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Planetas {
    
    String nombre;
    
    int cantsat;
    
    double masakg;
    
    double vol;
    
    int diam;
    
    int distsol;
    
    String tipo;
    
    public Planetas(String nombre,int cantsat,double masakg,double vol,int diam,int distsol,String tipo){
        
        this.nombre=nombre;
        
        this.cantsat=cantsat;
        
        this.masakg=masakg;
        
        this.vol=vol;
        
        this.diam=diam;
        
        this.distsol=distsol;
        
        this.tipo=tipo;
    
    }
    
    void valores(){
        
        System.out.println("El planeta es "+nombre);
        
        System.out.println("Tiene "+cantsat+" satélites");
        
        System.out.println("Su masa es de "+masakg+" kg");
        
        System.out.println("Tiene un volumen de "+vol);
        
        System.out.println("Su diametro es de "+diam);
        
        System.out.println("Su distacia media al sol es de "+distsol+" millones de kilometros");
        
        System.out.println("El planeta es de tipo "+tipo);
    }
    
    void calculos(){
        
        System.out.println("La densidad de "+nombre+" es de "+(masakg/vol));
        
    }
    
    void asteroides(){
        
        int ua=149597870;
        
        int ast=distsol/ua;
        
        if(ast>2.1 && ast <3.4){
            
            System.out.println("Es un planeta exterior ya que se encuentra a "+ast+" ua del cinturón de asteroides");
        }else{
            
            System.out.println("No es un planeta exterior porque se encuentra a "+ast+" ua del cinturón de asteroides");
        }
       
    }
    
}
