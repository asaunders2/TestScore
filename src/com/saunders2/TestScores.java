package com.saunders2;

/** Defines the attributes and behaviors of the TestScores class
 * @author asaunders2
 * @version 1.1 9/2/2018
 */
public class TestScores {
    double testScores[];

    /** Constructs a new TestScores object with testScores as a variable
     * @param _testScores the score to be passed in and checked
     * @throws Exception if the number is not an expected value it will be rejected
     */
    public TestScores(double _testScores[]) throws Exception {
        testScores = _testScores;

        //test each score in the testScores array
        for (double score : testScores) {
            if(score < 0){
                throw new Exception("Number is less than 0"); // exception for negatives
            }else if(score > 100){
                throw new Exception("Number is larger than 100"); //exception for numbers greater than 100
            }
        }
    }

    /** Calculates the averageScore of the testScores
     * @param totalScore   the total of all scores entered
     * @param averageScore the average of all scores entered
     * @return returns the average score from the scores entered
     */
    public double calculateAverage() {
        double totalScore = 0;
        double averageScore;

        for (double score : testScores) {
            totalScore = score + totalScore;
        }

        averageScore = (totalScore/testScores.length);

        return averageScore;
    }
}
