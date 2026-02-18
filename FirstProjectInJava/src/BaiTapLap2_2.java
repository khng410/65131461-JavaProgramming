//Viết chương trình cho phép giải phương trình bậc hai trong đó các hệ số a, b và cnhập từ bàn phím
import java.util.Scanner;

public class BaiTapLap2_2 {
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap he so a,b,c: ");
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    if (a == 0)
    {
      if (b == 0)
      {
        if (c == 0)
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
        double x = -c/b;
        System.out.printf("Phuong trinh co nghiem duy nhat x = %.2f", x);
      }
    }
    else
    {
      double delta = Math.pow(b,2) - 4*a*c;
      if (delta < 0)
      {
        System.out.println("Phuong trinh vo nghiem");
      }
      else if (delta == 0)
      {
        double x = -b/(2*a);
        System.out.printf("Phuong trinh co nghiem kep x = %.2f", x);
      }
      else
      {
        double x1 = (-b + Math.sqrt(delta))/(2*a);
        double x2 = (-b - Math.sqrt(delta))/(2*a);
        System.out.printf("Phuong trinh co hai nghiem phan biet: x1 = %.2f, x2 = %.2f", x1, x2);
      }
    }
    scanner.close();
  }
}
