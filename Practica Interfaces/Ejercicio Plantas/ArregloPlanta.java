package practica5;

import java.util.Scanner;

public class ArregloPlanta {
	Scanner lector = new Scanner(System.in);
	
	Planta arreglo [] = new Planta[100];
	int indice = 0;
	int opc;
	
	public void agregar(Planta p){
		if(indice<100){
			arreglo[indice]=p;
			indice++;
			System.out.println("Planta agregada a la lista");
		}
		else{
			System.out.println("Vector lleno, no se puede agregar");
		}
	}
	
	public void mostrar(){
		for (int i = 0; i < indice; i++) {
			System.out.println(arreglo[i].toString());
		}
	}

}
