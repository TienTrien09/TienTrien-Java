package BTNhanVien.com;

public class BTNhanVien {
    private String ho;
    private String ten;
    private int soSP;

    // Constructor
    public BTNhanVien(String ho, String ten, int soSP) {
        this.ho = ho;
        this.ten = ten;

        if (soSP < 0) {
            this.soSP = 0;
        } else {
            this.soSP = soSP;
        }
    }

    // Getter & Setter
    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        if (soSP < 0) {
            this.soSP = 0;
        } else {
            this.soSP = soSP;
        }
    }

    // Hàm tính đơn giá
    private int getDonGia() {
        if (soSP < 100) {
            return 5;
        } else if (soSP < 200) {
            return 6;
        } else {
            return 7;
        }
    }

    // Hàm tính lương
    public int getLuong() {
        return soSP * getDonGia();
    }

    // Hiển thị thông tin
    public void hienThi() {
        System.out.println("Họ: " + ho);
        System.out.println("Tên: " + ten);
        System.out.println("Số SP: " + soSP);
        System.out.println("Lương: " + getLuong());
    }

    // 🔥 THÊM MAIN ĐỂ CHẠY
    public static void main(String[] args) {
        BTNhanVien nv1 = new BTNhanVien("Nguyen", "An", 150);
        nv1.hienThi();

        System.out.println("---------------");

        BTNhanVien nv2 = new BTNhanVien("Tran", "Binh", -10);
        nv2.hienThi();
    }
}