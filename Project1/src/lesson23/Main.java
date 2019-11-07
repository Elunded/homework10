package lesson23;

public class Main {
    public static void main(String[] args) {
        int column = 5;
        int row = 3;
        for (int j =0; j<row; j++) {
            for (int i = 0; i < column; i++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        /*System.out.println("begin");
        System.exit(0);
        System.out.println("End");*/

        tag: for (int i=0; i<3; i++){
            for (int k = 0; k<2; k++){
                if (i==k) {
                    continue tag;
                }
                System.out.println("i=" + i + " ,k=" + k );
            }
        }
    }
}
