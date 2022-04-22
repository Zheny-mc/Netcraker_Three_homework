package ru.netcraker.ch3.p8;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Student {
    @Getter
    private String name;
    @Getter
    private Integer totalScore;
    private int countTest;

    public Student(String name) {
        this.name = name;
        this.totalScore = 0;
    }

    public void addQuiz(int score) {
        totalScore += score;
        countTest++;
    }

    public Double getAverageScore() {
        return totalScore / (double)countTest;
    }
}
