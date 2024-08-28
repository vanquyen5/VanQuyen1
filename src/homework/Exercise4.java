package homework;

import java.util.Random;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] a = new int[10];
        System.out.println("Nhap so phan tu co trong mang: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(10);
            System.out.println("Phan tu thu " + i + " la: " + a[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.print("Cac phan tu trong mang sap xep theo ascending la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+ "  ");
        }
    }
}
