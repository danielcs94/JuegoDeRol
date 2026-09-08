package JuegoDeRol;

public class Duende extends Personaje {

	public Duende(Clase clase) {
		super("Duende", 65, 5, 5, 55, 55, 50, clase);
	}

	
	@Override
    public void ataqueEspecial() {
		if(getAtaqueEspUsado()) {
			 System.out.println("❌ " + getNombre()+ clase.getNombre() + " ya ha usado su ataque especial en esta partida y no puede volver a usarlo.");
		}else {
		setDefensaPer(getDefensaPer()+10);
		setVidaPer(getVidaPer()+20);
		setVelocidadPer(getVelocidadPer()-40);
		System.out.println("🛡El"+ getNombre() + clase.getNombre() +" endurece su piel, aumentando su defensa en 10 y recuperando 20 puntos de vida, pero volviendose mas lento perdiendo 40 puntos de velocidad");
		setAtaqueEspUsado(true);
		}
	}
	
	public void aplicarClase() {
		setAtaquePer(clase.getModAtaque()*getAtaquePer());
		setDefensaPer(clase.getModDefensa()*getDefensaPer());
		setVidaMaximaPer(clase.getModVida()*getVidaMaximaPer());
		setVidaPer(getVidaMaximaPer());
		setVelocidadPer(clase.getModVelocidad()*getVelocidadPer());
		setCriticoPer(clase.getModCritico()+getCriticoPer());
		
	}
	
}
