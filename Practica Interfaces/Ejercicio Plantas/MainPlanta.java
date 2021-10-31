package practica5;
import java.util.Scanner;

public class MainPlanta {
	

	public static void main(String[] args) {
		String nombre, tieneHojas, climaIdeal, variedad, tipoTronco, color, tipoHojas, colorPetalos, 
		colorPistilo, variedadDeFlor, estacion, esDomestico, variedadArbusto, colorHojas, sePoda; 
		int altoTallo, id, radioTronco, cantPetalos, anchoArbusto;
		Scanner lector = new Scanner(System.in);
		ArregloPlanta array = new ArregloPlanta();
		int opc;
		Flor f;
		Arbol a;
		Arbusto ar;
		
		do{	
			System.out.println("MENU DE OPCIONES");
			System.out.println("1- Ingresar planta");		
			System.out.println("2- Mostrar todos los elementos");
			System.out.println("3- Modificar planta");
			opc= lector.nextInt();
			
			switch(opc){
			
			case 1:
				
					System.out.println("1- Ingresar Arbol");
					System.out.println("2- Ingresar Flor");
					System.out.println("3- Ingresar Arbusto");
					opc= lector.nextInt();
					
					if(opc==1){
				
						System.out.println("Ingrese el nombre");
						nombre = lector.next();
						System.out.println("Ingrese el id");
						id = lector.nextInt();
						System.out.println("Ingrese la variedad");
						variedad = lector.next();
						System.out.println("Ingrese el tipo de tronco");
						tipoTronco = lector.next();
						System.out.println("¿Tiene hojas?");
						tieneHojas = lector.next();
						System.out.println("Ingrese el tipo de hojas");
						tipoHojas = lector.next();
						System.out.println("Ingrese el color");
						color = lector.next();
						System.out.println("Ingrese el clima ideal");
						climaIdeal = lector.next();
						System.out.println("Ingrese radio del tronco");
						radioTronco = lector.nextInt();
						System.out.println("Ingrese el alto del tallo");
						altoTallo = lector.nextInt();
						a = new Arbol(variedad, tipoTronco, color, tipoHojas, radioTronco, nombre, tieneHojas, climaIdeal, altoTallo, id);
						array.agregar(a);
					}
					if(opc==2){
						
						System.out.println("Ingrese el nombre");
						nombre = lector.next();
						System.out.println("Ingrese el id");
						id = lector.nextInt();
						System.out.println("Ingrese su variedad");
						variedadDeFlor = lector.next();
						System.out.println("Ingrese su estacion");
						estacion = lector.next();
						System.out.println("Ingrese el color de sus petalos");
						colorPetalos = lector.next();
						System.out.println("Ingrese su cantidad de petalos");
						cantPetalos = lector.nextInt();
						System.out.println("Ingrese el color del pistilo");
						colorPistilo = lector.next();
						System.out.println("¿Tiene hojas?");
						tieneHojas = lector.next();
						System.out.println("Ingrese el clima ideal");
						climaIdeal = lector.next();
						System.out.println("Ingrese el alto del tallo");
						altoTallo = lector.nextInt();
						f = new Flor(colorPetalos, colorPistilo, variedadDeFlor, estacion, cantPetalos, nombre, tieneHojas, climaIdeal, altoTallo, id);
						array.agregar(f);
														
					}else {
						System.out.println("Ingrese el nombre");
						nombre = lector.next();
						System.out.println("Ingrese el id");
						id = lector.nextInt();
						System.out.println("Ingrese su variedad");
						variedadArbusto = lector.next();
						System.out.println("Ingrese si es domestico");
						esDomestico = lector.next();
						System.out.println("Ingrese el clima ideal");
						climaIdeal = lector.next();
						System.out.println("¿Tiene hojas?");
						tieneHojas = lector.next();
						System.out.println("Ingrese el color de sus hojas");
						colorHojas = lector.next();
						System.out.println("¿Se poda?");
						sePoda = lector.next();
						System.out.println("Ingrese su ancho");
						anchoArbusto = lector.nextInt();
						System.out.println("Ingrese el alto del tallo");
						altoTallo = lector.nextInt();
						ar = new Arbusto(esDomestico, variedadArbusto, colorHojas, sePoda, anchoArbusto, nombre, tieneHojas, climaIdeal, altoTallo, id);
						array.agregar(ar);
					}		
					break;
					
			case 2:
				array.mostrar();
				break;
				
			case 3: 
				do {
					
					System.out.println("1- Modificar Arbol");
					System.out.println("2- Modificar Flor");
					System.out.println("3- Modificar Arbusto");
					opc= lector.nextInt();
					
					switch(opc){
					
					case 1:					
							System.out.println("Ingrese el nombre");
							nombre = lector.next();
							System.out.println("Ingrese el id");
							id = lector.nextInt();
							System.out.println("Ingrese la variedad");
							variedad = lector.next();
							System.out.println("Ingrese el tipo de tronco");
							tipoTronco = lector.next();
							System.out.println("¿Tiene hojas?");
							tieneHojas = lector.next();
							System.out.println("Ingrese el tipo de hojas");
							tipoHojas = lector.next();
							System.out.println("Ingrese el color");
							color = lector.next();
							System.out.println("Ingrese el clima ideal");
							climaIdeal = lector.next();
							System.out.println("Ingrese radio del tronco");
							radioTronco = lector.nextInt();
							System.out.println("Ingrese el alto del tallo");
							altoTallo = lector.nextInt();
							a = new Arbol(variedad, tipoTronco, color, tipoHojas, radioTronco, nombre, tieneHojas, climaIdeal, altoTallo, id);
							array.agregar(a);
					        
							break;
					case 2: 
						System.out.println("Ingrese el nombre");
						nombre = lector.next();
						System.out.println("Ingrese el id");
						id = lector.nextInt();
						System.out.println("Ingrese su variedad");
						variedadDeFlor = lector.next();
						System.out.println("Ingrese su estacion");
						estacion = lector.next();
						System.out.println("Ingrese el color de sus petalos");
						colorPetalos = lector.next();
						System.out.println("Ingrese su cantidad de petalos");
						cantPetalos = lector.nextInt();
						System.out.println("Ingrese el color del pistilo");
						colorPistilo = lector.next();
						System.out.println("¿Tiene hojas?");
						tieneHojas = lector.next();
						System.out.println("Ingrese el clima ideal");
						climaIdeal = lector.next();
						System.out.println("Ingrese el alto del tallo");
						altoTallo = lector.nextInt();
						f = new Flor(colorPetalos, colorPistilo, variedadDeFlor, estacion, cantPetalos, nombre, tieneHojas, climaIdeal, altoTallo, id);
						array.agregar(f);
						
						break;
						
					case 3: 
						System.out.println("Ingrese el nombre");
						nombre = lector.next();
						System.out.println("Ingrese el id");
						id = lector.nextInt();
						System.out.println("Ingrese su variedad");
						variedadArbusto = lector.next();
						System.out.println("Ingrese si es domestico");
						esDomestico = lector.next();
						System.out.println("Ingrese el clima ideal");
						climaIdeal = lector.next();
						System.out.println("¿Tiene hojas?");
						tieneHojas = lector.next();
						System.out.println("Ingrese el color de sus hojas");
						colorHojas = lector.next();
						System.out.println("¿Se poda?");
						sePoda = lector.next();
						System.out.println("Ingrese su ancho");
						anchoArbusto = lector.nextInt();
						System.out.println("Ingrese el alto del tallo");
						altoTallo = lector.nextInt();
						ar = new Arbusto(esDomestico, variedadArbusto, colorHojas, sePoda, anchoArbusto, nombre, tieneHojas, climaIdeal, altoTallo, id);
						array.agregar(ar);
						
					default: 
						System.out.println("Opcion invalida");
					
					}
					
					System.out.println("DESEA CONTINUAR CON EL PROGRAMA 1(SI) 0(NO)");
					opc= lector.nextInt();
					
				   }while(opc==1);	
							
						
				  
				break;
	       	    
		    default: 
				System.out.println("Opcion invalida");
			
			}
			
			System.out.println("DESEA CONTINUAR CON EL PROGRAMA 1(SI) 0(NO)");
			opc= lector.nextInt();
			
		   }while(opc==1);			
						
		}
		
	}

		



