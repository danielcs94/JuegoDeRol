package JuegoDeRol;

import java.util.*;
import JuegoDeRol.*;

public class AppJuegoRol {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("______                                               \r\n" + //
				"|  _  \\                                              \r\n" + //
				"| | | |_ __ __ _  __ _  ___  _ __   ___  ___   _   _ \r\n" + //
				"| | | | '__/ _` |/ _` |/ _ \\| '_ \\ / _ \\/ __| | | | |\r\n" + //
				"| |/ /| | | (_| | (_| | (_) | | | |  __/\\__ \\ | |_| |\r\n" + //
				"|___/ |_|  \\__,_|\\__, |\\___/|_| |_|\\___||___/  \\__, |\r\n" + //
				"                  __/ |                         __/ |\r\n" + //
				"                 |___/                         |___/ \r\n" + //
				"___  ___                                             \r\n" + //
				"|  \\/  |                                             \r\n" + //
				"| .  . | __ _ _____ __ ___   ___  _ __ _ __ __ _ ___ \r\n" + //
				"| |\\/| |/ _` |_  / '_ ` _ \\ / _ \\| '__| '__/ _` / __|\r\n" + //
				"| |  | | (_| |/ /| | | | | | (_) | |  | | | (_| \\__ \\\r\n" + //
				"\\_|  |_/\\__,_/___|_| |_| |_|\\___/|_|  |_|  \\__,_|___/\r\n" + //
				"                                                     \r\n" + //
				"                                                     ");

		System.out.println("   ______________________________\r\n"
				+ " / \\                             \\.\r\n"
				+ "|   |                            |.\r\n"
				+ " \\_ |       Bienvenidos a       |.\r\n"
				+ "    |     DRAGONES Y MAZMORRAS   |.\r\n"
				+ "    |                            |.\r\n"
				+ "    |       ¿Desean jugar?       |.\r\n"
				+ "    |                            |.\r\n"
				+ "    |                            |.\r\n"
				+ "    |           1--> si          |.\r\n"
				+ "    |           2--> no          |.\r\n"
				+ "    |                            |.\r\n"
				+ "    |     Introduzca un valor.   |.\r\n"
				+ "    |                            |.\r\n"
				+ "    |                            |.\r\n"
				+ "    |   _________________________|___\r\n"
				+ "    |  /                            /.\r\n"
				+ "    \\_/dc__________________________/.");
	
		int opcion = sc.nextInt();
		
		Personaje Jugador1 = null;
        Personaje Jugador2 = null;
        
