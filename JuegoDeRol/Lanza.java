package JuegoDeRol;

public class Lanza extends Objeto {
	

	public Lanza() {
		super("Lanza del Juicio", "Forjada en los fuegos de un volcán sagrado, esta lanza brilla con una llama azulada que arde solo ante aquellos juzgados indignos. Cada lanzamiento es un veredicto divino.");
		
	}
	
	@Override
    public void usar(Personaje usuario, Personaje enemigo) {
		usuario.setCriticoPer(usuario.getCriticoPer()+20);
		System.out.println("🔱 " +  usuario.getNombre() + usuario.clase.getNombre() + " empuña la Lanza del Juicio.");
        System.out.println("🎯 Su probabilidad de crítico aumenta en 20% de forma permanente.");
	}
	
	
}
