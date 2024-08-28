package homework;

import java.util.*;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao check: ");
        String check = scanner.next();
        while (check.equalsIgnoreCase("yes")) {
            if (n % 2 == 0) {
                System.out.println("n = " + n + " n la so chan!!");
            } else {
                System.out.println("n = " + n + " n la so le!!");
            }
            break;
        }
        if (n % 2 == 0) {
            System.out.println("n la so chan!!");
        } else {
            System.out.println("n la so le!!");
        }

    }
}
