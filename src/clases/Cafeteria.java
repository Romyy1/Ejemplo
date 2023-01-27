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
public class Cafeteria {
    
    Scanner sc= new Scanner(System.in);
    
    int capacidadmax;
    
    int capacidadact;
    
    
    public Cafeteria(){
        
        capacidadmax=1000;
        
        capacidadact=0;
        
    }
    
    public Cafeteria(int capacidadmax, int capacidadact){
        
        if(capacidadact>capacidadmax){
            
            this.capacidadact = capacidadmax;
            
        }
        this.capacidadmax = capacidadmax;
    }   
    void llenarCafetera(){
        
        
        capacidadact=capacidadmax;
    }
    
    
    void servirtaza(){
        
        int cant;
        
        System.out.println("¿Cuanta cantidad quieres?");
        
        cant=sc.nextInt();
        
        if(cant>capacidadact){
            
            cant=capacidadact;
            
            System.out.println("No tenemos cafe suficiente, pero le servimos "+cant+" que es la que nos queda");
            
            capacidadact=0;
        }
        
    }
    
    void vaciarCafetera(){
        
        capacidadact=0;
        
    }
    
    void agregarcafe(){
        
        System.out.println("¿Cuanto cafe quieres añadir a la cafetera?");
        
        capacidadact=sc.nextInt();
        
        if(capacidadact>capacidadmax){
            
            capacidadact=capacidadmax;
        }
        
    }
      
    void consultar(){
        
        System.out.println("Actualmente hay "+capacidadact+" cc de cafe");
    }
    
    }
        
    
    
    
    

