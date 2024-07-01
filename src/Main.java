import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] doubleArray = new double[20];
        int[] intArray = new int[doubleArray.length];
        for (int i = 0; i < 20; i++) {
            doubleArray[i] = 1 + Math.random() * 15;
            intArray[i] = (int) doubleArray[i]; // Конвертируем из double в int
        }

        System.out.print("[");
        // Вывод элементов массива
        for (int i = 0; i < 20; i++) {
            System.out.print(intArray[i]);
            if (i < 19) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int repetitions = 0;
        while (repetitions < 20) {
            int currentNumber = intArray[repetitions];
            int count = 0;
            if (currentNumber != -1) {
                for (int i = 0; i < 20; i++) {
                    if (intArray[i] == currentNumber) {
                        count += 1;
                        intArray[i] = -1;
                    }
                }
                if (count > 1) {
                    System.out.println("Число '" + currentNumber + "' встречается " + count + " раза");
                }
            }
            repetitions += 1;
        }
    }
}