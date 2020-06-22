
package paqueteseis;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
        */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        int c = 0;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        
        // inicio de solución       
        
        System.out.println("Establezca el numero de estudiantes que desea "
                + "ingresar: ");
        System.out.print("Numero de Estudiantes Presencial:");
        int numestpresencial=entrada.nextInt();
        System.out.print("Numero de Estudiantes Distancia: ");
        int numestdistancia=entrada.nextInt();
        
        int j=0;
        int k=numestpresencial;
        
        do{
        System.out.print("\nSeleccione el Tipo de estudiante que desea ingresar:\n"
                + "1. Estudiantes Presencial\n"
                + "2. Estudiantes Distancia\n3. SALIR\nOpcion:");
        tipoEstudiante=entrada.nextInt();
        System.out.println();
        switch (tipoEstudiante){
            
            case 1: 
                    if(j<numestpresencial){
                        System.out.println("Estudiantes Presencial");
                        System.out.print("Nombre: ");
                        nombresEst=entrada.next();
                        System.out.print("Apellidos: ");
                        apellidosEst=entrada.next();
                        System.out.print("Identificacion: ");
                        identificacionEst=entrada.next();
                        System.out.print("Edad: ");
                        edadEst=entrada.nextInt();
                        System.out.print("Costo de Credito: ");
                        costoCred=entrada.nextDouble();
                        System.out.print("Numero de Creditos: ");
                        numeroCreds=entrada.nextInt();
                        
                        EstudiantePresencial estudianteP = new EstudiantePresencial(nombresEst,apellidosEst);
                        
                        estudianteP.establecerIdentificacionEstudiante(identificacionEst);
                        estudianteP.establecerEdadEstudiante(edadEst);
                        estudianteP.establecerNumeroCreditos(numeroCreds);
                        estudianteP.establecerCostoCredito(costoCred);
                        
                        estudiantes.add(estudianteP);
                        j++;
                        c++;
                    }
                    else{
                        System.out.println("\nLista LLena");
                    }
                    
                break;
                
            case 2:
                
                if(k<(numestpresencial+numestdistancia)){
                    System.out.println("Estudiantes Distancia");
                    System.out.print("Nombre: ");
                    nombresEst=entrada.next();
                    System.out.print("Apellidos: ");
                    apellidosEst=entrada.next();
                    System.out.print("Identificacion: ");
                    identificacionEst=entrada.next();
                    System.out.print("Edad: ");
                    edadEst=entrada.nextInt();
                    System.out.print("Ingrese el número de asignaturas: ");
                    numeroAsigs = entrada.nextInt();
                    System.out.print("Ingrese el costo de cada cada asignatura: ");
                    costoAsig = entrada.nextDouble();

                    EstudianteDistancia estudianteD = new EstudianteDistancia(nombresEst,apellidosEst);
                    
                    estudianteD.establecerIdentificacionEstudiante(identificacionEst);
                    estudianteD.establecerEdadEstudiante(edadEst);
                    estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                    estudianteD.establecerCostoAsignatura(costoAsig);
                    
                    estudiantes.add(estudianteD);
                    k++;
                    c++;
                }
                else{
                        System.out.println("\nLista LLena");
                    }
                
                break;
                
            case 3: c =(numestpresencial+numestdistancia);
                break;
            
            
        }
            
        }while(c <(numestpresencial+numestdistancia));
        
        
        
        
        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();  
        }
        for (int i = 0; i < estudiantes.size(); i++) {
            if(i==0){
                System.out.println("\nEstudiantes Presencial");
            }
            
            System.out.printf("Datos Estudiante\n"
                        + "Nombres: %s\n"
                        + "Apellidos: %s\n"
                        + "Identificación: %s\n"
                        + "Edad: %d\n"
                        + "Costo Matricula: %.2f\n\n",
                  estudiantes.get(i).obtenerNombresEstudiante(),
                  estudiantes.get(i).obtenerApellidoEstudiante(),
                  estudiantes.get(i).obtenerIdentificacionEstudiante(),
                  estudiantes.get(i).obtenerEdadEstudiante(),
                  estudiantes.get(i).obtenerMatricula());
            
             if(i==numestpresencial-1){
                System.out.println("-------------------------");
                System.out.println("Estudiantes Distancia\n");
            }
            
            
        }
        
    }

}