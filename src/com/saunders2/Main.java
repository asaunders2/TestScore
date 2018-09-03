package com.saunders2;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String _score1 = JOptionPane.showInputDialog("First Score: ");
        int score1 = Integer.parseInt(_score1);

        String _score2 = JOptionPane.showInputDialog("Second Score: ");
        int score2 = Integer.parseInt(_score2);

        String _score3 = JOptionPane.showInputDialog("Third Score: ");
        int score3 = Integer.parseInt(_score3);

        //output information
        TestScores average1 = new TestScores(score1, score2, score3);
        System.out.println("Score 1: " + average1.getScore1() + "\n" +
                "Score 2: " + average1.getScore2() + "\n" +
                "Score 3: " + average1.getScore3() + "\n" +
                "Average Score: " + average1.getAverage());
    }
}
