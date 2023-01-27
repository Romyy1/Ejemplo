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
public class NIF {
    
    Scanner sc= new Scanner(System.in);
    
    int numeros;
    
    char letra;

    
    public NIF(){
        
        numeros=0;
        
        letra=' ';
    }
    
    public NIF(int numeros){
        
        this.numeros=numeros;
        
        int posicion=numeros%23;
        
        char letrac[]=new char[23];
        
        letrac[0]='T';
        letrac[1]='R';
        letrac[2]='W';
        letrac[3]='A';
        letrac[4]='G';
        letrac[5]='M';
        letrac[6]='Y';
        letrac[7]='F';
        letrac[8]='P';
        letrac[9]='D';
        letrac[10]='X';
        letrac[11]='B';
        letrac[12]='N';
        letrac[13]='J';
        letrac[14]='Z';
        letrac[15]='S';
        letrac[16]='Q';
        letrac[17]='V';
        letrac[18]='H';
        letrac[19]='L';
        letrac[20]='C';
        letrac[21]='K';
        letrac[22]='E';
        
        for(int i=0;i<23;i++){
            
           if(posicion==i){
               
               letra=letrac[i];
               
               System.out.println(letra);
           }
            
        }

    }

    public int getNumeros() {
        return numeros;
    }

    public char getLetra() {
        return letra;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    
    
    void mostrar(){
        
        System.out.println("Tu DNI es "+ numeros+"-"+letra); 
    }
    
    
    void pedir(){
        
        int cont=0;
        
        int comprob;
        
        do{
        
        System.out.println("Inserta los números de tu dni");
        
        numeros=sc.nextInt();
        
        comprob=numeros;
        
        while(comprob!=0){
            
            comprob=comprob/10;
            
            cont++;
        }
        
        }while(cont!=8);
        
        int posicion=numeros%23;
        
        char letrac[]=new char[23];
        
        letrac[0]='T';
        letrac[1]='R';
        letrac[2]='W';
        letrac[3]='A';
        letrac[4]='G';
        letrac[5]='M';
        letrac[6]='Y';
        letrac[7]='F';
        letrac[8]='P';
        letrac[9]='D';
        letrac[10]='X';
        letrac[11]='B';
        letrac[12]='N';
        letrac[13]='J';
        letrac[14]='Z';
        letrac[15]='S';
        letrac[16]='Q';
        letrac[17]='V';
        letrac[18]='H';
        letrac[19]='L';
        letrac[20]='C';
        letrac[21]='K';
        letrac[22]='E';
        
        for(int i=0;i<23;i++){
            
           if(posicion==i){
               
               letra=letrac[i];
               
               System.out.println(letra);
           }
            
        }
    }
    
}
