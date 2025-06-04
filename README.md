🧠 Juego de Árbol de Decisiones - Adivina el Animal
Este proyecto es un sencillo juego de adivinanzas que utiliza un árbol de decisiones para intentar adivinar el animal en el que estás pensando. A través de preguntas de sí o no, el programa recorre un árbol binario hasta llegar a una posible respuesta.

El objetivo principal del proyecto es aprender cómo almacenar y recorrer datos en una estructura de árbol, por lo que su diseño y lógica se han mantenido lo más simples posible, sin implementar controladores ni interfaces complejas.

🚀 ¿Cómo funciona?
El programa te pedirá que pienses en un animal.

Luego comenzará a hacerte preguntas de sí o no para reducir las posibilidades.

Si adivina el animal, ¡ganó!


📚 Objetivo educativo
Este proyecto fue diseñado como práctica para:

Entender el uso de estructuras de datos tipo árbol binario.

Aprender cómo almacenar información de forma jerárquica.

Implementar un sistema básico de "aprendizaje" sin utilizar bases de datos externas ni estructuras complejas.

🛠️ Tecnologías usadas
Lenguaje: Java

Entrada/salida por consola

Estructura de datos: Árbol binario simple

🗃️ Estructura del árbol
Cada nodo del árbol contiene:

Una pregunta o un animal

Un puntero a la respuesta sí (subárbol izquierdo)

Un puntero a la respuesta no (subárbol derecho)

📝 Notas
No se utilizó persistencia de datos (los datos se pierden al cerrar el programa, a menos que se extienda el proyecto).

No hay controladores ni manejo avanzado de errores: está enfocado puramente en la lógica del árbol.

Puede ser una buena base para agregar mejoras como persistencia en archivos o una interfaz gráfica.

