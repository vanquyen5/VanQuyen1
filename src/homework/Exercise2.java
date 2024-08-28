
package homework;

import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Nhap so phan tu co trong mang: ");
        int n = scanner.nextInt();
        for(int i = 0; i <n; i++){
            a[i] = random.nextInt(10);
            System.out.println("Phan tu thu "+ i + " la: "+ a[i]);
        }
        int max = a[0];
        int min = a[0];
        for(int i = 1;i<n;i++)
        {
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("Phan tu lon nhat trong mang la: "+ max);
        System.out.println("Phan tu nho nhat trong mang la: "+ min);
    }
}
