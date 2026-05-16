package BaiTapHoaDon.com;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Hàm khởi tạo (Constructor)
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        
        // Đề bài: Nếu số lượng không dương (<= 0), đặt thành 0
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }

        // Đề bài: Nếu giá không dương (<= 0.0), đặt thành 0.0
        if (pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    // Các phương thức Get/Set (Bắt buộc theo đề bài)
    public String getPartNumber() { return partNumber; }
    public void setPartNumber(String partNumber) { this.partNumber = partNumber; }

    public String getPartDescription() { return partDescription; }
    public void setPartDescription(String partDescription) { this.partDescription = partDescription; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) {
        this.quantity = (quantity > 0) ? quantity : 0;
    }

    public double getPricePerItem() { return pricePerItem; }
    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = (pricePerItem > 0.0) ? pricePerItem : 0.0;
    }

    // Phương thức tính tiền quan trọng nhất
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}