//Viết chương trình nhập từ bàn phím 2 cạnh của hình chữ nhật. Tính và xuất chu vi,diện tích và cạnh nhỏ của hình chữ nhật.
import java.util.Scanner;
public class BaiTapLab1_2 {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Nhap canh thu nhat: ");
	double canh1 = scanner.nextDouble();
	System.out.print("Nhap canh thu hai: ");
	double canh2 = scanner.nextDouble();
	double chuVi = (canh1 + canh2) * 2;
	double dienTich = canh1 * canh2;
	double canhNho = Math.min(canh1, canh2);
	System.out.printf("Chu vi: %.2f\nDien tich: %.2f\nCanh nho: %.2f", chuVi, dienTich, canhNho);
	scanner.close();
  }
}
