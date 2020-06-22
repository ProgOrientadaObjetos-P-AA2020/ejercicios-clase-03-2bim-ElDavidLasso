/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        /*
        clase uno abstracta llamada Figura; con atributos:
        características y área; la clase debe tener un método
        abstracto calcular_area.
        - clase llamada Triángulo (hereda de Figura); con
        atributos: base y altura.
        - clase llamada Rombo (hereda de Figura) con atributo: diagonal_menor y 
        diagonal mayor.
        - clase llamada Cuadrado (hereda Figura) con: atributos: lado.
        - clase Ejecutor, que permite generar:
            4 objetos de tipo Cuadrado
            3 objetos de tipo Rombo
            5 objeto de Triángulo 
            Comprobar el concepto del polimorfismo.
        */
        Scanner sc = new Scanner(System.in);
        // Caracteristicas
        String c;
        //Cuadrado
        double l;
        //Rombo
        double dme, dma;
        //Triangulo
        double b,h;
        // inicio de la solución
        ArrayList<Figura> figuras = new ArrayList<>();
        
        for (int i = 0;i<4;i++) {
            System.out.print("Ingrese el valor del lado del cuadrado "+(i+1)+": ");
            l = sc.nextDouble();
            System.out.print("Ingrese las caracteristicas del cuadrado "+(i+1)+": ");
            c = sc.next();
            Cuadrado cuadra = new Cuadrado(c,l);
            cuadra.calcular_area();
            figuras.add(cuadra);
        }
        
        for (int i =0;i<3;i++){
            System.out.print("Ingrese el valor de la diagonal menor del rombo "+(i+1)+": ");
            dme= sc.nextDouble();
            System.out.print("Ingrese el valor de la diagonal mayor del rombo "+(i+1)+": ");
            dma= sc.nextDouble();
            System.out.print("Ingrese las caracteristicas del rombo "+(i+1)+": ");
            c = sc.next();
            Rombo rombo = new Rombo(c,dme,dma);
            rombo.calcular_area();
            figuras.add(rombo);
        }
        
        for (int i = 0;i<5;i++){
            System.out.print("Ingrese el valor de la base del triangulo"+(i+1)+": ");
            b = sc.nextDouble();
            System.out.print("Ingrese el valor de la altura del triangulo"+(i+1)+": ");
            h = sc.nextDouble();
            System.out.print("Ingrese las caracteristicas del triangulo"+(i+1)+": ");
            c = sc.next();
            Triangulo trian = new Triangulo(c,b,h);
            trian.calcular_area();
            figuras.add(trian);
        }
        // proceso para comprobar el polimorfismo
        for (int i = 0; i < figuras.size(); i++) {
            // 1.  
            figuras.get(i).calcular_area();
            
            System.out.printf("Datos de Figura\n"
                        + "%s\n",                        
                  figuras.get(i));
        }
    }
}
