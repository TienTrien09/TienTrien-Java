package BaiTapHoaDon.com;

import java.util.Scanner; // Thêm dòng này để dùng được bàn phím

public class InvoiceTest {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner input = new Scanner(System.in);

        System.out.println("--- CHƯƠNG TRÌNH NHẬP HÓA ĐƠN ---");

        // 1. Nhập Mã mặt hàng
        System.out.print("Nhập mã mặt hàng: ");
        String ma = input.nextLine();

        // 2. Nhập Mô tả
        System.out.print("Nhập mô tả mặt hàng: ");
        String moTa = input.nextLine();

        // 3. Nhập Số lượng
        System.out.print("Nhập số lượng mua: ");
        int soLuong = input.nextInt();

        // 4. Nhập Đơn giá
        System.out.print("Nhập giá mỗi mặt hàng: ");
        double donGia = input.nextDouble();

        // Khởi tạo đối tượng Invoice với dữ liệu VỪA NHẬP
        Invoice inv = new Invoice(ma, moTa, soLuong, donGia);

        // Hiển thị kết quả tính toán
        System.out.println("\n--------------------------------------");
        System.out.println("KẾT QUẢ HÓA ĐƠN:");
        System.out.println("Mã hàng: " + inv.getPartNumber());
        System.out.println("Mô tả: " + inv.getPartDescription());
        System.out.println("Số lượng (đã kiểm tra): " + inv.getQuantity());
        System.out.println("Đơn giá (đã kiểm tra): " + inv.getPricePerItem());
        System.out.println("--------------------------------------");
        System.out.println("TỔNG TIỀN: " + inv.getInvoiceAmount());
        System.out.println("--------------------------------------");
        
        input.close(); // Đóng scanner
    }
}