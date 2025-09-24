/*
 * Write a program SumOfTwoDice.java that
 * prints the sum of two random integers between 1 and 6
 * (such as you might get when rolling dice).
 */

public class SumOfTwoDice {
    public static void main(String[] args) {
        int sidesOfDice = 6;

        int a = 1 + (int) (Math.random() * sidesOfDice);
        int b = 1 + (int) (Math.random() * sidesOfDice);

        int sum = a + b;
        System.out.println(sum);
    }
}
