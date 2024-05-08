package com.wordz;

import java.util.List;

public class ReposirioQuestion {
    public List<Question> loadQuestions() {
        return List.of(new Question("Question 1","A","B","C","D"),
                new Question("Question 2","A","B","C","D"),
                new Question("Question 3","A","B","C","D"),
                new Question("Question 4","A","B","C","D"),
                new Question("Question 5","A","B","C","D"));
    }
}
