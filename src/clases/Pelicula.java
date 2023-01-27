/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Alejandro
 */
public class Pelicula {
    
    String nombre,director,genero;
    
    int ano,cali;
    
    double duracion;
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuración(double duración) {
        this.duracion = duración;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getCali() {
        return cali;
    }

    public void setCali(int cali) {
        this.cali = cali;
    }
    
    public Pelicula(String nombre,String director,String genero,double duracion,int ano,int cali){
        
        this.nombre=nombre;
        this.ano=ano;
        this.director=director;
        this.genero=genero;
        this.duracion=duracion;
        this.cali=cali;
        
    }
    
    void consultar(){
        
        System.out.println("La pelicula es "+nombre);
        
        System.out.println("El director es "+director);
        
        System.out.println("Su año de estreno es "+ano);
        
        System.out.println("El genero de la pelicula es "+genero);
        
        System.out.println("La pelicula dura "+duracion);
        
        System.out.println("La calificación de la pelicula es "+cali);  
    }
    
    void epica(){
        
        boolean epc=duracion>3;
        
        if(epc==true){
            
            System.out.println("La pelicula es epica");
            
        }else{
            
            System.out.println("La pelicula no es epica");
            
        }
        
    }
    
    void valoracion(){
        
        if(cali==0 && cali<=2){
            
            System.out.println("La valoración es muy mala");
            
        }
        
        if(cali>=3 && cali<=5){
            
            System.out.println("La valoración es regular");
            
        }
        
        if(cali>=6 && cali<=8){
            
            System.out.println("La valoración es buena");
            
        }
        
        if(cali>=9 && cali<=10){
            
            System.out.println("La valoración es muy buena");
            
        }
         
    }
    
    void esSimilar(Pelicula c){
        
        boolean ho=c.cali==this.cali && c.genero.equals(this.genero);
        
        if(ho==true){
            
            System.out.println("Los valores genero y calificacion son iguales");
        }else{
            
            System.out.println("Los valores genero y calificacion no son iguales");
        }
        
    }
    
  
}
