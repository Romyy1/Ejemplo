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
public class Cancion {
    
    Scanner sc = new Scanner(System.in);
    
    String titulo;
    
    String autor;
    
    public Cancion(String titulo, String autor){

            this.autor= autor;
            
            this.titulo=titulo;

}
    
    public Cancion(){
        
        autor=" ";
        
        titulo=" ";
        
    }
       
    void dameTitulo(){
    
        System.out.println("El titulo de la canción "+ titulo);
    
    }
    
    void dameAutor(){
        
        
        System.out.println("El autor de la canción es "+autor);
    }
        
    void ponTitulo(){
        
        System.out.println("¿Que titulo quieres añadir?");
        
        titulo=sc.nextLine();
    }
    
    void ponAutor(){
        
        System.out.println("¿Quien es el autor de la anterior canción?");
        
        autor=sc.nextLine();
        
    }
}
