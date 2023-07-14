package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy:");
        int size = scanner.nextInt();
        double[] array = new double[size];

        System.out.printf("Wprowadź %d liczb\n", size);

        for (int i = 0; i < array.length; i++) {
            double input = scanner.nextDouble();
            array[i] = input;
        }

        double sum = 0;
        for (double element : array) {
            sum += element * element;
        }

        System.out.println("Suma kwadratów wprowadzonych liczb to " + sum);
    }
}
