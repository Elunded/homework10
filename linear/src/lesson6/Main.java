package lesson6;

public class Main {
    public static void main(String[] args) {
        byte x = 5;
        double y = 0.2;
        double z = 0.1;
        double m = z + y;
        System.out.println(m);
        char c = '5';
        char c2 = 97;
        System.out.println(c + " " + c2);

        x++;  // postfix
        ++x;  // prefix

        int x1 = 75;
        int y1 = 0x4b;
        int z1 = 0113;
        int m1 = 0b1001011;
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(z1);
        System.out.println(m1);
    }

}
