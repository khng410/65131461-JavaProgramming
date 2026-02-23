//Viết chương trình nhập vào số điện sử dụng của tháng và tính tiền điện theophương pháp lũy tiến✓ Nếu số điện sử dụng từ 0 đến 50 thì giá mỗi số điện là 1000✓ Nếu số điện sử dụng trên 50 thì giá mỗi số điện vượt hạn mức là 1200
import java.util.Scanner;
public class BaiTapLab2_3 {
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập số điện sử dụng trong tháng: ");
    int soDien = scanner.nextInt();
    double tienDien;
    if (soDien <= 50)
    {
      tienDien = soDien * 1000;
    }
    else
    {
      tienDien = 50 * 1000 + (soDien - 50) * 1200;
    }
    System.out.printf("Tiền điện phải trả là: %.2f", tienDien);
    scanner.close();
  }
}
