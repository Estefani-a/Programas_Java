package practica4;

public class ArregloMascota {
	Mascota arreglo []= new Mascota [100];
	int indice=0;
	
	
	public void agregar(Mascota m){
		if(indice<100){
			arreglo[indice]=m;
			indice++;
			System.out.println("Mascota agregada a la lista");
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
	
	public int  buscar(String nombre){
		int posi=-1;
		for (int i = 0; i < indice; i++) {
			if(arreglo[i].getNombre().equalsIgnoreCase(nombre)){
				posi=i;
			}
		}
		return posi;
	}
	
	public void modificar(int posicion, String nombre){
			arreglo[posicion].setNombre(nombre);
			System.out.println("Nombre modificado");	
	}	
}
