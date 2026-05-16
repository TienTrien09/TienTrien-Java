package  gamedoanso.com;
import java.util.Random;
import java.util.Scanner;

public class gamedoanso {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String tiepTuc;

        do {
            int soMay = rd.nextInt(101); // 0-100
            int soLanDoan = 0;
            boolean thang = false;

            System.out.println("===== GAME ĐOÁN SỐ =====");
            System.out.println("Máy đã chọn số từ 0 đến 100.");
            System.out.println("Bạn có 7 lần đoán.");

            while (soLanDoan < 7) {
                System.out.print("Nhập số bạn đoán: ");

                if (sc.hasNextInt()) {
                    int soDoan = sc.nextInt();
                    soLanDoan++;

                    if (soDoan == soMay) {
                        System.out.println("🎉 Bạn WIN!");
                        thang = true;
                        break;
                    } else if (soDoan < soMay) {
                        System.out.println("Số bạn đoán nhỏ hơn số máy.");
                    } else {
                        System.out.println("Số bạn đoán lớn hơn số máy.");
                    }

                    System.out.println("Còn " + (7 - soLanDoan) + " lần đoán.");
                } else {
                    System.out.println("Vui lòng nhập số nguyên!");
                    sc.next(); // bỏ giá trị sai
                }
            }

            if (!thang) {
                System.out.println("❌ GAME OVER!");
                System.out.println("Số đúng là: " + soMay);
            }

            System.out.print("Bạn có muốn chơi tiếp không? (y/n): ");
            tiepTuc = sc.next();

        } while (tiepTuc.equalsIgnoreCase("y"));

        System.out.println("Cảm ơn bạn đã chơi!");
        sc.close();
    }
}