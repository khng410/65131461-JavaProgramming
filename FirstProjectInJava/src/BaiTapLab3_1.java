//Viết chương trình nhập một số nguyên từ bàn phím và cho biết số đó có phải là sốnguyên tố hay không (số nguyên tố là số chỉ chia hết cho 1 và chính nó).
import java.util.Scanner;
public class BaiTapLab3_1 {
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap mot so nguyen: ");
    int n = scanner.nextInt();
    boolean isPrime = true;
    if (n < 2)
    {
      isPrime = false;
    }
    else
    {
      for (int i = 2; i <= Math.sqrt(n); i++)
      {
        if (n % i == 0)
        {
          isPrime = false;
          break;
        }
      }
    }
    if (isPrime)
    {
      System.out.println(n + " la so nguyen to");
    }
    else
    {
      System.out.println(n + " khong phai la so nguyen to");
    }
    scanner.close();
  }
}
