package JuegoDeRol;

public class Clase {

	private String nombre;
	private double modAtaque;
	private double modCritico;
	private double modDefensa;
	private double modVelocidad;
	private double modVida;
	
	public Clase(String nombre, double modAtaque, double modCritico, double modDefensa, double modVelocidad,
			double modVida) {
		super();
		this.nombre = nombre;
		this.modAtaque = modAtaque;
		this.modCritico = modCritico;
		this.modDefensa = modDefensa;
		this.modVelocidad = modVelocidad;
		this.modVida = modVida;
	
	
	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getModAtaque() {
		return modAtaque;
	}

	public void setModAtaque(double modAtaque) {
		this.modAtaque = modAtaque;
	}

	public double getModCritico() {
		return modCritico;
	}

	public void setModCritico(double modCritico) {
		this.modCritico = modCritico;
	}

	public double getModDefensa() {
		return modDefensa;
	}

	public void setModDefensa(double modDefensa) {
		this.modDefensa = modDefensa;
	}

	public double getModVelocidad() {
		return modVelocidad;
	}

	public void setModVelocidad(double modVelocidad) {
		this.modVelocidad = modVelocidad;
	}

	public double getModVida() {
		return modVida;
	}

	public void setModVida(double modVida) {
		this.modVida = modVida;
	}
	

	
}
