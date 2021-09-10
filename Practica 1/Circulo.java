import java.io.*;

/**
 * La clase circulo calcula y muestra
 * el area y el perametro de una circunferencia.
 * El radio se lee por consola.
 */

public class Circulo {
	

//Calcula el area y el perametro de un circulo

  public static void main (String[] args) {
    double radio = 0;		
    double area, circunf;
    radio = leeTeclado();	
    area = calculaArea(radio);	
    circunf = calculaCircunferencia(radio);
    muestraResultado(radio, area, circunf);
  }

  
//Calcula el area de un circulo
  public static double calculaArea(double r) {
    double a;
    a = Math.PI * (r * r);
    return a;
  }
  
//Calcula el perametro de un circulo

  public static double calculaCircunferencia(double r) {
    double c;
    c = 2 * Math.PI * r;
    return c;
  }

 //Lee el radio del circulo por teclado

  public static double leeTeclado() {
    double radio = 0;
    BufferedReader buffer = new 
              BufferedReader(new InputStreamReader(System.in));
    System.out.printf("Escribe el valor del radio: ");
    try {
      radio = Double.parseDouble(buffer.readLine());
    }
    catch (Exception e) {
      System.out.println("Error de lectura de datos");
    }
    return radio;
  }
    
  // Muestra el resultado
  public static void muestraResultado(double r, double area,
                                      double circunf) {
    System.out.println("Radio: " + r);
    System.out.println("Ã�rea: " + area);
    System.out.format("Circunferencia: %.2f\n", circunf);
  }
}
