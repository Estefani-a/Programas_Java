package practica5;

public class Arbusto extends Planta implements SoyVenenoso, DoyFrutos {
	String esDomestico, variedadArbusto, colorHojas, sePoda;
	int anchoArbusto;
	
	//Constructor
	public Arbusto(String esDomestico, String variedadArbusto, String colorHojas, String sePoda, int anchoArbusto, String nombre, String tieneHojas, String climaIdeal, int altoTallo, int id) {
		super(nombre, tieneHojas, climaIdeal, altoTallo, id);
		
		this.esDomestico = esDomestico;
		this.variedadArbusto = variedadArbusto;
		this.colorHojas = colorHojas;
		this.sePoda = sePoda;
		this.anchoArbusto = anchoArbusto;
	}
	
	public Arbusto() {
		
	}
	
	//Metodos

	public String getEsDomestico() {
		return esDomestico;
	}

	public void setEsDomestico(String esDomestico) {
		this.esDomestico = esDomestico;
	}

	public String getVariedadArbusto() {
		return variedadArbusto;
	}

	public void setVariedadArbusto(String variedadArbusto) {
		this.variedadArbusto = variedadArbusto;
	}

	public String getColorHojas() {
		return colorHojas;
	}

	public void setColorHojas(String colorHojas) {
		this.colorHojas = colorHojas;
	}

	public String getSePoda() {
		return sePoda;
	}

	public void setSePoda(String sePoda) {
		this.sePoda = sePoda;
	}

	public int getAnchoArbusto() {
		return anchoArbusto;
	}

	public void setAnchoArbusto(int anchoArbusto) {
		this.anchoArbusto = anchoArbusto;
	}

	
	public String toString() {
		return "Arbusto [esDomestico=" + esDomestico + ", variedadArbusto=" + variedadArbusto + ", colorHojas="
				+ colorHojas + ", sePoda=" + sePoda + ", anchoArbusto=" + anchoArbusto + "]";
	}

	@Override
	public void queSoy() {
		System.out.println("Hola soy un arbusto");
		
	}

	@Override
	public void darFrutos() {
		System.out.println("Soy un arbusto y algunas de mis especies dan frutos");
		
	}

	@Override
	public void envenenar() {
		
	}

	
	
	
	
	

}
