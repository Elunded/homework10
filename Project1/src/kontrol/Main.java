package kontrol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a =input.nextInt();
        int number = 2;
        for (int i = 1; i<=a; i++){
            number = number*2;
            System.out.println((i+1) + " " + number);
        }
    }
}
