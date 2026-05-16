package QuanLySinhVien.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLySinhVien {

    public static void main(String[] args) {

        // Tạo ArrayList để lưu tên sinh viên
        ArrayList<String> danhSach = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // ===== MENU =====
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Xuat danh sach");
            System.out.println("3. Sua sinh vien");
            System.out.println("4. Xoa sinh vien theo ten");
            System.out.println("5. Tim sinh vien co chu 'An'");
            System.out.println("6. Sap xep danh sach");
            System.out.println("7. So luong sinh vien");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = sc.nextInt();
            sc.nextLine(); // bỏ ký tự xuống dòng

            switch (choice) {

                // ===== a) Thêm sinh viên =====
                case 1:
                    System.out.print("Nhap ten sinh vien: ");
                    String ten = sc.nextLine();
                    danhSach.add(ten); // thêm vào ArrayList
                    break;

                // ===== b) Xuất danh sách =====
                case 2:
                    System.out.println("Danh sach sinh vien:");
                    for (int i = 0; i < danhSach.size(); i++) {
                        System.out.println((i + 1) + ". " + danhSach.get(i));
                    }
                    break;

                // ===== c) Sửa sinh viên =====
                case 3:
                    System.out.print("Nhap vi tri can sua: ");
                    int viTri = sc.nextInt();
                    sc.nextLine();

                    // kiểm tra vị trí hợp lệ
                    if (viTri > 0 && viTri <= danhSach.size()) {
                        System.out.print("Nhap ten moi: ");
                        String tenMoi = sc.nextLine();
                        danhSach.set(viTri - 1, tenMoi); // cập nhật
                    } else {
                        System.out.println("Vi tri khong hop le!");
                    }
                    break;

                // ===== d) Xóa sinh viên chứa tên bất kỳ =====
                case 4:
                    System.out.print("Nhap ten can xoa: ");
                    String tenXoa = sc.nextLine();

                    // removeIf: xóa nếu chứa chuỗi
                    danhSach.removeIf(sv -> sv.contains(tenXoa));
                    break;

                // ===== e) Tìm sinh viên có chữ "An" =====
                case 5:
                    System.out.println("Sinh vien co chu 'An':");
                    for (String sv : danhSach) {
                        if (sv.contains("An")) {
                            System.out.println(sv);
                        }
                    }
                    break;

                // ===== f) Sắp xếp =====
                case 6:
                    Collections.sort(danhSach); // sắp xếp A-Z
                    System.out.println("Da sap xep!");
                    break;

                // ===== g) Số lượng =====
                case 7:
                    System.out.println("So luong sinh vien: " + danhSach.size());
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (choice != 0);

        sc.close();
    }
}