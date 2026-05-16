package BaiTaptongHop.com;

import java.util.Scanner;

public class BaiTapTongHop {

    // =========================
    // 1. Tìm UCLN của 2 số
    // =========================
    public static int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // =========================
    // 2. Kiểm tra số hoàn thiện
    // =========================
    public static boolean soHoanThien(int n) {
        int tong = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }

        return tong == n;
    }

    // =========================
    // 3. Kiểm tra các chữ số đều chẵn
    // =========================
    public static boolean toanChuSoChan(int n) {

        while (n > 0) {
            int so = n % 10;

            if (so % 2 != 0) {
                return false;
            }

            n = n / 10;
        }

        return true;
    }

    // =========================
    // Hàm tính giai thừa
    // =========================
    public static long giaiThua(int n) {
        long gt = 1;

        for (int i = 1; i <= n; i++) {
            gt *= i;
        }

        return gt;
    }

    // =========================
    // 4. Tính S(x,n)
    // S = x + x^3/3! + x^5/5! + ...
    // =========================
    public static double tinhTong(double x, int n) {

        double S = 0;

        for (int i = 0; i <= n; i++) {

            int mu = 2 * i + 1;

            S += Math.pow(x, mu) / giaiThua(mu);
        }

        return S;
    }

    // =========================
    // Hàm main
    // =========================
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ------------------------------------------------
        // 1. Tìm UCLN
        // ------------------------------------------------
        System.out.println("===== TIM UCLN =====");
        System.out.print("Nhap a = ");
        int a = sc.nextInt();

        System.out.print("Nhap b = ");
        int b = sc.nextInt();

        System.out.println("UCLN cua " + a + " va " + b + " = " + UCLN(a, b));

        // ------------------------------------------------
        // 2. Kiểm tra số hoàn thiện
        // ------------------------------------------------
        System.out.println("\n===== KIEM TRA SO HOAN THIEN =====");

        System.out.print("Nhap n = ");
        int n1 = sc.nextInt();

        if (soHoanThien(n1)) {
            System.out.println(n1 + " la so hoan thien");
        } else {
            System.out.println(n1 + " khong phai la so hoan thien");
        }

        // ------------------------------------------------
        // 3. Kiểm tra toàn chữ số chẵn
        // ------------------------------------------------
        System.out.println("\n===== KIEM TRA CHU SO CHAN =====");

        System.out.print("Nhap n = ");
        int n2 = sc.nextInt();

        if (toanChuSoChan(n2)) {
            System.out.println(n2 + " co tat ca chu so chan");
        } else {
            System.out.println(n2 + " khong phai toan chu so chan");
        }

        // ------------------------------------------------
        // 4. Tính tổng S(x,n)
        // ------------------------------------------------
        System.out.println("\n===== TINH TONG S(x,n) =====");

        System.out.print("Nhap x = ");
        double x = sc.nextDouble();

        System.out.print("Nhap n = ");
        int n = sc.nextInt();

        double ketQua = tinhTong(x, n);

        System.out.println("S(" + x + "," + n + ") = " + ketQua);

        sc.close();
    }
}