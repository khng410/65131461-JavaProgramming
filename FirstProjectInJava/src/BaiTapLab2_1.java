//Viết chương trình cho phép giải phương trình bậc nhất trong đó các hệ số a và bnhập từ bàn phím
import java.util.Scanner;
public class BaiTapLab2_1 {
  public static void main(String[] args)
  {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Nhap he so a: ");
      double a = scanner.nextDouble();
      System.out.print("Nhap he so b: ");
      double b = scanner.nextDouble();
      if (a == 0)
      {
        if(b == 0)
        {
          System.out.println("Phuong trinh co vo so nghiem");
        }
        else
        {
          System.out.println("Phuong trinh vo nghiem");
        }
      }
      else
      {
        double x = -b/a;
        System.out.printf("Phuong trinh co nghiem duy nhat x = %.2f", x);
      }
      scanner.close();
  }
}
