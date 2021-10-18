package practica4;
import java.util.Scanner;

public class MainMascota {
	public static void main(String[] args) {
		
		String nombre, raza;
		int edad, opc, retorno;
		Mascota p;
		Scanner lector = new Scanner(System.in);
		ArregloMascota array = new ArregloMascota();
		
		do{	
			System.out.println("MENU DE OPCIONES");
			System.out.println("1- AGREGAR MASCOTA");
			System.out.println("2- MOSTRAR DATOS DE MASCOTA");
			System.out.println("3- CAMBIAR NOMBRE MASCOTA");
			System.out.println("4- MOSTRAR MASCOTAS TIPO PERRO");
			System.out.println("5- ELIMINAR MASCOTA");
			opc= lector.nextInt();
			
			switch(opc){
			
				case 1:
						System.out.println("Ingrese el nombre");
						nombre = lector.next();
						System.out.println("Ingrese la raza");
						raza = lector.next();
						System.out.println("Ingrese la edad");
						edad = lector.nextInt();
						
						p = new Mascota(nombre, raza, edad);
						array.agregar(p);
					
						break;
				case 2:
						array.mostrar();
						break;
				case 3: System.out.println("Ingrese el nombre a buscar");
				         nombre = lector.next();
				         retorno = array.buscar(nombre);
				         if(retorno>=0){
				        	 System.out.println("Ingrese el nuevo nombre de la mascota");
					         nombre = lector.next();
					         
					         array.modificar(retorno, nombre);
				         }
				         else{
				        	 System.out.println("Mascota no encontrada");
				         }
						
						break;
				case 4: 
						break;
				case 5: 
						break;
				default: 
						System.out.println("Opcion invalida");
				
			}
			
			System.out.println("DESEA CONTINUAR CON EL PROGRAMA 1(SI) 0(NO)");
			opc= lector.nextInt();
			
			
			
		}while(opc==1);		
	}
}

