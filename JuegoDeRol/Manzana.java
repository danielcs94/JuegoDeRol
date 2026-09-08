package JuegoDeRol;

public class Manzana extends Objeto {

	
	public Manzana() {
		super("Manzana de la Creación", "Un fruto místico que contiene la esencia del primer árbol del mundo. Al probarla, su consumidor obtiene una segunda oportunidad, regresando de las sombras de la muerte.");
		
	}
	
	@Override
    public void usar(Personaje usuario, Personaje enemigo) {
		usuario.setVidaPer((usuario.getVidaPer()+enemigo.getVidaPer())/2);
		enemigo.setVidaPer((usuario.getVidaPer()+enemigo.getVidaPer())/2);
		System.out.println("🍏 " + usuario.getNombre() + usuario.clase.getNombre() + " prueba la Manzana de la Creación.");
        System.out.println("🔄 La vida del " + usuario.getNombre() + usuario.clase.getNombre() + " y " +  enemigo.getNombre() + enemigo.clase.getNombre() + " se reajusta, repartiéndose equitativamente.");
	}
}
