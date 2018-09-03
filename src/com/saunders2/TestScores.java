package com.saunders2;

public class TestScores {
    double testScores[];

    public TestScores(double _testScores[]) throws Exception {
        testScores = _testScores;

        for (double score : testScores) {
            if(score < 0){
                throw new Exception("Number is less than 0");
            }else if(score > 100){
                throw new Exception("Number is larger than 100");
            }
        }
    }


}
