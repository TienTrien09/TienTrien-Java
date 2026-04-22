package BTHashMap.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BTHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> dsSach = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sách");
            System.out.println("2. Xuất danh sách");
            System.out.println("3. Sửa sách");
            System.out.println("4. Xóa sách");
            System.out.println("5. Tìm kiếm");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine(); // tránh lỗi nhập chuỗi

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã sách: ");
                    int ma = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập tên sách: ");
                    String ten = sc.nextLine();
                    dsSach.put(ma, ten);
                    System.out.println("✔ Đã thêm!");
                    break;

                case 2:
                    System.out.println("Danh sách sách:");
                    for (Map.Entry<Integer, String> entry : dsSach.entrySet()) {
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                    }
                    break;

                case 3:
                    System.out.print("Nhập mã sách cần sửa: ");
                    int maSua = sc.nextInt();
                    sc.nextLine();
                    if (dsSach.containsKey(maSua)) {
                        System.out.print("Nhập tên mới: ");
                        String tenMoi = sc.nextLine();
                        dsSach.put(maSua, tenMoi);
                        System.out.println("✔ Đã sửa!");
                    } else {
                        System.out.println("❌ Không tìm thấy!");
                    }
                    break;

                case 4:
                    System.out.print("Nhập mã sách cần xóa: ");
                    int maXoa = sc.nextInt();
                    if (dsSach.remove(maXoa) != null) {
                        System.out.println("✔ Đã xóa!");
                    } else {
                        System.out.println("❌ Không tồn tại!");
                    }
                    break;

                case 5:
                    System.out.print("Nhập mã sách cần tìm: ");
                    int maTim = sc.nextInt();
                    if (dsSach.containsKey(maTim)) {
                        System.out.println("Tìm thấy: " + dsSach.get(maTim));
                    } else {
                        System.out.println("❌ Không tìm thấy!");
                    }
                    break;

                case 0:
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("❌ Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);

        sc.close();
    }
}