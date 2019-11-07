package lesson15;

public class Main {
    public static void main(String[] args) {
        byte b0 = 16; // 0001 0000
        byte b1 = 14; // 0000 1110
        byte b2 = 1; // 0000 0001
        byte b3 = (byte)~b1;
        System.out.println(b3); //1111 0001
        byte b4 = (byte) (b1 & b2); // 0000 0000
        System.out.println(b4);
        byte b5 = (byte) (b1 | b2); // 0000 1111
        System.out.println(b5);
        byte b6 = (byte) (b1 | b2 | b0); // 0000 0000
        System.out.println(b6);
        byte b7 = (byte) (b5 ^ b2); // 0000 1110
        System.out.println(b7);
        byte b8 = 0b00101110; // 32 + 14 = 46
        byte b9 = (byte)(b8<<1); // 0b01011100
        System.out.println(b9);
        byte b10 = (byte)(b8>>1); // 0b01011100
        System.out.println(b10); // 0b0001_0111
    }
}
