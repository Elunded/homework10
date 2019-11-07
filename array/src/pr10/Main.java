package pr10;

public class Main {
    public static void main(String[] args) {
        int [] a = {-1, 1, 3};
        int [] c = {4, 5, 6};
        int[]b = new int[a.length];
        for (int i = 0, n = a.length; i<n; i++){
            b[i] = a[i] + c[i];
        }
        for (int i : b){
            System.out.println(i);
        }
    }
}
