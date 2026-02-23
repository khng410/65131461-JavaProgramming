//Viết chương trình tổ chức 1 menu gồm 3 chức năng như BaiTapLab2_1, BaiTapLab2_2, BaiTapLab2_3 để gọi 3 bài trên và một chức năng để thoát khỏi ứng dụng, tương ứng với các số 1,2,3,4 nhập từ bàn phím
import java.util.Scanner;
public class BaiTapLab2_4 {
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int choice;
    do
    {
      System.out.println("\n====================================");
      System.out.println("Menu:");
      System.out.println("1. Giải phương trình bậc nhất");
      System.out.println("2. Giải phương trình bậc hai");
      System.out.println("3. Tính tiền điện");
      System.out.println("4. Thoát");
      System.out.print("Nhập lựa chọn: ");
      choice = scanner.nextInt();
      switch (choice)
      {
        case 1:
          // Goi bai tap 2.1
          BaiTapLab2_1.main(null);
          break;
        case 2:
          // Goi bai tap 2.2
          BaiTapLab2_2.main(null);
          break;
        case 3:
          // Goi bai tap 2.3
          BaiTapLab2_3.main(null);
          break;
        case 4:
          System.out.println("Thoát khỏi ứng dụng.");
          break;
        default:
          System.out.println("ựa chọn không hợp lệ, vui lòng chọn lại.");
      }
    } while (choice != 4);
    scanner.close();
  }
}