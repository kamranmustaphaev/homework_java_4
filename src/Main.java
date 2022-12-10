import java.util.Scanner;
//    1) Создать массивы типа: int, double и создать методы, для их вывода на консоль
//    2) Сделать программу, которая будет складывать или вычитать введенные числа многократно,
//    пока не будет дана команда на выход из цикла

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] intArray = new int[5];
        double[] doubleArray = new double[5];
        printIntArray(intArray);
        printDoubleArray(doubleArray);
        //      2)
        System.out.println();
        System.out.println("enter num");
        int sum = 0;
        while (true){
            String nextLine = scanner.nextLine();
            if ("exit" .equals(nextLine))
                break;
            sum = sum + Integer.parseInt(nextLine);
            System.out.println("sum" + sum);

        }
        //
    }
    //  1)
    public static void printIntArray(int[] ints){
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");

        }
        System.out.println();
    }
    public static void printDoubleArray(double[] doubles){
        for (int i = 0; i < doubles.length; i++) {
            System.out.print(doubles[i] + " ");

        }
    }

    //


}