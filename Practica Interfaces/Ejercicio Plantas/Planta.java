package practica5;

public abstract class Planta {
	private String nombre, tieneHojas, climaIdeal;
	private int altoTallo, id;
	
	//Constructor
	public Planta(String nombre, String tieneHojas, String climaIdeal, int altoTallo, int id) {
		this.nombre = nombre;
		this.tieneHojas = tieneHojas;
		this.climaIdeal = climaIdeal;
		this.altoTallo = altoTallo;
		this.id = id;
		
	}
	
	public Planta() {
		
	}
	
	//Metodos

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTieneHojas() {
		return tieneHojas;
	}

	public void setTieneHojas(String tieneHojas) {
		this.tieneHojas = tieneHojas;
	}

	public String getClimaIdeal() {
		return climaIdeal;
	}

	public void setClimaIdeal(String climaIdeal) {
		this.climaIdeal = climaIdeal;
	}

	public int getAltoTallo() {
		return altoTallo;
	}

	public void setAltoTallo(int altoTallo) {
		this.altoTallo = altoTallo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String toString() {
		return "Planta [nombre=" + nombre + ", tieneHojas=" + tieneHojas + ", climaIdeal=" + climaIdeal + ", altoTallo="
				+ altoTallo + ", id=" + id + "]";
	}
	
	public abstract void queSoy();
	
	//Interfaces
	
	public void DoyFrutos() {
		
	}
	
	public void MeRegalan() {
		
	}
	
	public void SoyVenenoso() {
		
	}
	
	

}
