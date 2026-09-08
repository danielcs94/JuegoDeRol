package JuegoDeRol;

public class Escudo extends Objeto {
	
	
	public Escudo() {
		super("Escudo del Último Bastión", "Un escudo impenetrable, legado de un reino caído. Su portador es la última defensa entre la oscuridad y la esperanza, capaz de resistir incluso la furia de los dragones.");
		
	}
	
	@Override
    public void usar(Personaje usuario, Personaje enemigo) {
		usuario.setDefensaPer(usuario.getDefensaPer()+10);
		enemigo.setVidaPer(enemigo.getVidaPer()-20);
		System.out.println("🛡 " + usuario.getNombre() + usuario.clase.getNombre() + " levanta el Escudo del Último Bastión.");
		System.out.println("🔷 Su defensa aumenta en 10 puntos.");
        System.out.println("🔥 " + enemigo.getNombre() + enemigo.clase.getNombre() + " recibe 20 puntos de daño por el impacto del escudo.");
	}
}
