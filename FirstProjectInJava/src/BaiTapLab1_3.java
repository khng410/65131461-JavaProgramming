//Viết chương trình nhập từ bàn phím cạnh của một khối lập phương. Tính và xuấtthể tích của khối chữ nhật
import java.util.Scanner;

public class BaiTapLab1_3 {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Nhap canh khoi lap phuong: ");
	double canh = scanner.nextDouble();
	double theTich = Math.pow(canh, 3);
	System.out.printf("The tich khoi lap phuong la: %.2f", theTich);
	scanner.close();
  }
}