		if (opcion == 1) {
			System.out.println("\r\n" +
		            "  ╔═══════════════════════════════╗\r\n" +
		            "  ║   JUGADOR 1 ESCOJA PERSONAJE  ║\r\n" +
		            "  ╚═══════════════════════════════╝\r\n" +
		            "");
				 
				menuPersonajes();
				int opcionMenuPersonajes = sc.nextInt();

				if (opcionMenuPersonajes == 1) {
					// Crear Personaje Duende
					Jugador1 = new Duende(null);
					
					System.out.println("\r\n" +
				            "  ╔═══════════════════════════════╗\r\n" +
				            "  ║     JUGADOR 1 ESCOJA CLASE    ║\r\n" +
				            "  ╚═══════════════════════════════╝\r\n" +
				            "");
					
					menuClases();
					int opcionMenuClase1 = sc.nextInt();

					if (opcionMenuClase1 == 1) {
						// Crear clase Caballero
						Clase c1 = new Caballero();
						Jugador1.setClase(c1);
						Jugador1.aplicarClase();

						System.out.println("\r\n" +
					            "  ╔═══════════════════════════════╗\r\n" +
					            "  ║   JUGADOR 1 ESCOJA 2 OBJETOS  ║\r\n" +
					            "  ╚═══════════════════════════════╝\r\n" +
					            "");
						for (int ob = 0; ob <= 1; ob++) {
							
							
							menuObjetos();
							int opcionMenuObjetos1 = sc.nextInt();
							if (opcionMenuObjetos1 == 1) {
								// Crear objeto Espada
								Objeto o1 = new Espada();
								Jugador1.agregarObjeto(o1);

							} else if (opcionMenuObjetos1 == 2) {
								// Crear objeto Escudo
								Objeto o2 = new Escudo();
								Jugador1.agregarObjeto(o2);

							} else if (opcionMenuObjetos1 == 3) {
								// Crear objeto Cinturon
								Objeto o3 = new Cinturon();
								Jugador1.agregarObjeto(o3);

							} else if (opcionMenuObjetos1 == 4) {
								// Crear objeto Lanza
								Objeto o4 = new Lanza();
								Jugador1.agregarObjeto(o4);

							} else if (opcionMenuObjetos1 == 5) {
								// Crear objeto Manzana
								Objeto o5 = new Manzana();
								Jugador1.agregarObjeto(o5);
							}
						}

					} else if (opcionMenuClase1 == 2) {
						// Crear clase Mago
						Clase c2 = new Mago();
						Jugador1.setClase(c2);
						Jugador1.aplicarClase();

						System.out.println("\r\n" +
					            "  ╔═══════════════════════════════╗\r\n" +
					            "  ║   JUGADOR 1 ESCOJA 2 OBJETOS  ║\r\n" +
					            "  ╚═══════════════════════════════╝\r\n" +
					            "");
						
						for (int ob = 0; ob <= 1; ob++) {
							
							
							menuObjetos();
							int opcionMenuObjetos1 = sc.nextInt();
							if (opcionMenuObjetos1 == 1) {
								// Crear objeto Espada
								Objeto o1 = new Espada();
								Jugador1.agregarObjeto(o1);

							} else if (opcionMenuObjetos1 == 2) {
								// Crear objeto Escudo
								Objeto o2 = new Escudo();
								Jugador1.agregarObjeto(o2);

							} else if (opcionMenuObjetos1 == 3) {
								// Crear objeto Cinturon
								Objeto o3 = new Cinturon();
								Jugador1.agregarObjeto(o3);

							} else if (opcionMenuObjetos1 == 4) {
								Objeto o4 = new Lanza();
								Jugador1.agregarObjeto(o4);

							} else if (opcionMenuObjetos1 == 5) {
								Objeto o5 = new Manzana();
								Jugador1.agregarObjeto(o5);

							}
						}

					} else if (opcionMenuClase1 == 3) {
						// Crear clase Mercenario
						Clase c3 = new Mercenario();
						Jugador1.setClase(c3);
						Jugador1.aplicarClase();

						System.out.println("\r\n" +
					            "  ╔═══════════════════════════════╗\r\n" +
					            "  ║   JUGADOR 1 ESCOJA 2 OBJETOS  ║\r\n" +
					            "  ╚═══════════════════════════════╝\r\n" +
					            "");
						
						for (int ob = 0; ob <= 1; ob++) {
							
							menuObjetos();
							int opcionMenuObjetos1 = sc.nextInt();

							if (opcionMenuObjetos1 == 1) {
								Objeto o1 = new Espada();
								Jugador1.agregarObjeto(o1);

							} else if (opcionMenuObjetos1 == 2) {
								Objeto o2 = new Escudo();
								Jugador1.agregarObjeto(o2);

							} else if (opcionMenuObjetos1 == 3) {
								Objeto o3 = new Cinturon();
								Jugador1.agregarObjeto(o3);

							} else if (opcionMenuObjetos1 == 4) {
								Objeto o4 = new Lanza();
								Jugador1.agregarObjeto(o4);
							} else if (opcionMenuObjetos1 == 5) {
								Objeto o5 = new Manzana();
								Jugador1.agregarObjeto(o5);
							}
						}
					}

				} else if (opcionMenuPersonajes == 2) {
					// Crear Personaje Golem
					Jugador1 = new Golem(null);
					
					System.out.println("\r\n" +
				            "  ╔═══════════════════════════════╗\r\n" +
				            "  ║     JUGADOR 1 ESCOJA CLASE    ║\r\n" +
				            "  ╚═══════════════════════════════╝\r\n" +
				            "");
					
					menuClases();
					int opcionMenuClase2 = sc.nextInt();
					if (opcionMenuClase2 == 1) {
						// Crear clase Caballero
						Clase c1 = new Caballero();
						Jugador1.setClase(c1);
						Jugador1.aplicarClase();

						System.out.println("\r\n" +
					            "  ╔═══════════════════════════════╗\r\n" +
					            "  ║   JUGADOR 1 ESCOJA 2 OBJETOS  ║\r\n" +
					            "  ╚═══════════════════════════════╝\r\n" +
					            "");
						
						for (int ob = 0; ob <= 1; ob++) {
							
							menuObjetos();
							int opcionMenuObjetos1 = sc.nextInt();
							if (opcionMenuObjetos1 == 1) {
								Objeto o1 = new Espada();
								Jugador1.agregarObjeto(o1);

							} else if (opcionMenuObjetos1 == 2) {
								Objeto o2 = new Escudo();
								Jugador1.agregarObjeto(o2);

							} else if (opcionMenuObjetos1 == 3) {
								Objeto o3 = new Cinturon();
								Jugador1.agregarObjeto(o3);

							} else if (opcionMenuObjetos1 == 4) {
								Objeto o4 = new Lanza();
								Jugador1.agregarObjeto(o4);

							} else if (opcionMenuObjetos1 == 5) {
								Objeto o5 = new Manzana();
								Jugador1.agregarObjeto(o5);
							}
						}

					} else if (opcionMenuClase2 == 2) {
						// Crear clase Mago
						Clase c2 = new Mago();
						Jugador1.setClase(c2);
						Jugador1.aplicarClase();

						System.out.println("\r\n" +
					            "  ╔═══════════════════════════════╗\r\n" +
					            "  ║   JUGADOR 1 ESCOJA 2 OBJETOS  ║\r\n" +
					            "  ╚═══════════════════════════════╝\r\n" +
					            "");
						
						for (int ob = 0; ob <= 1; ob++) {
							
							menuObjetos();
							int opcionMenuObjetos1 = sc.nextInt();

							if (opcionMenuObjetos1 == 1) {
								// Crear objeto Espada
								Objeto o1 = new Espada();
								Jugador1.agregarObjeto(o1);

							} else if (opcionMenuObjetos1 == 2) {
								// Crear objeto Escudo
								Objeto o2 = new Escudo();
								Jugador1.agregarObjeto(o2);

							} else if (opcionMenuObjetos1 == 3) {
								// Crear objeto Cinturon
								Objeto o3 = new Cinturon();
								Jugador1.agregarObjeto(o3);

							} else if (opcionMenuObjetos1 == 4) {
								Objeto o4 = new Lanza();
								Jugador1.agregarObjeto(o4);

							} else if (opcionMenuObjetos1 == 5) {
								Objeto o5 = new Manzana();
								Jugador1.agregarObjeto(o5);

							}
						}

					} else if (opcionMenuClase2 == 3) {
						// Crear clase Mercenario
						Clase c3 = new Mercenario();
						Jugador1.setClase(c3);
						Jugador1.aplicarClase();

						System.out.println("\r\n" +
					            "  ╔═══════════════════════════════╗\r\n" +
					            "  ║   JUGADOR 1 ESCOJA 2 OBJETOS  ║\r\n" +
					            "  ╚═══════════════════════════════╝\r\n" +
					            "");
						
						for (int ob = 0; ob <= 1; ob++) {
							menuObjetos();
							int opcionMenuObjetos1 = sc.nextInt();

							if (opcionMenuObjetos1 == 1) {
								// Crear objeto Espada
								Objeto o1 = new Espada();
								Jugador1.agregarObjeto(o1);

							} else if (opcionMenuObjetos1 == 2) {
								// Crear objeto Escudo
								Objeto o2 = new Escudo();
								Jugador1.agregarObjeto(o2);

							} else if (opcionMenuObjetos1 == 3) {
								// Crear objeto Cinturon
								Objeto o3 = new Cinturon();
								Jugador1.agregarObjeto(o3);

							} else if (opcionMenuObjetos1 == 4) {
								Objeto o4 = new Lanza();
								Jugador1.agregarObjeto(o4);

							} else if (opcionMenuObjetos1 == 5) {
								Objeto o5 = new Manzana();
								Jugador1.agregarObjeto(o5);

							}
						}

					}

				} else if (opcionMenuPersonajes == 3) {
					// Crear Personaje Dragon
					Jugador1= new Dragon(null);
					
					System.out.println("\r\n" +
				            "  ╔═══════════════════════════════╗\r\n" +
				            "  ║     JUGADOR 1 ESCOJA CLASE    ║\r\n" +
				            "  ╚═══════════════════════════════╝\r\n" +
				            "");
					menuClases();
					int opcionMenuClase3 = sc.nextInt();
					if (opcionMenuClase3 == 1) {
						// Crear clase Caballero
						Clase c1 = new Caballero();
						Jugador1.setClase(c1);
						Jugador1.aplicarClase();

						System.out.println("\r\n" +
					            "  ╔═══════════════════════════════╗\r\n" +
					            "  ║   JUGADOR 1 ESCOJA 2 OBJETOS  ║\r\n" +
					            "  ╚═══════════════════════════════╝\r\n" +
					            "");
						
						for (int ob = 0; ob <= 1; ob++) {
							
							menuObjetos();
							int opcionMenuObjetos1 = sc.nextInt();
							if (opcionMenuObjetos1 == 1) {
								// Crear objeto Espada
								Objeto o1 = new Espada();
								Jugador1.agregarObjeto(o1);

							} else if (opcionMenuObjetos1 == 2) {
								// Crear objeto Escudo
								Objeto o2 = new Escudo();
								Jugador1.agregarObjeto(o2);

							} else if (opcionMenuObjetos1 == 3) {
								// Crear objeto Cinturon
								Objeto o3 = new Cinturon();
								Jugador1.agregarObjeto(o3);

							} else if (opcionMenuObjetos1 == 4) {
								Objeto o4 = new Lanza();
								Jugador1.agregarObjeto(o4);

							} else if (opcionMenuObjetos1 == 5) {
								Objeto o5 = new Manzana();
								Jugador1.agregarObjeto(o5);

							}
						}

					} else if (opcionMenuClase3 == 2) {
						// Crear clase Mago
						Clase c2 = new Mago();
						Jugador1.setClase(c2);
						Jugador1.aplicarClase();
						
						System.out.println("\r\n" +
					            "  ╔═══════════════════════════════╗\r\n" +
					            "  ║   JUGADOR 1 ESCOJA 2 OBJETOS  ║\r\n" +
					            "  ╚═══════════════════════════════╝\r\n" +
					            "");
						
						for (int ob = 0; ob <= 1; ob++) {
						
							menuObjetos();
							int opcionMenuObjetos1 = sc.nextInt();
							if (opcionMenuObjetos1 == 1) {
								// Crear objeto Espada
								Objeto o1 = new Espada();
								Jugador1.agregarObjeto(o1);

							} else if (opcionMenuObjetos1 == 2) {
								// Crear objeto Escudo
								Objeto o2 = new Escudo();
								Jugador1.agregarObjeto(o2);

							} else if (opcionMenuObjetos1 == 3) {
								// Crear objeto Cinturon
								Objeto o3 = new Cinturon();
								Jugador1.agregarObjeto(o3);

							} else if (opcionMenuObjetos1 == 4) {
								Objeto o4 = new Lanza();
								Jugador1.agregarObjeto(o4);

							} else if (opcionMenuObjetos1 == 5) {
								Objeto o5 = new Manzana();
								Jugador1.agregarObjeto(o5);

							}
						}

					} else if (opcionMenuClase3 == 3) {
						// Crear clase Mercenario
						Clase c3 = new Mercenario();
						Jugador1.setClase(c3);
						Jugador1.aplicarClase();
						
						System.out.println("\r\n" +
					            "  ╔═══════════════════════════════╗\r\n" +
					            "  ║   JUGADOR 1 ESCOJA 2 OBJETOS  ║\r\n" +
					            "  ╚═══════════════════════════════╝\r\n" +
					            "");
						
						for (int ob = 0; ob <= 1; ob++) {
							menuObjetos();
							int opcionMenuObjetos1 = sc.nextInt();
							if (opcionMenuObjetos1 == 1) {
								// Crear objeto Espada
								Objeto o1 = new Espada();
								Jugador1.agregarObjeto(o1);

							} else if (opcionMenuObjetos1 == 2) {
								// Crear objeto Escudo
								Objeto o2 = new Escudo();
								Jugador1.agregarObjeto(o2);

							} else if (opcionMenuObjetos1 == 3) {
								// Crear objeto Cinturon
								Objeto o3 = new Cinturon();
								Jugador1.agregarObjeto(o3);

							} else if (opcionMenuObjetos1 == 4) {
								Objeto o4 = new Lanza();
								Jugador1.agregarObjeto(o4);

							} else if (opcionMenuObjetos1 == 5) {
								Objeto o5 = new Manzana();
								Jugador1.agregarObjeto(o5);

							}
						}

					}
				}
				System.out.println("\r\n" +
			            "  ╔═══════════════════════════════╗\r\n" +
			            "  ║   JUGADOR 2 ESCOJA PERSONAJE  ║\r\n" +
			            "  ╚═══════════════════════════════╝\r\n" +
			            "");
					 
					menuPersonajes();
					opcionMenuPersonajes = sc.nextInt();

					if (opcionMenuPersonajes == 1) {
						// Crear Personaje Duende
						Jugador2 = new Duende(null);
						
						System.out.println("\r\n" +
					            "  ╔═══════════════════════════════╗\r\n" +
					            "  ║     JUGADOR 2 ESCOJA CLASE    ║\r\n" +
					            "  ╚═══════════════════════════════╝\r\n" +
					            "");
						
						menuClases();
						int opcionMenuClase1 = sc.nextInt();

						if (opcionMenuClase1 == 1) {
							// Crear clase Caballero
							Clase c1 = new Caballero();
							Jugador2.setClase(c1);
							Jugador2.aplicarClase();
							
							System.out.println("\r\n" +
						            "  ╔═══════════════════════════════╗\r\n" +
						            "  ║   JUGADOR 2 ESCOJA 2 OBJETOS  ║\r\n" +
						            "  ╚═══════════════════════════════╝\r\n" +
						            "");
							
							for (int ob = 0; ob <= 1; ob++) {
								menuObjetos();
								int opcionMenuObjetos1 = sc.nextInt();
								if (opcionMenuObjetos1 == 1) {
									// Crear objeto Espada
									Objeto o1 = new Espada();
									Jugador2.agregarObjeto(o1);

								} else if (opcionMenuObjetos1 == 2) {
									// Crear objeto Escudo
									Objeto o2 = new Escudo();
									Jugador2.agregarObjeto(o2);

								} else if (opcionMenuObjetos1 == 3) {
									// Crear objeto Cinturon
									Objeto o3 = new Cinturon();
									Jugador2.agregarObjeto(o3);

								} else if (opcionMenuObjetos1 == 4) {
									// Crear objeto Lanza
									Objeto o4 = new Lanza();
									Jugador2.agregarObjeto(o4);

								} else if (opcionMenuObjetos1 == 5) {
									// Crear objeto Manzana
									Objeto o5 = new Manzana();
									Jugador2.agregarObjeto(o5);
								}
							}

						} else if (opcionMenuClase1 == 2) {
							// Crear clase Mago
							Clase c2 = new Mago();
							Jugador2.setClase(c2);
							Jugador2.aplicarClase();

							System.out.println("\r\n" +
						            "  ╔═══════════════════════════════╗\r\n" +
						            "  ║   JUGADOR 2 ESCOJA 2 OBJETOS  ║\r\n" +
						            "  ╚═══════════════════════════════╝\r\n" +
						            "");
							
							for (int ob = 0; ob <= 1; ob++) {
								menuObjetos();
								int opcionMenuObjetos1 = sc.nextInt();
								if (opcionMenuObjetos1 == 1) {
									// Crear objeto Espada
									Objeto o1 = new Espada();
									Jugador2.agregarObjeto(o1);

								} else if (opcionMenuObjetos1 == 2) {
									// Crear objeto Escudo
									Objeto o2 = new Escudo();
									Jugador2.agregarObjeto(o2);

								} else if (opcionMenuObjetos1 == 3) {
									// Crear objeto Cinturon
									Objeto o3 = new Cinturon();
									Jugador2.agregarObjeto(o3);

								} else if (opcionMenuObjetos1 == 4) {
									Objeto o4 = new Lanza();
									Jugador2.agregarObjeto(o4);

								} else if (opcionMenuObjetos1 == 5) {
									Objeto o5 = new Manzana();
									Jugador2.agregarObjeto(o5);

								}
							}

						} else if (opcionMenuClase1 == 3) {
							// Crear clase Mercenario
							Clase c3 = new Mercenario();
							Jugador2.setClase(c3);
							Jugador2.aplicarClase();

							System.out.println("\r\n" +
						            "  ╔═══════════════════════════════╗\r\n" +
						            "  ║   JUGADOR 2 ESCOJA 2 OBJETOS  ║\r\n" +
						            "  ╚═══════════════════════════════╝\r\n" +
						            "");
							
							for (int ob = 0; ob <= 1; ob++) {
								menuObjetos();
								int opcionMenuObjetos1 = sc.nextInt();

								if (opcionMenuObjetos1 == 1) {
									Objeto o1 = new Espada();
									Jugador2.agregarObjeto(o1);

								} else if (opcionMenuObjetos1 == 2) {
									Objeto o2 = new Escudo();
									Jugador2.agregarObjeto(o2);

								} else if (opcionMenuObjetos1 == 3) {
									Objeto o3 = new Cinturon();
									Jugador2.agregarObjeto(o3);

								} else if (opcionMenuObjetos1 == 4) {
									Objeto o4 = new Lanza();
									Jugador2.agregarObjeto(o4);
								} else if (opcionMenuObjetos1 == 5) {
									Objeto o5 = new Manzana();
									Jugador2.agregarObjeto(o5);
								}
							}
						}

					} else if (opcionMenuPersonajes == 2) {
						// Crear Personaje Golem
						Jugador2 = new Golem(null);
						System.out.println("\r\n" +
					            "  ╔═══════════════════════════════╗\r\n" +
					            "  ║     JUGADOR 2 ESCOJA CLASE    ║\r\n" +
					            "  ╚═══════════════════════════════╝\r\n" +
					            "");
						menuClases();
						int opcionMenuClase2 = sc.nextInt();
						if (opcionMenuClase2 == 1) {
							// Crear clase Caballero
							Clase c1 = new Caballero();
							Jugador2.setClase(c1);
							Jugador2.aplicarClase();

							System.out.println("\r\n" +
						            "  ╔═══════════════════════════════╗\r\n" +
						            "  ║   JUGADOR 2 ESCOJA 2 OBJETOS  ║\r\n" +
						            "  ╚═══════════════════════════════╝\r\n" +
						            "");
							
							for (int ob = 0; ob <= 1; ob++) {
								menuObjetos();
								int opcionMenuObjetos1 = sc.nextInt();
								if (opcionMenuObjetos1 == 1) {
									Objeto o1 = new Espada();
									Jugador2.agregarObjeto(o1);

								} else if (opcionMenuObjetos1 == 2) {
									Objeto o2 = new Escudo();
									Jugador2.agregarObjeto(o2);

								} else if (opcionMenuObjetos1 == 3) {
									Objeto o3 = new Cinturon();
									Jugador2.agregarObjeto(o3);

								} else if (opcionMenuObjetos1 == 4) {
									Objeto o4 = new Lanza();
									Jugador2.agregarObjeto(o4);

								} else if (opcionMenuObjetos1 == 5) {
									Objeto o5 = new Manzana();
									Jugador2.agregarObjeto(o5);
								}
							}

						} else if (opcionMenuClase2 == 2) {
							// Crear clase Mago
							Clase c2 = new Mago();
							Jugador2.setClase(c2);
							Jugador2.aplicarClase();

							System.out.println("\r\n" +
						            "  ╔═══════════════════════════════╗\r\n" +
						            "  ║   JUGADOR 2 ESCOJA 2 OBJETOS  ║\r\n" +
						            "  ╚═══════════════════════════════╝\r\n" +
						            "");
							
							for (int ob = 0; ob <= 1; ob++) {
								menuObjetos();
								int opcionMenuObjetos1 = sc.nextInt();

								if (opcionMenuObjetos1 == 1) {
									// Crear objeto Espada
									Objeto o1 = new Espada();
									Jugador2.agregarObjeto(o1);

								} else if (opcionMenuObjetos1 == 2) {
									// Crear objeto Escudo
									Objeto o2 = new Escudo();
									Jugador2.agregarObjeto(o2);

								} else if (opcionMenuObjetos1 == 3) {
									// Crear objeto Cinturon
									Objeto o3 = new Cinturon();
									Jugador2.agregarObjeto(o3);

								} else if (opcionMenuObjetos1 == 4) {
									Objeto o4 = new Lanza();
									Jugador2.agregarObjeto(o4);

								} else if (opcionMenuObjetos1 == 5) {
									Objeto o5 = new Manzana();
									Jugador2.agregarObjeto(o5);

								}
							}

						} else if (opcionMenuClase2 == 3) {
							// Crear clase Mercenario
							Clase c3 = new Mercenario();
							Jugador2.setClase(c3);
							Jugador2.aplicarClase();

							System.out.println("\r\n" +
						            "  ╔═══════════════════════════════╗\r\n" +
						            "  ║   JUGADOR 2 ESCOJA 2 OBJETOS  ║\r\n" +
						            "  ╚═══════════════════════════════╝\r\n" +
						            "");
							
							for (int ob = 0; ob <= 1; ob++) {
								menuObjetos();
								int opcionMenuObjetos1 = sc.nextInt();

								if (opcionMenuObjetos1 == 1) {
									// Crear objeto Espada
									Objeto o1 = new Espada();
									Jugador2.agregarObjeto(o1);

								} else if (opcionMenuObjetos1 == 2) {
									// Crear objeto Escudo
									Objeto o2 = new Escudo();
									Jugador2.agregarObjeto(o2);

								} else if (opcionMenuObjetos1 == 3) {
									// Crear objeto Cinturon
									Objeto o3 = new Cinturon();
									Jugador2.agregarObjeto(o3);

								} else if (opcionMenuObjetos1 == 4) {
									Objeto o4 = new Lanza();
									Jugador2.agregarObjeto(o4);

								} else if (opcionMenuObjetos1 == 5) {
									Objeto o5 = new Manzana();
									Jugador2.agregarObjeto(o5);

								}
							}

						}

					} else if (opcionMenuPersonajes == 3) {
						// Crear Personaje Dragon
						Jugador2= new Dragon(null);
						System.out.println("\r\n" +
					            "  ╔═══════════════════════════════╗\r\n" +
					            "  ║     JUGADOR 2 ESCOJA CLASE    ║\r\n" +
					            "  ╚═══════════════════════════════╝\r\n" +
					            "");
						menuClases();
						int opcionMenuClase3 = sc.nextInt();
						if (opcionMenuClase3 == 1) {
							// Crear clase Caballero
							Clase c1 = new Caballero();
							Jugador2.setClase(c1);
							Jugador2.aplicarClase();
							
							System.out.println("\r\n" +
						            "  ╔═══════════════════════════════╗\r\n" +
						            "  ║   JUGADOR 2 ESCOJA 2 OBJETOS  ║\r\n" +
						            "  ╚═══════════════════════════════╝\r\n" +
						            "");
							
							for (int ob = 0; ob <= 1; ob++) {
								menuObjetos();
								int opcionMenuObjetos1 = sc.nextInt();
								if (opcionMenuObjetos1 == 1) {
									// Crear objeto Espada
									Objeto o1 = new Espada();
									Jugador2.agregarObjeto(o1);

								} else if (opcionMenuObjetos1 == 2) {
									// Crear objeto Escudo
									Objeto o2 = new Escudo();
									Jugador2.agregarObjeto(o2);

								} else if (opcionMenuObjetos1 == 3) {
									// Crear objeto Cinturon
									Objeto o3 = new Cinturon();
									Jugador2.agregarObjeto(o3);

								} else if (opcionMenuObjetos1 == 4) {
									Objeto o4 = new Lanza();
									Jugador2.agregarObjeto(o4);

								} else if (opcionMenuObjetos1 == 5) {
									Objeto o5 = new Manzana();
									Jugador2.agregarObjeto(o5);

								}
							}

						} else if (opcionMenuClase3 == 2) {
							// Crear clase Mago
							Clase c2 = new Mago();
							Jugador2.setClase(c2);
							Jugador2.aplicarClase();
							
							System.out.println("\r\n" +
						            "  ╔═══════════════════════════════╗\r\n" +
						            "  ║   JUGADOR 2 ESCOJA 2 OBJETOS  ║\r\n" +
						            "  ╚═══════════════════════════════╝\r\n" +
						            "");
							
							for (int ob = 0; ob <= 1; ob++) {
								menuObjetos();
								int opcionMenuObjetos1 = sc.nextInt();
								if (opcionMenuObjetos1 == 1) {
									// Crear objeto Espada
									Objeto o1 = new Espada();
									Jugador2.agregarObjeto(o1);

								} else if (opcionMenuObjetos1 == 2) {
									// Crear objeto Escudo
									Objeto o2 = new Escudo();
									Jugador2.agregarObjeto(o2);

								} else if (opcionMenuObjetos1 == 3) {
									// Crear objeto Cinturon
									Objeto o3 = new Cinturon();
									Jugador2.agregarObjeto(o3);

								} else if (opcionMenuObjetos1 == 4) {
									Objeto o4 = new Lanza();
									Jugador2.agregarObjeto(o4);

								} else if (opcionMenuObjetos1 == 5) {
									Objeto o5 = new Manzana();
									Jugador2.agregarObjeto(o5);

								}
							}

						} else if (opcionMenuClase3 == 3) {
							// Crear clase Mercenario
							Clase c3 = new Mercenario();
							Jugador2.setClase(c3);
							Jugador2.aplicarClase();
							
							System.out.println("\r\n" +
						            "  ╔═══════════════════════════════╗\r\n" +
						            "  ║   JUGADOR 2 ESCOJA 2 OBJETOS  ║\r\n" +
						            "  ╚═══════════════════════════════╝\r\n" +
						            "");
							
							for (int ob = 0; ob <= 1; ob++) {
								menuObjetos();
								int opcionMenuObjetos1 = sc.nextInt();
								if (opcionMenuObjetos1 == 1) {
									// Crear objeto Espada
									Objeto o1 = new Espada();
									Jugador2.agregarObjeto(o1);

								} else if (opcionMenuObjetos1 == 2) {
									// Crear objeto Escudo
									Objeto o2 = new Escudo();
									Jugador2.agregarObjeto(o2);

								} else if (opcionMenuObjetos1 == 3) {
									// Crear objeto Cinturon
									Objeto o3 = new Cinturon();
									Jugador2.agregarObjeto(o3);

								} else if (opcionMenuObjetos1 == 4) {
									Objeto o4 = new Lanza();
									Jugador2.agregarObjeto(o4);

								} else if (opcionMenuObjetos1 == 5) {
									Objeto o5 = new Manzana();
									Jugador2.agregarObjeto(o5);

								}
							}

						}
					}

				}
			 
