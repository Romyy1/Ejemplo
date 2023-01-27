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
public class Pedido {
    
    Scanner sc=new Scanner(System.in);
    
    String plato1,plato2,bebida,postre;
    
    double cplato1,cplato2,cbebida,cpostre;
    
    public Pedido(){
            
            int menu=0;
            
            do{
            
            System.out.println("¿Que menú quieres?");
            
            System.out.println("El menu 1 incluye primer plato y bebida");
            
            System.out.println("El menu 2 incluye primer plato, segundo y bebida");
            
            System.out.println("El menu 3 incluye primer plato,segundo,bebida y postre");
            
            menu=sc.nextInt();
            
            if(menu>3){
                
                System.out.println("Menú incorrecto, vuelva a hacer la selección");
                
                System.out.println(" ");
                
            } 
            
            if(menu==1){
                
                System.out.println("Seleccione entre los siguientes primeros platos:");
                
                System.out.println("Sopa,Crema de verduras,Ensalada");
                
                this.plato1=sc.next();
                
                System.out.println("Seleccione entre las siguientes bebidas:");
                
                System.out.println("Agua,Coca Cola,Cerveza");
                
                this.bebida=sc.next();
                
                if(this.plato1.equals("sopa")){
                    
                    this.cplato1=5;
                    
                }
                
                if(this.plato1.equals("cremadeverduras")){
                    
                    this.cplato1=5.6;
                    
                }
                
                if(this.plato1.equals("ensalada")){
                    
                    this.cplato1=4.6;
                    
                }
                
                if(this.bebida.equals("agua")){
                    
                    this.cbebida=1.8;
                    
                }
                
                if(this.bebida.equals("cocacola")){
                    
                    this.cbebida=2.4;
                    
                }
                
                if(this.bebida.equals("vino")){
                    
                    this.cbebida=2.5;
                    
                }
                
                this.uno();
                
                break;
                
            } 
            
            if(menu==2){
     
                System.out.println("Seleccione entre los siguientes primeros platos:");
                
                System.out.println("Sopa,crema de verduras,ensalada");
                
                this.plato1=sc.next();
                
                System.out.println("Seleccione entre los siguientes segundos platos");
                
                System.out.println("Solomillo,merluza,entrecot");
                
                this.plato2=sc.next();
                
                System.out.println("Seleccione entre las siguientes bebidas:");
                
                System.out.println("Agua,Coca Cola,Cerveza");
                
                this.bebida=sc.next();
                
                
                if(this.plato1.equals("sopa")){
                    
                    this.cplato1=5;
                    
                }
                
                if(this.plato1.equals("cremadeverduras")){
                    
                    this.cplato1=5.6;
                    
                }
                
                if(this.plato1.equals("ensalada")){
                    
                    this.cplato1=4.6;
                    
                }
                
                if(this.bebida.equals("agua")){
                    
                    this.cbebida=1.8;
                    
                }
                
                if(this.bebida.equals("cocacola")){
                    
                    this.cbebida=2.4;
                    
                }
                
                if(this.bebida.equals("vino")){
                    
                    this.cbebida=2.5;
                    
                }
                
                if(this.plato2.equals("solomillo")){
                    
                    this.cplato2=12.5;
                    
                }
                
                if(this.plato2.equals("entrecot")){
                    
                    this.cplato2=15;
                    
                }
                
                if(this.plato2.equals("merluza")){
                    
                    this.cplato2=13.5;
                    
                }
                
                this.dos();
                
                break;
            }
            
            if(menu==3){
                
                 System.out.println("Seleccione entre los siguientes primeros platos:");
                
                System.out.println("Sopa,crema de verduras,ensalada");
                
                this.plato1=sc.next();
                
                System.out.println("Seleccione entre los siguientes segundos platos");
                
                System.out.println("Solomillo,merluza,entrecot");
                
                this.plato2=sc.next();
                
                System.out.println("Seleccione entre las siguientes bebidas:");
                
                System.out.println("Agua,Coca Cola,Cerveza");
                
                this.bebida=sc.next();
                
                System.out.println("Seleccione entre los siguientes postres");
                
                System.out.println("Tarta de queso,tiramisu,helado");
                
                this.postre=sc.next(); 
                
                if(this.plato1.equals("sopa")){
                    
                    this.cplato1=5;
                    
                }
                
                if(this.plato1.equals("cremadeverduras")){
                    
                    this.cplato1=5.6;
                    
                }
                
                if(this.plato1.equals("ensalada")){
                    
                    this.cplato1=4.6;
                    
                }
                
                if(this.bebida.equals("agua")){
                    
                    this.cbebida=1.8;
                    
                }
                
                if(this.bebida.equals("cocacola")){
                    
                    this.cbebida=2.4;
                    
                }
                
                if(this.bebida.equals("vino")){
                    
                    this.cbebida=2.5;
                    
                }
                
                if(this.plato2.equals("solomillo")){
                    
                    this.cplato2=12.5;
                    
                }
                
                if(this.plato2.equals("entrecot")){
                    
                    this.cplato2=15;
                    
                }
                
                if(this.plato2.equals("merluza")){
                    
                    this.cplato2=13.5;
                    
                }
                
                if(this.postre.equals("tiramisu")){
                    
                    this.cpostre=5.5;
                    
                }
                
                if(this.postre.equals("tartadequeso")){
                    
                    this.cpostre=7.5;
                    
                }
                
                if(this.postre.equals("helado")){
                    
                    this.cpostre=3.5;
                    
                }
                
                this.tres();
                
                break;
            }
            
              
            }while(menu<4);
        
    }
     
        
    void uno(){
        
        double precio=cplato1+cbebida;
        
        System.out.println("El precio del menu uno con plato principal y bebida es: "+precio);
    }
    
    void dos(){
        
        double precio=cplato1+cbebida+cplato2;
        
        System.out.println("El precio del menu dos con plato principal, segundo plato y bebida es: "+precio);
        
    }
    
    void tres(){
        
        double precio=cplato1+cbebida+cplato2+cpostre;
        
        System.out.println("El precio del menu dos con plato principal, segundo plato,postre y bebida es: "+precio);
        
    }
    
    
}
