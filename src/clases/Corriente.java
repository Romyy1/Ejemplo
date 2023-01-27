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
public class Corriente {
    
    Scanner sc= new Scanner(System.in);
    
    int DNI;
    
    String nombre;
    
    int saldo;
    
    public Corriente(int DNI,String nombre){
        
        this.DNI=DNI;
        
        this.nombre=nombre;
        
        saldo=0;
       
    }    

    void consultarsaldo(){
    
        System.out.println("Usted tiene "+ saldo +" en la cuenta");
        
        System.out.println(" ");
    
    }
    
    void ingreso(){
        
        System.out.println("Cuanto quiere ingresar");
        
        saldo=saldo+sc.nextInt();
        
        System.out.println("Ingreso realizado correctamente");
        
        System.out.println(" ");
        
    }
    
    void informacion(){
        
        System.out.println("Nombre: "+ nombre);
        
        System.out.println("DNI: "+DNI);
        
        System.out.println("Saldo= "+saldo);
        
        System.out.println(" ");
    }  
   
    void sacar(){
        
        System.out.println("Cuanto quiere sacar");
        
        saldo=saldo-sc.nextInt();
        
        if(saldo<0){
            
            System.out.println("Usted está en números rojos, tiene "+saldo+" en la cuenta");
            
            System.out.println(" ");
        }
        
    }
    
    void comparar(Corriente c){

        c.consultarsaldo();
        
        boolean comp = (saldo>c.saldo);
        
        System.out.println("En este caso la comparación es: "+comp);
        
    }
    
    void trans(Corriente c){
        
        this.consultarsaldo();
        
        c.consultarsaldo();
        
        System.out.println("Cuanto quieres transferir");
        
        int trans=sc.nextInt();
        
        int resta=0;
        
        if(trans<c.saldo){
        
        resta=c.saldo-trans; 
        }else{
            
            resta=c.saldo;
            
            c.saldo=0;
            
        }
        
        saldo=saldo+resta;
        
        System.out.println("La transferencia se ha realizado correctamente");
        
        System.out.println("Usted tiene "+saldo);
        
    }
      
    
}
