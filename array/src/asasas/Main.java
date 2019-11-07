package asasas;

public class Main {
    public static void main(String[] args) {
        int [] a = {-1, 1, 3};
        int [] c = {4, 5, 6};
        int[]b = new int[a.length+c.length];
        for (int i = 0, n = b.length; i<n; i++){
            if (i<a.length) {
                b[i] = a[i];
            }else{
                b[i] = c[i-a.length];
            }
        }

        for (int i : b){
            System.out.println(i);
        }
    }
}
