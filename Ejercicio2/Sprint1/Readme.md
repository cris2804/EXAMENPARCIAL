# Spring1 Word

En este sprint, se configura el entorno y se implementa la lógica básica del juego.

Haremos uso del enfoque **TDD** para las pruebas unitarias ademas usaremos **Soanrqube** para la refactorizacion del codigo .

**Clase Word**
La clase Word será responsable de almacenar la palabra correcta y evaluar las suposiciones.
Usaremos el código proporcionado para definir cómo se verifica cada suposición:

![Untitled](images/Untitled.png)

**Clase Score**

![Untitled](images/Untitled%201.png)

Ahora usaremos el enfoque TDD para las pruebas iniciales

**1°Ciclo TDD: `oneIncorrectLetter` & `oneCorrectLetter`**

ROJO :

![Untitled](images/Untitled%202.png)

![Untitled](images/Untitled%203.png)

La prueba `**oneIncorrectLetter`** verifica que  la letra de la palabra correcta no coincide con la letra ingresada , en caso de ser incorrecta imprime INCORRECT mientras que `oneCorrectLetter` verifica que la letra ingresada sea la misma letra correcta y en caso de ello imprime CORRECT.

![Untitled](images/Untitled%204.png)

La prueba falla !

VERDE :

Corrijamos los errores, para que la prueba pase .

![Untitled](images/Untitled%205.png)

La prueba paso :

![Untitled](images/Untitled%206.png)

AZUL REFACTORIZACION :

Vemos que podemos refactorizar el metodo asses , para ello crearemos el metodo  `scoreFor`

![Untitled](images/Untitled%207.png)

![Untitled](images/Untitled%208.png)

![Untitled](images/Untitled%209.png)

Haciendo uso de Sonarquebe vemos los olores de codigo:

1er olor de codigo :

![Untitled](images/Untitled%2010.png)

![Untitled](images/Untitled%2011.png)

Ejecutamos nuevamente las pruebas para ver que no se hayan generado errores  :

![Untitled](images/Untitled%2012.png)

2do olor de codigo :

![Untitled](images/Untitled%2013.png)

![Untitled](images/Untitled%2014.png)

Ejecutamos las pruebas nuevamente :

![Untitled](images/Untitled%2015.png)