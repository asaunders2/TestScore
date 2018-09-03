package com.saunders2;

public class TestScores {
    private int score1, score2, score3, averageScore;
    
    public TestScores(int _score1, int _score2, int _score3){
        score1 = _score1;
        score2 = _score2;
        score3 = _score3;
    }
    
    public int getScore1(){
        return score1;
    }
    
    public void setScore1(int _score1){
        score1 = _score1;
    }
    
    public int getScore2(){
        return score2;
    }
    
    public void setScore2(int _score2){
        score2 = _score2;
    }
    
    public int getScore3(){
        return score3;
    }
    
    public void setScore3(int _score3){
        score3 = _score3;
    }
    
    public int getAverage(){
        averageScore = (score1 + score2 + score3)/3;
        return averageScore;
    }
}
