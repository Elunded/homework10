package practine2;

public class Main {
    public static void main(String[] args) {
        int column = 0;
        int row =5;
        for (int i = 0; i<row; i++){
            column++;
                for (int j =0; j < column; j++) {
                    System.out.print("*");
                }
            System.out.println();
            }
        int column2 = 5;
        int row2 =4;
        for (int i = 0; i<row2; i++){
            column--;
            for (int j =0; j < column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }
