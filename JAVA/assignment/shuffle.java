package assignment;

import java.util.Random;

public class shuffle {

	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(array);

        System.out.print("Shuffled Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void shuffleArray(int[] array) {
        int n = array.length;
        Random rand = new Random();

        // Iterate from the end to the beginning of the array
        for (int i = n - 1; i > 0; i--) {
            // Generate a random index in the range [0, i]
            int j = rand.nextInt(i + 1);

            // Swap the elements at indices i and j
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}