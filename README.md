# ⚔️ JuegoDeRol

Simulador de combate por turnos desarrollado en **Java puro**, construido como ejercicio de aplicación de los principios de la Programación Orientada a Objetos: herencia, polimorfismo, clases abstractas y encapsulación.

## 📖 Descripción

JuegoDeRol es un sistema de batalla por turnos para **2 jugadores en local** (modo "hotseat"), jugable por consola. Cada jugador elige su personaje, su clase de combate y hasta 2 objetos especiales antes de enfrentarse en un duelo por turnos. El proyecto no se centra en gráficos ni interfaz, sino en modelar de forma limpia y extensible las reglas de un juego de rol clásico usando POO.

## 🧠 Objetivo del proyecto

Practicar y demostrar:
- Diseño de jerarquías de clases con **clases abstractas**
- **Polimorfismo** mediante sobreescritura de métodos (`usar()`, `ataqueEspecial()`, `aplicarClase()`)
- **Encapsulación** de estadísticas de combate mediante getters/setters con lógica de validación
- Composición de objetos (un `Personaje` tiene una `Clase` y un inventario de `Objeto`)

## 🏗️ Arquitectura

```
Personaje (abstracta)
├── Duende
├── Golem
└── Dragon

Clase
├── Caballero
├── Mago
└── Mercenario

Objeto (abstracta)
├── Espada
├── Escudo
├── Lanza
├── Manzana
└── Cinturon
```

**`Personaje`** — Clase base abstracta que define las estadísticas comunes (vida, ataque, defensa, velocidad, crítico), el inventario y el comportamiento base de ataque. Cada personaje concreto implementa su propio `ataqueEspecial()` y `aplicarClase()`.

**`Clase`** — Representa el "rol" de combate (Caballero, Mago, Mercenario), cada una con modificadores propios de ataque, crítico, defensa, velocidad y vida que se aplican multiplicativamente al personaje que la adopta.

**`Objeto`** — Clase base abstracta para los objetos de combate. Cada objeto concreto sobreescribe `usar(usuario, enemigo)` con su propio efecto único (buffs, daño, curación compartida...).

## ⚔️ Personajes disponibles

| Personaje | Vida | Ataque | Ataque especial |
|---|---|---|---|
| Duende | 55 | 65 | Aumenta defensa y vida, reduce velocidad |
| Golem | 120 | 30 | Aumenta ataque a costa de perder toda la defensa |
| Dragon | 90 | 50 | Sacrifica vida a cambio de crítico |

Cada ataque especial solo puede usarse **una vez por partida**.

## 🛡️ Clases de combate

| Clase | Estilo | Combinación recomendada |
|---|---|---|
| Caballero | Modificadores x2 defensa, x1.25 vida, x0.5 ataque — tanque puro | Golem (tanque sólido) |
| Mago | x1.2 ataque, +20% crítico, pero x0.6 vida — frágil y letal | Dragon (crítico poderoso) |
| Mercenario | x1.4 velocidad y doble golpe por turno | Duende (ataque rápido) |

## 🎒 Objetos especiales

- **Espada de la Luna Eterna** — Aumenta el ataque permanentemente
- **Escudo del Último Bastión** — Aumenta defensa e inflige daño directo
- **Lanza del Juicio** — Aumenta la probabilidad de crítico
- **Manzana de la Creación** — Reparte la vida entre ambos combatientes
- **Cinturón del Gigante Errante** — Aumenta la vida máxima

Cada personaje puede llevar hasta 2 objetos en su inventario.

## 🎮 Mecánicas de combate

- Sistema de golpe crítico basado en probabilidad (`getCriticoPer()`)
- El daño se calcula como `ataque - defensa del enemigo`, con un mínimo garantizado de 1 punto
- Los modificadores de clase se aplican una sola vez al iniciar la partida
- La vida nunca puede superar la vida máxima del personaje

## 🚀 Cómo ejecutar

```bash
# Compilar
javac JuegoDeRol/*.java

# Ejecutar
java JuegoDeRol.AppJuegoRol
```

Al iniciar, cada jugador (por turnos en la fase de preparación) elige su personaje, su clase de combate y 2 objetos. El orden de turnos en combate lo determina la velocidad de cada personaje. En cada turno se puede **atacar**, **usar un objeto** o lanzar el **ataque especial** (una única vez por partida). La partida termina cuando uno de los dos jugadores llega a 0 puntos de vida.

## 🛠️ Tecnologías

- Java (sin librerías externas)
- Paradigma orientado a objetos puro

## 📌 Estado del proyecto

Completado y jugable de extremo a extremo. Próximas mejoras posibles: persistencia de partidas, más clases/objetos, interfaz gráfica.

---

Proyecto desarrollado como parte del ciclo de Desarrollo de Aplicaciones Web (DAW).
