# Spring2Word

**Ampliación de la lógica de juego**

Objetivos:
• Ampliar la lógica del juego para incluir retroalimentación detallada sobre las suposiciones.
• Continuar el desarrollo utilizando TDD.

**1ER CICLO TDD :  `secondLetterWrongPosition` & `allScoreCombinations`**

ROJO :

![Untitled](images/Untitled.png)

Ejecutamos  la prueba :

![Untitled](images/Untitled%201.png)

VERDE :

**.** Agreguemos al código inicial para verificar todas las letras en nuestra adivinación:

![Untitled](images/Untitled%202.png)

![Untitled](images/Untitled%203.png)

![Untitled](images/Untitled%204.png)

La prueba paso!! (**`Verde`**)

![Untitled](images/Untitled%205.png)

AZUL : REFACTORIZACION :

Podemos refactorizar la clase Score :

![Untitled](images/Untitled%206.png)

Ejecutemos las pruebas :

![Untitled](images/Untitled%207.png)

Ahora con el uso de Sonarquebe :

![Untitled](images/Untitled%208.png)

Vamos a corregir los 2 olores de codigo :

![Untitled](images/Untitled%209.png)

![Untitled](images/Untitled%2010.png)

Removemos :

![Untitled](images/Untitled%2011.png)

Ejecutamos nuevamente los test :

![Untitled](images/Untitled%2012.png)

![Untitled](images/Untitled%2013.png)
![Untitled](images/Untitled%2013.png)