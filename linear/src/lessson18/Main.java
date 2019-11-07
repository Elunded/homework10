import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // x/y 1,2,5,6 - перший прямокутник; x/y 3,4,7,8 - другий прямокутник 
        System.out.println("Введіть координату х та у лівої нижньої точки першого прямокутника через пробіл");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        System.out.println("Введіть координату х та у правої верхньої точки першого прямокутника через пробіл");
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        System.out.println("Введіть координату х та у лівої нижньої точки другого прямокутника через пробіл");
        int x3 = input.nextInt();
        int y3 = input.nextInt();
        System.out.println("Введіть координату х та у правої верхньої точки другого прямокутника через пробіл");
        int x4 = input.nextInt();
        int y4 = input.nextInt();

        if (x1 == x3) {
            if (x2 == x4) {
                if (y1 == y3) {
                    if (y2 == y4) {
                        System.out.println("Вони співпадають");
                    }
                }
            }
        } else {


            if (y2 == y3) {
                if (x3 == x2) {
                    System.out.println("Перетин в т. " + x2 + " " + y2);
                } else {
                    if (x2 > x3) {
                        System.out.println("Перетином є відстань від " + x3 + " " + y3 + " до " + x2 + " " + y2);
                    } else {
                        System.out.println("Перетину немає");
                    }
                }
            } else {
                if (y2 < y3) {
                    System.out.println("Перетинів немає");
                } else {
                    if (x3 == x2) {

                    } else {
                        if (x3 > x2) {
                            System.out.println("Перетинів немає");
                        } else {
                            if (x1 < x3) {
                                System.out.println("Перетином є прямокутник з вершинами " + x3 + " " + y3 + " та " + x4 + " " + y4);
                            } else {
                                System.out.println("Перетином є прямокутник з вершинами " + x1 + " " + y1 + " та " + x2 + " " + y2);
                            }
                        }
                    }
                }
            }
        }
    }
}
 