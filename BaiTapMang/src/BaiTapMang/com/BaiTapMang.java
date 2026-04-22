package BaiTapMang.com;

import java.util.Scanner;
import java.util.Arrays;

public class BaiTapMang {

    
    public static boolean checkNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Nhập số lượng phần tử của mảng N = ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        
        System.out.print("\nMảng vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += a[i];
        }
        System.out.println("Tổng các phần tử trong mảng: " + tong);

       
        System.out.print("\nNhập số K cần đếm: ");
        int k = sc.nextInt();
        int demK = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == k) {
                demK++;
            }
        }
        System.out.println("Số " + k + " xuất hiện " + demK + " lần trong mảng.");

        
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }
        System.out.println("\nPhần tử lớn nhất trong mảng: " + max);
        System.out.println("Phần tử nhỏ nhất trong mảng: " + min);

  
        System.out.print("\nCác số nguyên tố trong mảng: ");
        boolean coSoNguyenTo = false;
        for (int i = 0; i < n; i++) {
            if (checkNguyenTo(a[i])) {
                System.out.print(a[i] + " ");
                coSoNguyenTo = true;
            }
        }
        if (!coSoNguyenTo) {
            System.out.print("Không có số nguyên tố nào.");
        }
        System.out.println();

        
        Arrays.sort(a); 
        System.out.print("\nMảng sau khi sắp xếp tăng dần: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

       
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Mảng sau khi sắp xếp giảm dần: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
