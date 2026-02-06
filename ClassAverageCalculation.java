public class ClassAverageCalculation {
    
    public double calculateClassAverage(double score1, double score2) {
        return (score1 + score2) / 2;
    }

    public double calculateClassAverage(double score1, double score2, double score3) {
        return (score1 + score2 + score3) / 3;
    }

    public double calculateClassAverage(double[] scores) {
        if(scores == null || scores.length == 0) {
            return 0.0;
        }
        double total = 0.0;
        for (double score : scores) {
            total += score;
        }
        return total / scores.length;
    }
}
