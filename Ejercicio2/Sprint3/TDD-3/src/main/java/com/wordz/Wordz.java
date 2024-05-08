package com.wordz;
import com.wordz.domain.Score;
import com.wordz.domain.Word;

import java.util.Scanner;

public class Wordz {
    public static void main(String[] args) {
        Word word = new Word("ganador"); //la palabra correcta es ganador

        Scanner scanner = new Scanner(System.in); //para leer la entrada del usuario
        boolean gameWon = false; //para saber si el juego ha terminado

        while (!gameWon) {
            System.out.println("Ingresa tu palabra: ");
            String guess = scanner.nextLine();

            Score score = word.guess(guess);
            // Mostrar resultados
            for (int i = 0; i < guess.length(); i++) {
                System.out.println("LETRA en la posicion " + i + ": " + score.letter(i));
            }

            // Mostrar si ganaste o perdiste
            if (score.isWordGuessed()) {
                System.out.println("Perdiste");
                gameWon = true;
            }else{
                System.out.println("perdiste");
                gameWon = true;
            }
        }

        scanner.close();
    }
}

