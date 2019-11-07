package practive1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = 0;
        int y = 1;
        for(int z = 0; z<=n; z = x+y) {
            x=y;
            y=z;
            System.out.println(z); //Lopotko 13:41 10/10
        }

        }
    }
