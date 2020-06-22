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
public class Rombo extends Figura {
    double diagonalMenor;
    double diagonalMayor;
    
    public Rombo (String c, double dme, double dma){
        super(c);
        diagonalMenor = dme;
        diagonalMayor = dma;
    }
    
    public void establecerDiagonalMenor (double dme){
        diagonalMenor = dme;
    }
    
    public void establecerDiagonalMayor (double dma) {
        diagonalMayor = dma;
    }
    @Override
    public void calcular_area (){
        area = (diagonalMenor * diagonalMayor)/2;
    }
    
    public double obtenerDiagonalMenor (){
        return diagonalMenor;
    }
    
    public double obtenerDiagonalMayor (){
        return diagonalMayor;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Rombo \nDiagonal Menor: %.2f\nDiagonal Mayor: %.2f\n%s",diagonalMenor,diagonalMayor,super.toString());
        return cadena;
    }
}
