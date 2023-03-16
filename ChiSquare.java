import java.util.Random;
class DiceRoller {
    private Random random;
    private int die1;
    private int die2;

    public DiceRoller() {
        random = new Random();
    }
    public void rollDice() {
        die1 = random.nextInt(6) + 1;
        die2 = random.nextInt(6) + 1;
    }
    public int getSum() {
        return die1 + die2;
    }
}

public class ChiSquare{
    public static void main(String[] args) {
        DiceRoller diceRoller = new DiceRoller();
        int[] sums = new int[11];
        int numRolls = 1296;

        for (int i = 0; i < numRolls; i++) {
            diceRoller.rollDice();
            int sum = diceRoller.getSum();
            sums[sum-2]++;
        }

        System.out.println("Sum\tOccurrences");
        for (int i = 0; i < sums.length; i++) {
            System.out.println((i+2) + "\t" + sums[i]);
        }
        double[] expected = {1/36.0, 2/36.0, 3/36.0, 4/36.0, 5/36.0, 6/36.0, 5/36.0, 4/36.0, 3/36.0, 2/36.0, 1/36.0};
        double chiSquare = 0;
        for (int i = 0; i < sums.length; i++) {
            chiSquare += Math.pow((sums[i] - numRolls*expected[i]), 2) / (numRolls*expected[i]);
        }
        System.out.println("The Chi-square value is: " + chiSquare);
        if (chiSquare > 18.307) {
            System.out.println("biased dices.");
        }
        else{
            System.out.println("unbiased dices.");
        }
    }
}