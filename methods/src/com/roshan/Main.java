package com.roshan;

public class Main {

    public static void main(String[] args) {
	// challenge 1
     int position = calculatedHighScore(1500);
     displayHighScorePosition("Ram",position);

    position = calculatedHighScore(900);
    displayHighScorePosition("Shyam",position);

    position = calculatedHighScore(400);
    displayHighScorePosition("Hari",position);

    position = calculatedHighScore(100);
    displayHighScorePosition("bob",position);

    }

    public static void displayHighScorePosition(String name,int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculatedHighScore(int score){
        if(score >= 1000){
            return 1;
        }
        else if(score >= 500){
            return 2;
        }
        else if(score >= 100){
            return 3;
        }
        else{
            return 4;
        }
    }

}
