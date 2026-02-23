//Viết chương trình cho phép giải phương trình bậc hai trong đó các hệ số a, b và cnhập từ bàn phím
import java.util.Scanner;

public class BaiTapLab2_2 {
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập các hệ số a,b,c: ");
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    if (a == 0)
    {
      if (b == 0)
      {
        if (c == 0)
        {
          System.out.println("Phương trình có vô số nghiệm");
        }
        else
        {
          System.out.println("Phương trình vô nghiệm");
        }
      }
      else
      {
        double x = -c/b;
        System.out.printf("Phương trình có nghiệm duy nhất x = %.2f", x);
      }
    }
    else
    {
      double delta = Math.pow(b,2) - 4*a*c;
      if (delta < 0)
      {
        System.out.println("Phương trình vô nghiệm");
      }
      else if (delta == 0)
      {
        double x = -b/(2*a);
        System.out.printf("Phương trình có nghiệm kép x = %.2f", x);
      }
      else
      {
        double x1 = (-b + Math.sqrt(delta))/(2*a);
        double x2 = (-b - Math.sqrt(delta))/(2*a);
        System.out.printf("Phương trình có hai nghiệm phân biệt: x1 = %.2f, x2 = %.2f", x1, x2);
      }
    }
    scanner.close();
  }
}
