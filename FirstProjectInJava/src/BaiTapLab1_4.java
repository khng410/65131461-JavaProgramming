//Viết chương trình nhập các hệ số của phương trình bậc 2. Tính delta và xuất căndelta ra màn hình.
import java.util.Scanner;

public class BaiTapLab1_4 {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Nhap he so a: ");
  double a = scanner.nextDouble();
  System.out.print("Nhap he so b: ");
  double b = scanner.nextDouble();
  System.out.print("Nhap he so c: ");
  double c = scanner.nextDouble();
  double delta = Math.pow(b, 2) - 4 * a * c;
  double canDelta = Math.sqrt(delta);
  System.out.printf("Delta: %.2f", delta);
  System.out.printf("\nCan Delta: %.2f", canDelta);
  scanner.close();
  }
}