		 if (opcion == 2) {
			System.out.println("TE ARREPENTIRAS...");
			
			
		}
		 
		 while (Jugador1.getVidaPer() > 0 && Jugador2.getVidaPer() > 0) {
			    Jugador1.mostrarEstadisticas();
			    Jugador2.mostrarEstadisticas();

			    // Determinar orden por velocidad
			    Personaje primero = (Jugador1.getVelocidadPer() >= Jugador2.getVelocidadPer()) ? Jugador1 : Jugador2;
			    Personaje segundo = (primero == Jugador1) ? Jugador2 : Jugador1;

			    // Turno del primero
			    System.out.println("\r\n" +
			        "  ╔══════════════════════════════════════════════╗\r\n" +
			        "   Turno de " + String.format("%-34s", primero.getNombre() + " " + primero.getClase().getNombre() + " (Vida: " + primero.getVidaPer() + ")") + "\r\n" +
			        "  ╠══════════════════════════════════════════════╣\r\n" +
			        "  ║ 1. Atacar                                    ║\r\n" +
			        "  ║ 2. Usar objeto                               ║\r\n" +
			        "  ║ 3. Ataque especial                           ║\r\n" +
			        "  ╚══════════════════════════════════════════════╝\r\n" +
			        "");
			    int accion = sc.nextInt();
			    System.out.println("//////////////////////////////////////////////////////////////////////");
			    if (accion == 2) {
			        primero.mostrarInventario();
			        boolean tieneObjetos = false;
			        for (Objeto obj : primero.inventario) {
			            if (obj != null) {
			                tieneObjetos = true;
			                break;
			            }
			        }
			        if (tieneObjetos) {
			            System.out.println("Elige un objeto (1-" + primero.objetosEnInventario + "):");
			            int opcionObjeto = sc.nextInt() - 1;
			            if (opcionObjeto >= 0 && opcionObjeto < primero.inventario.length && primero.inventario[opcionObjeto] != null) {
			                Objeto objeto = primero.inventario[opcionObjeto];
			                primero.usarObjeto(objeto, segundo);
			            } else {
			                System.out.println("Opción inválida. Turno perdido.");
			            }
			        } else {
			            System.out.println("No tienes objetos. Turno perdido.");
			        }
			    } else if (accion == 1) {
			        primero.atacar(segundo);
			    } else if (accion == 3 && !primero.getAtaqueEspUsado()) {
			        primero.ataqueEspecial();
			    }
			    System.out.println("//////////////////////////////////////////////////////////////////////");
			    if (segundo.getVidaPer() <= 0) break;

			    // Turno del segundo
			    System.out.println("\r\n" +
			        "  ╔══════════════════════════════════════════════╗\r\n" +
			        "   Turno de " + String.format("%-34s", segundo.getNombre() + " " + segundo.getClase().getNombre() + " (Vida: " + segundo.getVidaPer() + ")") + "\r\n" +
			        "  ╠══════════════════════════════════════════════╣\r\n" +
			        "  ║ 1. Atacar                                    ║\r\n" +
			        "  ║ 2. Usar objeto                               ║\r\n" +
			        "  ║ 3. Ataque especial                           ║\r\n" +
			        "  ╚══════════════════════════════════════════════╝\r\n" +
			        "");
			    accion = sc.nextInt();
			    System.out.println("//////////////////////////////////////////////////////////////////////");
			    if (accion == 2) {
			        segundo.mostrarInventario();
			        boolean tieneObjetos = false;
			        for (Objeto obj : segundo.inventario) {
			            if (obj != null) {
			                tieneObjetos = true;
			                break;
			            }
			        }
			        if (tieneObjetos) {
			            System.out.println("Elige un objeto (1-" + segundo.objetosEnInventario + "):");
			            int opcionObjeto = sc.nextInt() - 1;
			            if (opcionObjeto >= 0 && opcionObjeto < segundo.inventario.length && segundo.inventario[opcionObjeto] != null) {
			                Objeto objeto = segundo.inventario[opcionObjeto];
			                segundo.usarObjeto(objeto, primero);
			            } else {
			                System.out.println("Opción inválida. Turno perdido.");
			            }
			        } else {
			            System.out.println("No tienes objetos. Turno perdido.");
			        }
			    } else if (accion == 1) {
			        segundo.atacar(primero);
			    } else if (accion == 3 && !segundo.getAtaqueEspUsado()) {
			        segundo.ataqueEspecial();
			    }
			    System.out.println("//////////////////////////////////////////////////////////////////////");
			}

