package practica5;

public class Flor extends Planta implements MeRegalan, SoyVenenoso{
	String colorPetalos, colorPistilo, variedadDeFlor, estacion;
	int cantPetalos;
	
	//Constructor
	public Flor(String colorPetalos, String colorPistilo, String variedadDeFlor, String estacion, int cantPetalos, String nombre, String tieneHojas, String climaIdeal, int altoTallo, int id) {
		super(nombre, tieneHojas, climaIdeal, altoTallo, id);
		
		this.colorPetalos = colorPetalos;
		this.colorPistilo = colorPistilo;
		this.variedadDeFlor = variedadDeFlor;
		this.estacion = estacion;
		this.cantPetalos = cantPetalos;
	}
	
	public Flor() {
		
	}
	
	//Metodos

	public String getColorPetalos() {
		return colorPetalos;
	}

	public void setColorPetalos(String colorPetalos) {
		this.colorPetalos = colorPetalos;
	}

	public String getColorPistilo() {
		return colorPistilo;
	}

	public void setColorPistilo(String colorPistilo) {
		this.colorPistilo = colorPistilo;
	}

	public String getVariedadDeFlor() {
		return variedadDeFlor;
	}

	public void setVariedadDeFlor(String variedadDeFlor) {
		this.variedadDeFlor = variedadDeFlor;
	}

	public String getEstacion() {
		return estacion;
	}

	public void setEstacion(String estacion) {
		this.estacion = estacion;
	}

	public int getCantPetalos() {
		return cantPetalos;
	}

	public void setCantPetalos(int cantPetalos) {
		this.cantPetalos = cantPetalos;
	}

	
	public String toString() {
		return "Flor [colorPetalos=" + colorPetalos + ", colorPistilo=" + colorPistilo + ", variedadDeFlor="
				+ variedadDeFlor + ", estacion=" + estacion + ", cantPetalos=" + cantPetalos + "]";
	}

	@Override
	public void queSoy() {
		System.out.println("Hola soy una flor");
		
	}

	@Override
	public void envenenar() {
		
	}

	@Override
	public void regalar() {
		System.out.println("Soy una flor y me regalan");
		
	}
	
	


	
	
	

}
