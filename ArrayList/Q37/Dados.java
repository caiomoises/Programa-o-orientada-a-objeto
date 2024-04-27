import java.security.SecureRandom;

public class Dados {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        int[] dice1 = { 1, 2, 3, 4, 5, 6 };
        int[] dice2 = { 1, 2, 3, 4, 5, 6 };

        int[] frequency = new int[13]; 
        int sum = 0;

        for (int i = 1; i <= 36000000; i++) {
            sum = dice1[randomNumbers.nextInt(6)] + dice2[randomNumbers.nextInt(6)];

            ++frequency[sum];
        }

        for (int j = 2; j < frequency.length; j++) {
            System.out.printf("face: %d, frequency: %d\n", j, frequency[j]);
        }
    }
}