			System.out.println("¡Combate terminado! Ganador: " + 
			    (Jugador1.getVidaPer() > 0 ? Jugador1.getNombre()+" "+Jugador1.clase.getNombre() : Jugador2.getNombre()+" "+Jugador2.clase.getNombre()));
	}
	/* MENUS */

	/* MENU DE LOS PERSONAJES */
    static void menuPersonajes() {
        System.out.println("\r\n" +
            "  ╔═════════════════════════════════════════════╗\r\n" +
            "  ║           Introducir 1, 2 o 3               ║\r\n" +
            "  ╠═════════════════════════════════════════════╣\r\n" +
            "  ║ 1. Duende:                                  ║\r\n" +
            "  ║ Vida: 55   Ataque: 65   Crítico: 5%         ║\r\n" +
            "  ║ Defensa: 5   Velocidad: 50                  ║\r\n" +
            "  ║ Ataque Especial: Aumenta su defensa en 10   ║\r\n" +
            "  ║ puntos y su vida en 20 puntos               ║\r\n" +
            "  ╠═════════════════════════════════════════════╣\r\n" +
            "  ║ 2. Golem:                                   ║\r\n" +
            "  ║ Vida: 120   Ataque: 30   Crítico: 5%        ║\r\n" +
            "  ║ Defensa: 15   Velocidad: 15                 ║\r\n" +
            "  ║ Ataque Especial: Aumenta su ataque en 20    ║\r\n" +
            "  ║ puntos pero pierde toda su defensa          ║\r\n" +
            "  ╠═════════════════════════════════════════════╣\r\n" +
            "  ║ 3. Dragon:                                  ║\r\n" +
            "  ║ Vida: 90   Ataque: 50   Crítico: 5%         ║\r\n" +
            "  ║ Defensa: 10   Velocidad: 30                 ║\r\n" +
            "  ║ Ataque Especial: Reduce su vida en 30       ║\r\n" +
            "  ║ puntos pero aumenta su crítico un 15%       ║\r\n" +
            "  ╚═════════════════════════════════════════════╝\r\n" +
            "");
    }

    /* MENU DE LAS CLASES */
    static void menuClases() {
        System.out.println("\r\n" +
            "  ╔═════════════════════════════════════════════╗\r\n" +
            "  ║           Introducir 1, 2 o 3               ║\r\n" +
            "  ╠═════════════════════════════════════════════╣\r\n" +
            "  ║ 1. Caballero: Vida x1.25   Def. x2          ║\r\n" +
            "  ║ Ataque x0.5   Vel. x0.8   Crit. +5%         ║\r\n" +
            "  ║ - Guerrero resistente y defensivo           ║\r\n" +
            "  ║ Recomendado: Golem (tanque sólido)          ║\r\n" +
            "  ╠═════════════════════════════════════════════╣\r\n" +
            "  ║ 2. Mago: Vida x0.6   Ataque x1.2            ║\r\n" +
            "  ║ Def. x0.8   Vel. x1.15   Crit. +20%         ║\r\n" +
            "  ║ - Hechicero rápido y letal                  ║\r\n" +
            "  ║ Recomendado: Dragon (crítico poderoso)      ║\r\n" +
            "  ╠═════════════════════════════════════════════╣\r\n" +
            "  ║ 3. Mercenario: Vida x0.6   Ataque x0.6 (x2) ║\r\n" +
            "  ║ Def. x1   Vel. x1.4   Crit. +2%             ║\r\n" +
            "  ║ - Luchador ágil de doble golpe              ║\r\n" +
            "  ║ Recomendado: Duende (ataque rápido)         ║\r\n" +
            "  ╚═════════════════════════════════════════════╝\r\n" +
            "");
    }

    /* MENU DE LOS OBJETOS */
    static void menuObjetos() {
        System.out.println("\r\n" +
            "  ╔═════════════════════════════════════════════╗\r\n" +
            "  ║        Introducir 1, 2, 3, 4 o 5            ║\r\n" +
            "  ╠═════════════════════════════════════════════╣\r\n" +
            "  ║ 1. Espada de la Luna Eterna:                ║\r\n" +
            "  ║ - Una hoja forjada en plata celestial que   ║\r\n" +
            "  ║   brilla bajo la luz de la luna. Su filo    ║\r\n" +
            "  ║   nunca se desgasta y cada golpe asesta la  ║\r\n" +
            "  ║   frialdad de la noche eterna.              ║\r\n" +
            "  ║ Efecto: Aumenta el ataque en 10 puntos de   ║\r\n" +
            "  ║ forma permanente.                           ║\r\n" +
            "  ╠═════════════════════════════════════════════╣\r\n" +
            "  ║ 2. Escudo del Último Bastión:               ║\r\n" +
            "  ║ - Un escudo impenetrable, legado de un      ║\r\n" +
            "  ║   reino caído. Su portador es la última     ║\r\n" +
            "  ║   defensa entre la oscuridad y la esperanza.║\r\n" +
            "  ║ Efecto: Aumenta la defensa en 10 puntos e   ║\r\n" +
            "  ║ inflige 20 puntos de daño.                  ║\r\n" +
            "  ╠═════════════════════════════════════════════╣\r\n" +
            "  ║ 3. Cinturón del Gigante Errante:            ║\r\n" +
            "  ║ - Un cinturón de cuero rúnico, imbuido con  ║\r\n" +
            "  ║   la fuerza de los titanes. Quien lo lleva  ║\r\n" +
            "  ║   siente un poder colosal en sus venas.     ║\r\n" +
            "  ║ Efecto: Aumenta la vida máxima en 30 puntos ║\r\n" +
            "  ║ de forma permanente.                        ║\r\n" +
            "  ╠═════════════════════════════════════════════╣\r\n" +
            "  ║ 4. Lanza del Juicio:                        ║\r\n" +
            "  ║ - Forjada en los fuegos de un volcán        ║\r\n" +
            "  ║   sagrado, brilla con una llama azulada     ║\r\n" +
            "  ║   que arde ante los indignos. Cada          ║\r\n" +
            "  ║   lanzamiento es un veredicto divino.       ║\r\n" +
            "  ║ Efecto: Incrementa la probabilidad de       ║\r\n" +
            "  ║ crítico en 20% de forma permanente.         ║\r\n" +
            "  ╠═════════════════════════════════════════════╣\r\n" +
            "  ║ 5. Manzana de la Creación:                  ║\r\n" +
            "  ║ - Un fruto místico que contiene la esencia  ║\r\n" +
            "  ║   del primer árbol del mundo. Al probarla,  ║\r\n" +
            "  ║   su consumidor obtiene una segunda         ║\r\n" +
            "  ║   oportunidad.                              ║\r\n" +
            "  ║ Efecto: Reajusta la vida de ambos           ║\r\n" +
            "  ║ jugadores, repartiendo equitativamente.     ║\r\n" +
            "  ╚═════════════════════════════════════════════╝\r\n" +
            "");
    }
}








/*combate*/