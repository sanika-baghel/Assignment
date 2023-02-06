package assignmentII;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4, 5 };
        int n = 1;
        System.out.println("array ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            int j, k;
            k = a[0];
            for (j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[j] = k;
        }
        System.out.println();
        System.out.println("array after rotation ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}