import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] array1 = new int[]{1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        int[] array3 = new int[65];
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] array1 = new int[]{1, 2, 3};
        for (int i = 0; i < array1.length; i++) {
            if (i == array1.length - 1) {
                System.out.println(array1[i]);
                break;
            }
            System.out.print(array1[i] + ", ");
        }

        double[] array2 = {1.57, 7.654, 9.986};
        for (int k = 0; k < array2.length; k++) {
            if (k == array2.length - 1) {
                System.out.println(array2[k]);
                break;
            }
            System.out.print(array2[k] + ", ");
        }

        int[] array3 = new int[9];
        for (int j = 0; j < array3.length; j++) {
            if (j == array3.length - 1) {
                System.out.println(array3[j]);
                break;
            }
            System.out.print(array3[j] + ", ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] array1 = new int[]{1, 2, 3};
        for (int i = array1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array1[i]);
                break;
            }
            System.out.print(array1[i] + ", ");
        }

        double[] array2 = {1.57, 7.654, 9.986};
        for (int k = array2.length - 1; k >= 0; k--) {
            if (k == 0) {
                System.out.println(array2[k]);
                break;
            }
            System.out.print(array2[k] + ", ");
        }

        int[] array3 = new int[9];
        for (int j = array3.length - 1; j >= 0; j--) {
            if (j == 0) {
                System.out.println(array3[j]);
                break;
            }
            System.out.print(array3[j] + ", ");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] array1 = new int[]{1, 2, 3};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}
