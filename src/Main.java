import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] arrayOne = new int[]{1, 2, 3};
        double[] arrayTwo = {1.57, 7.654, 9.986};
        int[] atomicWeights = {1, 12, 16, 14, 23, 39, 31};
        //Задача 2
        System.out.println("Задача 2");
        for (int i = 0; i < arrayOne.length; i++) {
            if (i != (arrayOne.length - 1)) {
                System.out.print(arrayOne[i] + ", ");
            } else {
                System.out.println(arrayOne[i]);
            }
        }
        for (int i = 0; i < arrayTwo.length; i++) {
            if (i != (arrayTwo.length - 1)) {
                System.out.print(arrayTwo[i] + ", ");
            } else {
                System.out.println(arrayTwo[i]);
            }
        }
        for (int i = 0; i < atomicWeights.length; i++) {
            if (i != (atomicWeights.length - 1)) {
                System.out.print(atomicWeights[i] + ", ");
            } else {
                System.out.println(atomicWeights[i]);
            }
        }
        //Задача 3
        System.out.println("\nЗадача 3");
        for (int i = arrayOne.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrayOne[i] + ", ");
            } else {
                System.out.println(arrayOne[i]);
            }
        }
        for (int i = arrayTwo.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrayTwo[i] + ", ");
            } else {
                System.out.println(arrayTwo[i]);
            }
        }
        for (int i = atomicWeights.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(atomicWeights[i] + ", ");
            } else {
                System.out.println(atomicWeights[i]);
            }
        }
        //Задача 4
        System.out.println("\nЗадача 4");
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2 != 0) {
                arrayOne[i]++;
            }
        }
        System.out.println(Arrays.toString(arrayOne));
    }
}