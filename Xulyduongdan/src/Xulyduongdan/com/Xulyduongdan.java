package Xulyduongdan.com;

public class Xulyduongdan {

    public static void main(String[] args) {
       
        String path = "D:/music/bolero/longme.mp3";
        
        System.out.println("Đường dẫn gốc: " + path);
        System.out.println("---------------------------");

     
        int lastSlashIndex = path.lastIndexOf('/');
        
      
        String tenFileCoDuoi = path.substring(lastSlashIndex + 1);
        System.out.println("1. Tên file đầy đủ: " + tenFileCoDuoi);

       
        int lastDotIndex = tenFileCoDuoi.lastIndexOf('.');
        
      
        String tenFileKhongDuoi = tenFileCoDuoi.substring(0, lastDotIndex);
        System.out.println("2. Tên file không đuôi: " + tenFileKhongDuoi);
    }
}
