/*Realizar un programa que permita a un profesor calcular el promedio de un alumno. Para esto, el algoritmo debe 
permitir ingresar las 4 notas del mismo (por ejemplo, 8, 7, 9.50 y 10), luego calcular el promedio de las mismas y 
mostrar el resultado por pantalla. Se recuerda que el promedio es la suma de todas las notas dividido la cantidad, en 
el ejemplo sería: (8+7+9.50+10)/4.*/

package practica1;

import java.util.Scanner;

public class Promedio{

    public static void main(String[] args){
        float nota1, nota2, nota3, nota4, promedio;
        int totalNota;

        Scanner lector=new Scanner(System.in);

        System.out.println("Ingrese la primera nota: ");
        nota1 = lector.nextFloat();
        System.out.println("Ingrese la segunda nota: ");
        nota2 = lector.nextFloat();
        System.out.println("Ingrese la tercera nota: ");
        nota3 = lector.nextFloat();
        System.out.println("Ingrese la cuarta nota: ");
        nota4 = lector.nextFloat();
        
        totalNota = 4;
        promedio = ((nota1 + nota2 + nota3 + nota4) / totalNota);
        System.out.println("El promedio de las notas es: " +promedio);


    }
}
