package DoiTuongHoaDon.com;

import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceTest {
    // Khai báo danh sách và công cụ nhập liệu dùng chung cho cả class
    private static ArrayList<Invoice> list = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initMockData(); // Tự động tạo 10 hóa đơn giả lúc vừa chạy máy
        int choice;

        // Vòng lặp Menu
        do {
            System.out.println("\n--- HỆ THỐNG QUẢN LÝ HÓA ĐƠN ---");
            System.out.println("1. Nhập thêm hóa đơn");
            System.out.println("2. Xuất danh sách");
            System.out.println("3. Sắp xếp (Mã MH + Số lượng)");
            System.out.println("4. Tìm kiếm theo Mã");
            System.out.println("5. Xóa theo Mã");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn chọn: ");
            choice = sc.nextInt();
            sc.nextLine(); // Chống trôi lệnh sau khi nhập số

            switch (choice) {
                case 1: input(); break;
                case 2: output(); break;
                case 3: sort(); break;
                case 4: search(); break;
                case 5: delete(); break;
                case 0: System.out.println("Đã thoát chương trình!"); break;
                default: System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }

    // --- CÁC HÀM XỬ LÝ CHI TIẾT ---

    // Tạo 10 dữ liệu giả theo yêu cầu
    public static void initMockData() {
        list.add(new Invoice("ID05", "Sữa tươi", 10, 15000));
        list.add(new Invoice("ID01", "Bánh mì", 50, 5000));
        list.add(new Invoice("ID08", "Trứng gà", 5, 3000));
        list.add(new Invoice("ID02", "Gạo ST25", 20, 250000));
        list.add(new Invoice("ID10", "Dầu ăn", 15, 45000));
        list.add(new Invoice("ID03", "Nước mắm", 100, 35000));
        list.add(new Invoice("ID09", "Đường cát", 30, 20000));
        list.add(new Invoice("ID04", "Bột ngọt", 12, 25000));
        list.add(new Invoice("ID07", "Thịt heo", 8, 120000));
        list.add(new Invoice("ID06", "Cá thu", 10, 180000));
        System.out.println(">> Đã khởi tạo 10 hóa đơn mẫu thành công!");
    }

    // Nhập và kiểm tra trùng mã
    public static void input() {
        System.out.print("Nhập mã MH: ");
        String id = sc.nextLine();
        
        // Kiểm tra xem mã đã có trong list chưa
        for (Invoice inv : list) {
            if (inv.getItemId().equalsIgnoreCase(id)) {
                System.out.println("Lỗi: Mã này đã tồn tại, không được nhập trùng!");
                return; // Thoát hàm luôn
            }
        }
        
        System.out.print("Nhập tên MH: ");
        String name = sc.nextLine();
        System.out.print("Số lượng: ");
        int qty = sc.nextInt();
        System.out.print("Đơn giá: ");
        double pr = sc.nextDouble();
        
        list.add(new Invoice(id, name, qty, pr));
        System.out.println("Đã thêm!");
    }

    // Xuất thông tin dạng bảng
    public static void output() {
        System.out.println("\nDANH SÁCH HÓA ĐƠN:");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("| %-10s | %-20s | %-10s | %-12s |\n", "Mã", "Tên hàng", "SL", "Giá");
        System.out.println("---------------------------------------------------------------");
        for (Invoice i : list) System.out.println(i);
        System.out.println("---------------------------------------------------------------");
    }

    // Sắp xếp nổi bọt (Bubble Sort)
    public static void sort() {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                Invoice a = list.get(j);
                Invoice b = list.get(j + 1);
                
                // So sánh Mã mặt hàng (tăng dần)
                int checkId = a.getItemId().compareTo(b.getItemId());
                
                if (checkId > 0 || (checkId == 0 && a.getQuantity() > b.getQuantity())) {
                    // Tráo đổi vị trí trong ArrayList
                    list.set(j, b);
                    list.set(j+1, a);
                }
            }
        }
        System.out.println("Đã sắp xếp xong. Chọn phím 2 để xem kết quả.");
    }

    // Tìm kiếm tuyến tính
    public static void search() {
        System.out.print("Nhập mã cần tìm: ");
        String key = sc.nextLine();
        boolean found = false;
        for (Invoice i : list) {
            if (i.getItemId().equalsIgnoreCase(key)) {
                System.out.println("Kết quả: " + i);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Không tìm thấy!");
    }

    // Xóa hóa đơn
    public static void delete() {
        System.out.print("Nhập mã muốn xóa: ");
        String key = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getItemId().equalsIgnoreCase(key)) {
                list.remove(i);
                System.out.println("Đã xóa thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy mã để xóa.");
    }
}