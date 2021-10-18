package practica4;

public class Mascota {
	private String nombre, raza;
	private int edad;
	
	Mascota(){
		
	}
	
	public Mascota(String nombre, String raza, int edad) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String toString() {
		return "Mascota [nombre=" + nombre + ", raza=" + raza + ", edad="+ edad + "]";
	}
}




