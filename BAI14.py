# Chương trình đổi tiền thành số tờ ít nhất

# Danh sách các mệnh giá tiền
menh_gia = [500, 200, 100, 50, 20, 10, 5, 2, 1]

# Nhập số tiền X
x = int(input("Nhap so tien X: "))

# Biến lưu tổng số tờ tiền
tong_to = 0

print(f"\nSo tien {x} duoc doi thanh:")

# Duyệt qua từng mệnh giá
for tien in menh_gia:
    # Tính số tờ của mệnh giá hiện tại
    so_to = x // tien

    # Cập nhật số tiền còn lại
    x = x % tien

    # Cộng vào tổng số tờ
    tong_to += so_to

    # In kết quả
    print(f"Loai {tien} gom {so_to} to")

# In tổng số tờ tiền
print(f"\nTONG CONG CO {tong_to} TO")