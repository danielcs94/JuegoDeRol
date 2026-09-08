package JuegoDeRol;

public abstract class Personaje {
	
	private String nombre;
	private double ataque;
	private double critico;
	private double defensa;
	private double vida;
	private double vidaMaxima;
	private double velocidad;
	private boolean ataqueEspUsado;
	protected Clase clase;
	protected Objeto[] inventario;
	protected int objetosEnInventario;
			
	public Personaje(String nombre, double ataque, double critico, double defensa, double vida, double vidaMaxima, double velocidad,
			Clase clase) {
		super();
		this.ataqueEspUsado = false;
		this.nombre = nombre;
		this.ataque = ataque;
		this.critico = critico;
		this.defensa = defensa;
		this.vida = vida;
		this.vidaMaxima = vidaMaxima;
		this.velocidad = velocidad;
		this.clase = clase;
		this.inventario= new Objeto[2];
		this.objetosEnInventario = 0;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public double getAtaquePer() {
		return ataque;
	}

	public void setAtaquePer(double ataque) {
		this.ataque = ataque;
	}
	
	public double getCriticoPer() {
		return critico;
	}


	public void setCriticoPer(double critico) {
		this.critico = critico;
	}


	public double getDefensaPer() {
		return defensa;
	}

	public void setDefensaPer(double defensa) {
		this.defensa = defensa;
	}

	public double getVidaPer() {
		return vida;
	}

	public void setVidaPer(double vida) {
		this.vida = vida;
		if (this.vida>getVidaMaximaPer()) {
		this.vida = getVidaMaximaPer();
		}
	}
	
	public double getVidaMaximaPer() {
		return vidaMaxima;
	}

	public void setVidaMaximaPer(double vidaMaxima) {
		this.vidaMaxima = vidaMaxima;
	}

	public double getVelocidadPer() {
		return velocidad;
	}

	public void setVelocidadPer(double velocidad) {
		this.velocidad = velocidad;
	}
	
	public Clase getClase() {
		return clase;
	}

	public void setClase(Clase clase) {
		this.clase = clase;
	}

	public boolean getAtaqueEspUsado() {
		return ataqueEspUsado;
	}

	public void setAtaqueEspUsado(boolean ataqueEspUsado) {
		this.ataqueEspUsado = ataqueEspUsado;
	}

	public void usarObjeto(Objeto objeto, Personaje enemigo) {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] == objeto) {
                objeto.usar(this, enemigo);  
                inventario[i] = null; 
                ; 
                System.out.println("🗑️ " + nombre + " ha usado " + objeto.getNombre() + " y lo ha descartado.");
           }
       }
	}
	public void agregarObjeto(Objeto objeto) {
        if (objetosEnInventario < inventario.length) {
            inventario[objetosEnInventario] = objeto;
            objetosEnInventario++;
            System.out.println(objeto.getNombre() + " añadido al inventario.");
        } else {
            System.out.println("Inventario lleno. No puedes llevar más objetos.");
        }
    }
	
	public void mostrarInventario() {
	    System.out.println("🎒 Inventario de " + nombre + ":");
	    boolean vacio = true;
	    for (Objeto obj : inventario) {
	        if (obj != null) {
	            System.out.println("   - " + obj.getNombre());
	            vacio = false;
	        }
	    }
	    if (vacio) {
	        System.out.println("   (Vacío)");
	    }
	}

	        
	public void mostrarEstadisticas() {
        System.out.println("\r\n" +
            "  ╔══════════════════════════════════════════════╗\r\n" +
            "    Estado actual de " + nombre + " " + clase.getNombre() + "\r\n" +
            "  ╠══════════════════════════════════════════════╣\r\n" +
            "    ❤️ Vida     │ " + String.format("%-15s", vida + "/" + vidaMaxima) + "      \r\n" +
            "    ⚔ Ataque   │ " + String.format("%-15s", ataque) + "      \r\n" +
            "    🛡 Defensa  │ " + String.format("%-15s", defensa) + "      \r\n" +
            "    💨 Velocidad│ " + String.format("%-15s", velocidad) + "      \r\n" +
            "    🎯 Crítico  │ " + String.format("%-15s", critico) + "      \r\n" +
            "  ╚══════════════════════════════════════════════╝\r\n" +
            "");
    }
	
	public abstract void aplicarClase();
	
	public abstract void ataqueEspecial();
	
	public void atacar(Personaje enemigo) {
		
		double dañoCausado = this.ataque - enemigo.getDefensaPer();
		dañoCausado = Math.max(dañoCausado, 1);
		
		if(Math.random()*100 < critico){
			System.out.println("¡"+this.nombre+" "+this.clase.getNombre()+" desata un golpe crítico! ");
		dañoCausado *=2;
		enemigo.vida = enemigo.vida - dañoCausado;
		}else {
		enemigo.vida = enemigo.vida - dañoCausado;
		System.out.println("¡"+this.nombre+" "+this.clase.getNombre()+" lanza un feroz ataque contra "+enemigo.nombre+" "+enemigo.clase.getNombre()+"! ");
		}
		
		System.out.println("¡"+this.nombre+" "+this.clase.getNombre()+" realiza un golpe de "+dañoCausado+" puntos de daño!");
		if(clase.getNombre().equals("Mercenario")) {
			
			double segundoAtaque = dañoCausado;
			segundoAtaque = this.ataque - enemigo.getDefensaPer();
			segundoAtaque = Math.max(segundoAtaque, 1);
			
			if(Math.random()*100 < critico){
				System.out.println("¡"+this.nombre+" "+this.clase.getNombre()+" ataca con fuerza letal y asesta un crítico! ");
				segundoAtaque *=2;
				enemigo.vida = enemigo.vida - segundoAtaque;
		}else {
			enemigo.vida = enemigo.vida - segundoAtaque;
			System.out.println("¡"+this.nombre+" "+this.clase.getNombre()+" realiza una gran estocada al "+enemigo.nombre+" "+enemigo.clase.getNombre()+"! ");
			System.out.println("¡"+this.nombre+" "+this.clase.getNombre()+" realiza un segundo golpe de "+dañoCausado+" puntos de daño!");
		}
		}
		
		
		
	}
}
		

	

