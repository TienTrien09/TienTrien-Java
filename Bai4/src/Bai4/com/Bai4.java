package Bai4.com;

import java.util.Scanner;

public class Bai4 {

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        // Nhập mảng
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        // Biến đếm
        int demLe = 0, demChan = 0;

        System.out.print("\nDong 1 (So le): ");
        for (int x : a) {
            if (x % 2 != 0) {
                System.out.print(x + " ");
                demLe++;
            }
        }
        System.out.println("=> " + demLe + " so le");

        System.out.print("\nDong 2 (So chan): ");
        for (int x : a) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
                demChan++;
            }
        }
        System.out.println("=> " + demChan + " so chan");

        System.out.print("\nDong 3 (So nguyen to): ");
        for (int x : a) {
            if (isPrime(x)) {
                System.out.print(x + " ");
            }
        }

        System.out.print("\nDong 4 (Khong phai so nguyen to): ");
        for (int x : a) {
            if (!isPrime(x)) {
                System.out.print(x + " ");
            }
        }

        sc.close();
    }
}