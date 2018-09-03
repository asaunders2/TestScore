package com.saunders2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       //array list for scores
        //ArrayList<Integer> testScores = new ArrayList<Integer>();

        Scanner score = new Scanner(System.in);
        double scores[] = new double[3];

        for (int i = 0; i < scores.length; i++)
        {
            System.out.println("Please enter number");
            scores[i] = score.nextInt();
        }

    }
}
