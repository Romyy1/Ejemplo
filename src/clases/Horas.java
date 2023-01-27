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
public class Horas {
    
    Scanner sc = new Scanner(System.in);
    
    int horas;
    
    int min;
    
    int seg;
    
    public Horas(){
        
        System.out.println("¿Que horas es?");
        
        horas = sc.nextInt();
        
        System.out.println("¿Que minutos hay?");
        
        min= sc.nextInt();
        
        System.out.println("¿Y cuantos segundos han pasado?");
        
        seg=sc.nextInt();
    }
    
    void segundos(){

        
        int cont=0;
        
        int sumar;
        
        System.out.println("¿Cuantos segundos quieres sumar?");
        
        sumar=sc.nextInt();
        
        do{
        System.out.println(horas+" "+min+" "+seg);
        
        seg=seg+1;

        if(seg>=60){

            min=min+1;
            
            seg=seg-60;
        }

        
        if(min>=60){
        
            horas=horas+1;
            
            min=min-60;
        }
        
        if(horas>=24){
                
                    
                horas=horas-24;    
                    
        }
        
        cont++;
        
      }while(cont<=sumar);
 
    }
}
