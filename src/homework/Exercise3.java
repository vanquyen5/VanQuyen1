
package homework;

import java.util.Random;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] a = new int[10];
        System.out.println("Nhap so phan tu co trong mang: ");
        int n = scanner.nextInt();
        for(int i = 0; i <n; i++){
            a[i] = random.nextInt(10);
            System.out.println("Phan tu thu "+ i + " la: "+ a[i]);
        }
        int S = 0;
        for(int i=0;i<n;i++){
            S+=a[i];
        }
        System.out.println("Tong cac phan tu co trong mang la: "+S);
        System.out.println("Trung binh cong cac phan tu co trong mang la: "+ (float)S/n);
    }
}
