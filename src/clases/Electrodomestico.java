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
public class Electrodomestico {
    
    
    Scanner sc= new Scanner(System.in);
    
    int preciob=100;
    
    String color="blanco";
    
    char consumo='F';
    
    int peso=5;
    
    public Electrodomestico(){
        
        System.out.println("Esta opción tiene el color "+color+" ,como consumo "+consumo+" ,su peso es de "+peso+" kilos ,y su precio base es "+preciob+" euros");
  
    }
        
    public Electrodomestico(int preciob,String color,char consumo,int peso){
        
        this.comprobarconsumo();
        
        this.comprobarcolor();
        
        this.preciob=preciob;
        
        this.color=color;
        
        this.consumo=consumo;
        
        this.peso=peso;
    
    }
    
    void comprobarconsumo(){
        
        
        if(consumo!='A' && consumo!='B' && consumo!='C' && consumo!='D' && consumo!='E' && consumo!='F'){
            
            consumo='F';
            
            System.out.println("Ha introducido un consumo erroneo y se ha puesto el consumo "+consumo+" por defecto");
        }else{
            
            System.out.println("Su consumo es "+consumo);
        }
            
    }
    
    void comprobarcolor(){
        
        if(!"blanco".equals(color) && !"negro".equals(color) && !"rojo".equals(color) && !"azul".equals(color) && !"gris".equals(color)){
            
            color="blanco";
            
            System.out.println("Se ha puesto por defecto el color "+color+" ya que se ha introducido un color erroneo");
        }else{
            
            System.out.println("Su color es el "+color);
        }
        
    }
    
    void preciofinal(){
        
        int preciof=0;
        
        if(peso>=0 && peso<=19){
            
            preciof=preciob+10;
        }
        
        if(peso>=20 && peso<=49){
            
            preciof=preciob+50;
            
        }
        
        if(peso>=50 && peso<=79){
            
            preciof=preciob+80;
            
        }
        
        if(peso>=80){
            
            preciof=preciob+100;
            
        }
        
        if(consumo=='A'){
            
            preciof=preciof+100;
            
        }
        
        if(consumo=='B'){
            
            preciof=preciof+80;
            
        }
        
        if(consumo=='C'){
            
            preciof=preciof+60;
            
        }
        
        if(consumo=='D'){
            
            preciof=preciof+50;
            
        }
        
        if(consumo=='E'){
            
            preciof=preciof+30;
            
        }
        
        if(consumo=='F'){
            
            preciof=preciof+10;
            
        }
        
        System.out.println("El precio final de la operaciones de "+preciof+" euros");
        
    }
    
}
