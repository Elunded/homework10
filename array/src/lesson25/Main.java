package lesson25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Amdrey";
        String name1 = "Sergei";
        String name2 = "Stas";
        String name3 = "Mikola";

        String[] names = {"Andrey", "Sergei", "Stas", "Mikola"};

        for (int i = 0, n = names.length; i<n; i++) {
            System.out.println(names[i]);
        }
            Scanner input = new Scanner(System.in);
            double [] array = new double[8];
            for (int i = 0, n = array.length; i < n; i++ ){
                array[i] = input.nextDouble();
            }
        for (int i = 0, n = array.length; i < n; i++ ){
            System.out.println(array[i]);
        }


    }
}
