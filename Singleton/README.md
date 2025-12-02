# Implementación del Patrón Strategy

## Strategy Diagram Class 

```mermaid
classDiagram

class Singleton {
    <<Singleton>>
    - $ instanciaUnica

    - $ new()
    + $ obtenerInstancia() Singleton
}

```

## Índice




## 1. Introducción  


---

## 2. Dominio de Aplicación


---

## 3. Diseño del Sistema


---

## 4. Marco Teórico



---

## 5. Estilo Arquitectónico

Se adopta una implementación acotada del estilo arquitectónico **Layered** (arquitectura en capas).

### Estructura aplicada:
Se define un único directorio:

- **Models**: contiene el dominio del negocio, incluyendo clases, métodos y atributos.

No se implementa persistencia, todas las operaciones se realizan en memoria.  
La ejecución del sistema se realiza desde la clase principal `App`.

---

## 6. Diagrama de clases

```mermaid
classDiagram



class Estado {
    <<Abstract>>
    - nombre : string
    - $ instance : Estado

    - $ new()
    + $ getInstance() Estado
}


class Cancelado{

}
class Entregado{

}
class EnCurso{

}

class Pedido {
    - estado : Estado
    + getEstado() Estado
    + new()
}

Pedido --> Estado : estado
Creado --|> Estado
EnCurso --|> Estado
Entregado --|> Estado
Cancelado --|> Estado


```

```mermaid
classDiagram
    %% Contexto: El objeto que cambia de comportamiento
    class GameContext {
        -GameState estadoActual
        +setState(GameState nuevoEstado)
        +presionarBoton()
    }

    %% Interfaz de Estado
    class GameState {
        <<interface>>
        +manejarInput()
    }

    %% Estado Concreto 1: MENÚ (Es Singleton)
    class EstadoMenu {
        -static EstadoMenu instancia
        -EstadoMenu()
        +static getInstance()$ EstadoMenu
        +manejarInput()
    }

    %% Estado Concreto 2: JUGANDO (Es Singleton)
    class EstadoJugando {
        -static EstadoJugando instancia
        -EstadoJugando()
        +static getInstance()$ EstadoJugando
        +manejarInput()
    }

    %% Relaciones
    GameContext o-- GameState : Tiene un
    GameState <|.. EstadoMenu : Implementa
    GameState <|.. EstadoJugando : Implementa

    %% Notas explicativas
    note for EstadoMenu "Singleton:\nConstructor privado (-)\nAcceso estático ($)"
    note for EstadoJugando "Se reutiliza la misma instancia\ncada vez que volvemos a este estado"
```


---

## 7. Desarrollo de la Implementación

### 7.1 App.java


### 7.5 SueldoTemporal.java

---

## 8. Conclusión


---

## 9. Consideraciones Finales
