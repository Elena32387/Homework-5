import java.sql.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1 и 2");

        int[] arrOne = new int[3];
        arrOne[0] = 1;
        arrOne[1] = 2;
        arrOne[2] = 3;
        System.out.println(arrOne[0]);
        System.out.println(arrOne[1]);
        System.out.println(arrOne[2]);

        double[] arrTwo = {1.57, 7.654, 9.986};
        System.out.println(arrTwo[0]);
        System.out.println(arrTwo[1]);
        System.out.println(arrTwo[2]);

        byte[] arrThree = {-77, 2, 100};
        System.out.println(arrThree[0]);
        System.out.println(arrThree[1]);
        System.out.println(arrThree[2]);

        System.out.println("Задание 2");

        int[] firstArray = new int[]{1, 2, 3};
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i]);
            if (i != firstArray.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();


        double[] secondArray = {1.57, 7.654, 9.986};
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i]);
            if (i != secondArray.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();


        byte[] thirdArray = {-77, 2, 100};
        for (int i = 0; i < thirdArray.length; i++) {
            System.out.print(thirdArray[i]);
            if (i != thirdArray.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        System.out.println("Задание 3");

        for (int i = firstArray.length - 1; i >= 0; i--) {
            System.out.print(firstArray[i]);
            if (i != 0) {
                System.out.print(" , ");
            }
        }

        System.out.println();


        for (int i = secondArray.length - 1; i >= 0; i--) {
            System.out.print(secondArray[i]);
            if (i != 0) {
                System.out.print(" , ");
            }
        }

        System.out.println();

        for (int i = thirdArray.length - 1; i >= 0; i--) {
            System.out.print(thirdArray[i]);
            if (i != 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();

        System.out.println("Задание 4");

        for (int i = 0; i<firstArray.length; i++){
            if (firstArray[i] % 2 != 0){
                firstArray[i]++;}}
        System.out.println(Arrays.toString(firstArray));
            }
        }








