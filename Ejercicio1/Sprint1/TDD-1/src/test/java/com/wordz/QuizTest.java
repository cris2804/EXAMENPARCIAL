package com.wordz;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Nested
public class QuizTest {

        @Test
        public void VerificarQueLaCargaDePreguntasDesdeUnRepositorioOArchivonoestevacio() {
            //arrange
            ReposirioQuestion repository = new ReposirioQuestion();
            //act
            List<Question> questions = repository.loadQuestions();

            // Verificar que las preguntas se carguen correctamente assert
            assertNotNull(questions);
        }

        @Test
        public void testLoadQuestionsFromRepository() {
            // Simular la carga de preguntas desde un repositorio o archivo
            ReposirioQuestion repository = new ReposirioQuestion();
            List<Question> questions = repository.loadQuestions();
            // Verificar que las preguntas se carguen correctamente
            assertEquals(5, questions.size()); // Verifica el tamaño esperado de la lista de preguntas
        }
}
//assertEquals(5, questions.size());
//@Test
//void testLoadQuestionsFromRepository() {
//    // Simular la carga de preguntas desde un repositorio o archivo
//    QuestionRepository repository = new QuestionRepository();
//    List<Question> questions = repository.loadQuestions();
//
//    // Verificar que las preguntas se carguen correctamente
//    assertNotNull(questions);
//    assertEquals(5, questions.size()); // Verifica el tamaño esperado de la lista de preguntas
//    // Agrega más aserciones según la estructura y contenido esperado de las preguntas
//}
//. Inicio del juego: Al lanzar el juego, se debe mostrar un mensaje de bienvenida junto con las
//instrucciones sobre cómo jugar.
//        2. Número de rondas: El juego constará de un total de 10 rondas, cada una con una pregunta
//única.
//3. Preguntas: Se presenta una pregunta con cuatro opciones de respuesta numeradas. Solo
//una opción es correcta.
//        4. Selección de respuesta: El jugador elige su respuesta ingresando el número correspondiente
//a la opción elegida.
//        5. Puntuación: Cada respuesta correcta otorga un punto. No se penaliza por respuestas
//incorrectas.
//6. Fin del juego: Al finalizar las rondas, se muestra la puntuación total del jugador, junto con un
//desglose de respuestas correctas e incorrectas.

//Casos de prueba para JUnit:
//        • Verificar que la carga de preguntas desde un repositorio o archivo esté correcta.
//• Asegurar que el sistema acepte y valide respuestas de manera adecuada, incluyendo la
//captura de entradas inválidas como letras o números fuera del rango.