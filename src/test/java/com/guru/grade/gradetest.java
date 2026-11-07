package com.guru.grade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class gradetest {

    @Test
    public void testGradeA() {
        int score = 95;
        assertEquals("A Grade", getGrade(score));
    }

    @Test
    public void testGradeB() {
        int score = 85;
        assertEquals("B Grade", getGrade(score));
    }

    @Test
    public void testGradeC() {
        int score = 75;
        assertEquals("C Grade", getGrade(score));
    }

    @Test
    public void testFail() {
        int score = 60;
        assertEquals("Fail", getGrade(score));
    }

    public String getGrade(int score) {
        if (score > 90) {
            return "A Grade";
        } else if (score > 80) {
            return "B Grade";
        } else if (score > 70) {
            return "C Grade";
        } else {
            return "Fail";
        }
    }
}