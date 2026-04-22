package BaiTapArrayList.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaiTapArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Khởi tạo một ArrayList lưu trữ các số nguyên (Integer)
        ArrayList<Integer> danhSach = new ArrayList<>();

        // --- 1. Nhập danh sách các số nguyên ---
        System.out.print("Nhập số lượng phần tử ban đầu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            int phanTu = sc.nextInt();
            danhSach.add(phanTu); // Thêm phần tử vào danh sách
        }
        System.out.println("=> Danh sách ban đầu: " + danhSach);
        System.out.println("---------------------------");

        // --- 2. Thêm phần tử ---
        System.out.print("Nhập giá trị cần THÊM vào cuối danh sách: ");
        int giaTriThem = sc.nextInt();
        danhSach.add(giaTriThem); 
        System.out.println("=> Danh sách sau khi thêm: " + danhSach);
        System.out.println("---------------------------");

        // --- 3. Sửa phần tử ---
        // Lưu ý: Index trong ArrayList bắt đầu từ 0
        System.out.print("Nhập vị trí (index) cần SỬA (từ 0 đến " + (danhSach.size() - 1) + "): ");
        int viTriSua = sc.nextInt();
        if (viTriSua >= 0 && viTriSua < danhSach.size()) {
            System.out.print("Nhập giá trị mới: ");
            int giaTriMoi = sc.nextInt();
            danhSach.set(viTriSua, giaTriMoi); // Sử dụng phương thức set() để sửa
            System.out.println("=> Danh sách sau khi sửa: " + danhSach);
        } else {
            System.out.println("=> Vị trí không hợp lệ!");
        }
        System.out.println("---------------------------");

        // --- 4. Xóa phần tử ---
        System.out.print("Nhập vị trí (index) cần XÓA (từ 0 đến " + (danhSach.size() - 1) + "): ");
        int viTriXoa = sc.nextInt();
        if (viTriXoa >= 0 && viTriXoa < danhSach.size()) {
            danhSach.remove(viTriXoa); // Sử dụng phương thức remove() để xóa
            System.out.println("=> Danh sách sau khi xóa: " + danhSach);
        } else {
            System.out.println("=> Vị trí không hợp lệ!");
        }
        System.out.println("---------------------------");

        // --- 5. Tìm kiếm ---
        System.out.print("Nhập giá trị cần TÌM KIẾM: ");
        int giaTriTim = sc.nextInt();
        int viTriTimThay = danhSach.indexOf(giaTriTim); // indexOf trả về -1 nếu không tìm thấy
        
        if (viTriTimThay != -1) {
            System.out.println("=> Tìm thấy giá trị " + giaTriTim + " tại vị trí (index): " + viTriTimThay);
        } else {
            System.out.println("=> Không tìm thấy giá trị " + giaTriTim + " trong danh sách.");
        }
        System.out.println("---------------------------");

        // --- 6. Sắp xếp ---
        // Sử dụng class Collections để sắp xếp ArrayList
        Collections.sort(danhSach); 
        System.out.println("=> Danh sách sau khi SẮP XẾP (Tăng dần): " + danhSach);
        
        // (Nâng cao một chút) Nếu muốn sắp xếp giảm dần:
        Collections.sort(danhSach, Collections.reverseOrder());
        System.out.println("=> Danh sách sau khi SẮP XẾP (Giảm dần): " + danhSach);

        sc.close();
    }
}