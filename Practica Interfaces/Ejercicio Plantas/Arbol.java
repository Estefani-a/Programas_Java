package practica5;

public class Arbol extends Planta implements DoyFrutos, SoyVenenoso {
	String variedad, tipoTronco, color, tipoHojas;
	int radioTronco;
	
	//Construtor
	public Arbol(String variedad, String tipoTronco, String color, String tipoHojas, int radioTronco,String nombre, String tieneHojas, String climaIdeal, int altoTallo, int id) {
		super(nombre, tieneHojas, climaIdeal, altoTallo, id);
		
		this.variedad = variedad;
		this.tipoTronco = tipoTronco;
		this.color = color;
		this.tipoHojas = tipoHojas;
		this.radioTronco = radioTronco;
		
	}
	
	public Arbol() {
		
	}
	
	//Metodos

	public String getVariedad() {
		return variedad;
	}

	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}

	public String getTipoTronco() {
		return tipoTronco;
	}

	public void setTipoTronco(String tipoTronco) {
		this.tipoTronco = tipoTronco;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoHojas() {
		return tipoHojas;
	}

	public void setTipoHojas(String tipoHojas) {
		this.tipoHojas = tipoHojas;
	}

	public int getRadioTronco() {
		return radioTronco;
	}

	public void setRadioTronco(int radioTronco) {
		this.radioTronco = radioTronco;
	}

	
	public String toString() {
		return "Arbol [variedad=" + variedad + ", tipoTronco=" + tipoTronco + ", color=" + color + ", tipoHojas="
				+ tipoHojas + ", radioTronco=" + radioTronco + "]";
	}

	@Override
	public void queSoy() {
		System.out.println("Hola soy un arbol");
		
	}

	@Override
	public void envenenar() {
		System.out.println("Soy un arbol y algunas de mis especies son venenosas");
	}

	@Override
	public void darFrutos() {
		
	}

	
	
	
	
	
	
	
}
