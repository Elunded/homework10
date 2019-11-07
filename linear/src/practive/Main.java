package practive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть кількість олівців");
        double x = input.nextDouble();
        System.out.println("Введіть кількість ручок");
        double y = input.nextDouble();
        System.out.println("Введіть кількість маркерів");
        double z = input.nextDouble();
        System.out.println("Введіть ціну олівців");
        double a = input.nextDouble();
        System.out.println("Введіть ціну ручок");
        double b = input.nextDouble();
        System.out.println("Введіть ціну маркерів");
        double c = input.nextDouble();

        double f = x*a+y*b+z*c;
        System.out.println(f + " - Загальна вартість");

        double p = f/29;
        System.out.println(p + " - Середня кількість забраних грошей у 1го учня");


    }
}
