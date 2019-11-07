package lesson1;

public class Main {
    public static void main(String[] args) {
        //  statement ; test ; expression
        for (int x = 0; x < 10; x++) {
            System.out.print(x + " ");
        }
            double balance = 100;
            int goal = 1000;
            int years = 0;
            while (balance < goal) {
                balance += 0.05 * balance;
                years++;
            }
            System.out.println(years);

            int g = 5;
            do {
                System.out.println(g);
                g--;
            }while(g!=0);
        System.out.println(g);
        }
    }

