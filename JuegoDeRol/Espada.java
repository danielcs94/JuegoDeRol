package JuegoDeRol;

public class Espada extends Objeto {
	
	
	public Espada() {
		super("Espada de la Luna Eterna", "Una hoja forjada en plata celestial que brilla bajo la luz de la luna. Se dice que su filo nunca se desgasta y que cada golpe asesta la frialdad de la noche eterna.");
		
	}
	
	@Override
    public void usar(Personaje usuario, Personaje enemigo) {
		usuario.setAtaquePer(usuario.getAtaquePer()+10);
		System.out.println("🌙 " + usuario.getNombre() +" " +usuario.clase.getNombre()+ " blande la Espada de la Luna Eterna, aumentando su ataque 10 puntos.");
		System.out.println("⚔ Su ataque aumenta en 10 puntos de forma permanente.");
		
		
		
	}
		

	
	
}
