/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

/**
 *
 * @author reroes
 */
public class Cuadrado extends Figura{
       double lado;
       
       public Cuadrado (String c, double l){
           super(c);
           lado = l;
       }
       
       public void establecerLado(double l){
           lado = l;
       }
       
       @Override
       public void calcular_area(){
           area = Math.pow(lado,2);
       }
       
       public double obtenerLado(){
           return lado;
       }
    @Override
    public String toString(){
        String cadena;
           cadena = String.format ("Cuadrado \nLado: %.2f\n%s",lado, super.toString());
        return cadena;
    }
}
