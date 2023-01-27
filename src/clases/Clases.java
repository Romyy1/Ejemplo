/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
    /* Ejercicio 1
    Superheroe pepe = new Superheroe("Pepe");
    System.out.println(pepe.nombre);
    */
    /*
    Corriente cuenta = new Corriente(23432352,"Pedro");
    
    cuenta.ingreso();
    
    cuenta.consultarsaldo();
    
    cuenta.sacar();
    
    cuenta.informacion();
    */
    
    /* Ejercicio 3
    Cancion cantar1 = new Cancion();
    
    cantar1.dameTitulo();
    
    cantar1.dameAutor();
    
    Cancion cantar = new Cancion("La bachata", "Manuel Turizo");
    
    cantar.dameTitulo();
    
    cantar.dameAutor();
    
    cantar.ponTitulo();
    
    cantar.ponAutor();
    
    cantar.dameAutor();
    
    cantar.dameTitulo();
    */
    /* Ejercicio 4
    Cafeteria erchus = new Cafeteria();
    
    erchus.consultar();
    
    erchus.agregarcafe();
    
    erchus.consultar();
    
    erchus.servirtaza();
    
    erchus.consultar();
    
    erchus.llenarCafetera();
    
    erchus.consultar();
    
    erchus.vaciarCafetera();
    
    erchus.consultar();
    */
    /*Ejercicio 5
    Horas prueba= new Horas();
    
    prueba.segundos();
    */
    /*Ejericio 6
    NIF dni= new NIF(44918837);
    
    dni.pedir();
    */
    /* Ejercicio 7
    Scanner sc= new Scanner(System.in);
    
    Electrodomestico television= new Electrodomestico();
    
        System.out.println("Introduce el precio base de la lavadora");
        
        int preciob=sc.nextInt();
        
        System.out.println("Introduce el color de la lavadora dentro de negro,gris,azul,blaco y rojo");
        
        String color=sc.nextLine();
        
        System.out.println("Introduce el consumo de la lavadora");
        
        char consumo=sc.next().charAt(0);
        
        System.out.println("Introduce el peso de la lavadora");
        
        int peso=sc.nextInt();
    
    
    Electrodomestico lavadora= new Electrodomestico(preciob,color,consumo,peso);
    
    lavadora.comprobarconsumo();
    
    lavadora.comprobarcolor();
    
    lavadora.preciofinal();
    
    television.comprobarconsumo();
    
    television.comprobarcolor();
    
    television.preciofinal();
    */
    /* Ejercicio 7
        System.out.println("Cual es el planeta");
        
        String nombre=sc.nextLine();
        
        System.out.println("Cual es la cantidad de satélites del planeta");
        
        int cantsat=sc.nextInt();
        
        System.out.println("Cual es la masa en kg del planeta");
    
        double masakg=sc.nextDouble();
        
        System.out.println("Cual es el volumen del planeta");
    
        double vol=sc.nextDouble();
        
        System.out.println("Cual es el diametro del planeta");
    
        int diam=sc.nextInt();
        
        System.out.println("Cual es la distancia media al sol en millones de kilómetros planeta");
    
        int distsol=sc.nextInt();  
        
        System.out.println("Cual es el tipo de planeta");
    
        String tipo=sc.next();
        
        Planetas tierra = new Planetas(nombre, cantsat ,masakg ,vol , diam , distsol , tipo);
        
        tierra.valores();
        
        tierra.asteroides();
        
        tierra.calculos();
        */
        /* Ejercicio 8
        System.out.println("Que marca es");
        
        String marca=sc.next();
        
        System.out.println("De que año es modelo de coche");
        
        int modelo=sc.nextInt();
        
        System.out.println("Que motor tiene el coche");
        
        int motor=sc.nextInt();
        
        System.out.println("Que combustible utiliza el coche dentro de los siguientes: gasolina, bioetanol, diésel, biodiésel, gas natural");
        
        String combustible=sc.next();
        
        System.out.println("Que tipo de coche es entre los siguientes: carro de ciudad, subcompacto, compacto, familiar, ejecutivo");
        
        String tipo=sc.next();
        
        System.out.println("¿Cuantas puertas tiene?");
        
        int puertas=sc.nextInt();
        
        System.out.println("¿Cual es la velocidad máxima?");
        
        int velmax=sc.nextInt();
        
        System.out.println("¿Cuantos asientos tiene?");
        
        int asientos=sc.nextInt();
        
        System.out.println("Que color tiene el coche dentro de los siguientes: blanco, negro, rojo, naranja, amarillo, verde, azul, violeta");
        
        String color=sc.next();
        
        Vehiculo coche = new Vehiculo(marca,modelo,motor,combustible,tipo,puertas,asientos,velmax,color);
        
        coche.acelerar();
        
        coche.decelerar();
        
        coche.distancia();
        
        coche.frenar();
        
        coche.estado();
        */
        /*Ejercicio 9
        int pos;
        
        do{
            System.out.println("Que quieres hacer?");
            
            System.out.println("1 Calcular circulo");
            
            System.out.println("2 Calcular rectangulo");
            
            System.out.println("3 Calcular cuadrado");
            
            System.out.println("4 Calcular triangulo");
            
            System.out.println("5 Salir");
            
            pos=sc.nextInt();
            
            if(pos==1){

                System.out.println("¿Cual es el radio?");
 
                double radio=sc.nextDouble();
                
                Figuras circulo=new Figuras(radio);
                
                System.out.println(" ");
            }
            
            if(pos==2){
                
                System.out.println("¿Cual es la base del rectangulo?");
                
                double base=sc.nextDouble();
                
                System.out.println("¿Cual es la altura del rectangulo?");
                
                double alt=sc.nextDouble();
                
                Figuras rectangulo=new Figuras(base,alt);
                
                System.out.println(" ");
                
            }
            
            if(pos==3){
                
                System.out.println("¿Cual es el lado del cuadrado?");
                
                double lad=sc.nextDouble();
                
                Figuras cuadrado= new Figuras(lad,pos);
                
                System.out.println(" ");
                
            }
            
            if(pos==4){
                
                System.out.println("¿Cual es las base del triangulo?");
                
                double base=sc.nextDouble();
                
                System.out.println("¿Cual es la altura del triangulo?");
                
                double alt=sc.nextDouble();
                
                Figuras triangulo= new Figuras(base,alt,pos);
                
                System.out.println(" ");
            }
            
            if(pos==5){
                
                System.out.println("Hasta luego!");
                
            }
            
        }while(pos!=5);
        */
        /*Ejercicio 10
        Corriente cuenta = new Corriente(23432352,"Pedro");
    
        cuenta.ingreso();
    
        cuenta.consultarsaldo();
    
        cuenta.sacar();
    
        cuenta.informacion();

        Corriente nueva=new Corriente(384845859,"Juan");
    
        nueva.ingreso();
    
        nueva.consultarsaldo();
        
        nueva.comparar(cuenta);
        
        nueva.trans(cuenta);
        
        cuenta.consultarsaldo();
        */
        /* Ejercicio 11
        System.out.println("¿Cual es el nombre de la pelicula?");
        
        String nombre=sc.next();
        
        System.out.println("¿Cual es el nombre del director?");
        
        String director=sc.next();
        
        System.out.println("¿Cual es el genero de la pelicula?");
        
        String genero=sc.next();
        
        System.out.println("¿Cual es la duracion de la pelicula?");
        
        double duracion=sc.nextDouble();
        
        System.out.println("¿Cual es el año de estreno de la pelicula?");
        
        int ano=sc.nextInt();
        
        System.out.println("¿Cual es la calificacion de la pelicula?");
        
        int cali=sc.nextInt();
        
        Pelicula uno=new Pelicula(nombre,director,genero,duracion,ano,cali);
        
        uno.consultar();
        
        uno.epica();
        
        uno.valoracion();
        
        System.out.println("¿Cual es el nombre de la pelicula?");
        
        String nombre2=sc.next();
        
        System.out.println("¿Cual es el nombre del director?");
        
        String director2=sc.next();
        
        System.out.println("¿Cual es el genero de la pelicula?");
        
        String genero2=sc.next();
        
        System.out.println("¿Cual es la duracion de la pelicula?");
        
        double duracion2=sc.nextDouble();
        
        System.out.println("¿Cual es el año de estreno de la pelicula?");
        
        int ano2=sc.nextInt();
        
        System.out.println("¿Cual es la calificacion de la pelicula?");
        
        int cali2=sc.nextInt();
        
        Pelicula dos=new Pelicula(nombre2,director2,genero2,duracion2,ano2,cali2);
        
        dos.consultar();
        
        dos.epica();
        
        dos.valoracion();
        
        dos.esSimilar(uno);
        */
        /*Ejercicio 12
        Avion a1=new Avion("Airbus",4);
        
        Avion a2=new Avion("bloqueado",4);
        
        a1.imprimirFabricante();
        
        a2.imprimirFabricante();
        
        a1.setNombre();
        
        a2.cambiarFabricante(a2);
        
        System.out.print("El nombre anterior era 'bloqueado' ");a1.imprimirFabricante();
        
        System.out.print("El nombre anterior era 'bloqueado' ");a2.imprimirFabricante();
        */
        /*Ejercicio 13
        Pedido menu=new Pedido();
        */
        
    }
}
