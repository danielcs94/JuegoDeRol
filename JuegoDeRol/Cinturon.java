package JuegoDeRol;

public class Cinturon extends Objeto {
	
	
	public Cinturon() {
		super("Cinturon del Gigante Errante", "Un antiguo cinturón de cuero rúnico, imbuido con la fuerza de los titanes. Quien lo lleva siente un poder colosal fluir por sus venas, capaz de derribar montañas con un solo golpe.");
	}
	
	@Override
    public void usar(Personaje usuario, Personaje enemigo) {
		usuario.setVidaMaximaPer(usuario.getVidaMaximaPer()+30);
		usuario.setVidaPer(usuario.getVidaPer());
		
		System.out.println("💥 " + usuario.getNombre()+" " + usuario.clase.getNombre() +" ha usado el Cinturón del Gigante Errante. ¡Siente el poder de los titanes!");
		System.out.println("🌟 ¡Su vida máxima ha aumentado en 30 puntos! ");	
	}
}
