public class perfectsquare {
    public static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false; // Negative numbers cannot be perfect squares
        }
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num; // Check if the square of the integer square root equals the original number
    }

    public static void main(String[] args) {
        int num = 16; // Example input
        if (isPerfectSquare(num)) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }
    }
}