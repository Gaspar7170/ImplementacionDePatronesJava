# State
Implementacion de patron State

# Dominio
-Restaurante

# Clases
-Pedido
-Estado

# Clases de Estado
-Creado
-En curso
-Finalizado/Entregado
-Cancelado

# Informacion
La estructura del patron **State** puede resultar similar al patrón **Strategy**, pero hay una diferencia clave. En el patrón State, los estados particulares pueden conocerse entre sí e iniciar transiciones de un estado a otro, mientras que las estrategias casi nunca se conocen.

# Anotaciones/Preguntas
Esta bien que un estado guarde la instancia del pedido? o esta debera de ser inyectada cada vez que se tansicione de estado?