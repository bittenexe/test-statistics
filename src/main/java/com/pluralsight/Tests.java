package com.pluralsight;

public class Tests {
    public static void main(String[] args) {
        int[] testScores = {96, 75, 65, 89, 77, 67, 69, 94, 85, 72};

        int highScore = testScores[0];
        int lowScore = testScores[0];
        int total = 0;

        for (int i = 0; i < testScores.length; i++) {
            total += testScores[0];

            if (testScores[i] > highScore) {
                highScore = testScores[i];
            }

            if (testScores[i] < lowScore) {
                lowScore = testScores[i];
            }

            double average = (double) total / testScores.length;

            System.out.println("High score: " + highScore);
            System.out.println("Low score: " + lowScore);
            System.out.println("Average: " + average);
            }
        }
    }


