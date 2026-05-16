package DoiTuongHoaDon.com;

public class Invoice {
    // 1. Các thuộc tính (khai báo private để bảo mật dữ liệu)
    private String itemId;      // Mã mặt hàng
    private String itemName;    // Tên mặt hàng
    private int quantity;       // Số lượng
    private double price;       // Đơn giá

    // 2. Constructor (Hàm khởi tạo để tạo nhanh một object)
    public Invoice(String itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    // 3. Các hàm Getter (để các class khác có thể lấy dữ liệu)
    public String getItemId() { return itemId; }
    public int getQuantity() { return quantity; }

    // 4. Hàm toString (để khi in ra màn hình nó hiện đẹp như một bảng)
    @Override
    public String toString() {
        return String.format("| %-10s | %-20s | %-10d | %-12.2f |", 
                itemId, itemName, quantity, price);
    }
}