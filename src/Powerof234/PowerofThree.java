package Powerof234;

public class PowerofThree {
    public boolean isPowerOfThree(int n) {
        return (n > 0 && 1162261467 % n == 0); // Math.pow(3,19);
    }
}
