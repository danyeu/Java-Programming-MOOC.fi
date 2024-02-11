package validating;

public class Calculator {

    public int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("num is negative");
        }
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        if (setSize < 0) {
            throw new IllegalArgumentException("setSize cannot be negative");
        }
        if (subsetSize < 0) {
            throw new IllegalArgumentException("subsetSize cannot be negative");
        }
        if (subsetSize > setSize) {
            throw new IllegalArgumentException("subsetSize cannot exceed setSize");
        }
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
