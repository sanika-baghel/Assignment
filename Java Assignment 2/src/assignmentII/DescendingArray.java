package assignmentII;

import java.util.*;

public class DescendingArray {
    public static void main(String[] args) {
        int n, p;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no of array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    p = a[i];
                    a[i] = a[j];
                    a[j] = p;
                }
            }
        }
        System.out.print("Descending Order:");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }
}
