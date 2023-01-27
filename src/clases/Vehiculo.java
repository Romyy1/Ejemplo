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
public class Vehiculo {
    
    Scanner sc = new Scanner(System.in);
    
    String marca;
    
    int modelo;
    
    int motor;
    
    String combustible;
    
    String tipo;
    
    int puertas;
    
    int asientos;
    
    int velmax;
    
    String color;
    
    int velact=0;
    
    public Vehiculo(String marca, int modelo, int motor, String combustible, String tipo, int puertas, int asientos, int velmax, String color){
        
        this.modelo=modelo;
        
        this.marca=marca;
        
        this.motor=motor;
        
        this.combustible=combustible;
        
        this.tipo=tipo;
        
        this.puertas=puertas;
        
        this.asientos=asientos;
        
        this.velmax=velmax;
        
        this.color=color;
      
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public int getVelmax() {
        return velmax;
    }

    public void setVelmax(int velmax) {
        this.velmax = velmax;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelact() {
        return velact;
    }

    public void setVelact(int velact) {
        this.velact = velact;
    }
    
    void acelerar(){
        
        System.out.println("¿En cuanto aumentas la velocidad?");
        
        velact=sc.nextInt();
        
        if(velact>velmax){
            
            System.out.println("La velocidad maxima es "+velmax+" por lo que la pondremos como velocidad actual");
        }else{
            
            System.out.println("La velocidad actual es: "+velact+" km/h");
        }
        
    }
    
    void decelerar(){
        
        int dece;
        
        System.out.println("Cuanto decrementar la velocidad");
        
        dece=sc.nextInt();
        
        velact=velact-dece;
        
        if(velact<0){
            
            velact=0;
            
            System.out.println("No es posible ir a velocidad negativa por lo que la velocidad actual es "+velact);
        }else{
            
            System.out.println("La velocidad actual es "+velact+" km/h");
        }
        
    }
    
    void frenar(){
        
        velact=0;
        
        
        System.out.println("Velocidad actual: "+velact+" km/h");
    }
    
    void distancia(){
        
        int distancia;
        
        System.out.println("Cuanta distancia vas a recorrer (en km)");
        
        distancia=sc.nextInt();
        
        distancia=distancia/velact;
        
        if(distancia==0){
            
            System.out.println("No llegas nunca crack");
        }else{
            
            System.out.println("Vas a tardar "+distancia+" horas en llegar");
            
        }
        
    }
    
    void estado(){
        
        System.out.println("La marca del coche es "+marca);
        
        System.out.println("El año del coche es "+modelo);
        
        System.out.println("El volumen de litros del cilindraje del motor es "+motor);
        
        System.out.println("Utiliza "+combustible+" como combustible");
        
        System.out.println("El coche es de tipo "+tipo);
        
        System.out.println("Tiene "+puertas+" puertas");
        
        System.out.println("La velocidad máxima es "+velmax+" km/h");
        
        System.out.println("El color del coche es "+color);
        
    }
    
}
