package lesson17;

public class Main {
    public static void main(String[] args) {
        byte a1 = 15; // 0000_1111
        byte a3 = (byte)~a1; // 1111_0000
        System.out.println(a3);

        byte a11 = 126; // 0011_1110
        byte a12 = 1; // 0000_0001
        byte a13 = (byte)(a11 ^ a12); // 0111_1111
        System.out.println(a13);

// Lopotko 12:18, 03.10
    }
}
