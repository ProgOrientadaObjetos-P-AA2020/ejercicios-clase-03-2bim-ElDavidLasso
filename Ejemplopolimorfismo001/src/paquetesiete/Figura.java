package paquetesiete;
public abstract class Figura {
    protected String caracteristicas;
    protected double area;
    
    public Figura(String c){
        caracteristicas = c;
    }
    
    public void establecerCaracteristicas (String c){
        caracteristicas = c;
    }
    
    public abstract void calcular_area();
    
    public String obtenerCaracteristicas (){
        return caracteristicas;
    }
    
    public double obtenerArea (){
        return area;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Caracteristicas: %s \nArea: %.2f",caracteristicas,area);
        return cadena;
    }
}
