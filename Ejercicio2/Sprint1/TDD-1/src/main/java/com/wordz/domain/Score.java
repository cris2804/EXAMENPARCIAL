package com.wordz.domain;
public class Score {
    private final String correct;
    private Letter resultado = Letter.INCORRECT;
    public Score(String correct) {
        this.correct = correct;
    }
    public Letter letter(int position) {
        return resultado;
    }

    public void assess(int position,String attempt) {
        if(isCorrectLetter(position, attempt)){
        resultado = Letter.CORRECT;
        }
    }

    private boolean isCorrectLetter(int position, String currentLetter) {
        return correct.charAt(position) == currentLetter.charAt(position);
    }
    private boolean occursInWord(char current) {
        return correct.contains(String.valueOf(current));
    }
}
