package JuegoDeRol;

public class Golem extends Personaje {

	public Golem(Clase clase) {
		super("Golem", 30, 5, 15, 120, 120, 15, clase);
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
		setAtaquePer(getAtaquePer()+20);
		setDefensaPer(0);
		System.out.println("💥 El "+getNombre()+ clase.getNombre()+" desata su furia, aumentando su ataque en 20 pero sacrificando toda su defensa.");
		setAtaqueEspUsado(true);
		}
		
	}
	
	
	
}
