package JuegoDeRol;

public class Dragon extends Personaje {

	public Dragon(Clase clase) {
		super("Dragon", 50, 5, 10, 90, 90, 30, clase);
		// TODO Auto-generated constructor stub
	}
	
	
	public void aplicarClase() {
		setAtaquePer(clase.getModAtaque()*getAtaquePer());
		setDefensaPer(clase.getModDefensa()*getDefensaPer());
		setVidaMaximaPer(clase.getModVida()*getVidaMaximaPer());
		setVidaPer(getVidaMaximaPer());
		setVelocidadPer(clase.getModVelocidad()*getVelocidadPer());
		setCriticoPer(clase.getModCritico()+getCriticoPer());
		
	}
	
	@Override
    public void ataqueEspecial() {
		if(getAtaqueEspUsado()) {
			 System.out.println("❌ " + getNombre()+ clase.getNombre() + " ya ha usado su ataque especial en esta partida y no puede volver a usarlo.");
		}else {
		setVidaPer(getVidaPer()-20);
		setCriticoPer(getCriticoPer()+15);
		System.out.println("🔥 El "+getNombre()+ clase.getNombre() +" sacrifica su propia vida en un frenesí de batalla, perdiendo 20 puntos de vida pero aumentando su crítico en 15%.");
		setAtaqueEspUsado(true);
		}
	}
	
}
