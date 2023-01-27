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
public class Figuras {
    
    double radio,baser,altr ,ladc,baset,altt;
    
    int pos;
    
    public Figuras(double radio){
        
      double pi;
       
       pi=3.14159;
       
       double area=pi*(radio*radio);
       
        System.out.println("El area del círculo es "+area);
        
    }
    
    public Figuras(double baser,double altr){
        
        this.baser=baser;
        
        this.altr=altr;
        
        double area=baser*altr;
        
        System.out.println("El area del rectangulo es "+area);
        
        this.hipot();
        
    }
    
    void hipot(){
        
        
        double suma=(baser*baser)+(altr*altr);
        
        double hipo=(Math.sqrt(suma));
        
        System.out.println("La hipotenusa del rectangulo es "+hipo);
        
    }
    
    public Figuras(double ladc,int pos){
        
        double area=ladc*ladc;
        
        System.out.println("El area del cuadrado es "+area);
        
    }
    
    public Figuras(double baset,double altt,int pos){
        
        double area=(baset*altt)/2;
        
        System.out.println("El area del triangulo es "+area);
        
        double suma=((baset/2)*(baset/2))+(altt*altt);
        
        double hipo=(Math.sqrt(suma));
        
        if(baset==hipo && hipo==altt && baset==altt){
            
            System.out.println("El triangulo es equilatero");
            
        }else if(hipo!=altt && altt!=baset && baset!=hipo){
            
            System.out.println("El triangulo es escaleno");
            
        }
        else System.out.println("El triangulo es isosceles");
        
    }
    
}
