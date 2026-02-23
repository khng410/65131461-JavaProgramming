//Viết chương trình nhập 2 mảng họ tên và điểm của sinh viên. Sắp xếp danh sách theo điểm số giảm dần và xuất ra màn hình danh sách sinh viên sau khi đã sắp xếp.
import java.util.Scanner;
public class BaiTapLab3_4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap so luong sinh vien: ");
    int n = scanner.nextInt();
    String[] names = new String[n];
    double[] scores = new double[n];
    System.out.println("Nhap ten va diem cua cac sinh vien:");
    for (int i = 0; i < n; i++) {
      System.out.print("Sinh vien " + (i + 1) + " - Ten: ");
      names[i] = scanner.next();
      System.out.print("Sinh vien " + (i + 1) + " - Diem: ");
      scores[i] = scanner.nextDouble();
    }
    // Xep hang hoc luc
    String[] ranks = new String[n];
    for (int i = 0; i < n; i++) {
      if (scores[i] < 5) {
        ranks[i] = "Yeu";
      } else if (scores[i] < 6.5) {
        ranks[i] = "Trung binh";
      } else if (scores[i] < 7.5) {
        ranks[i] = "Kha";
      } else if (scores[i] < 9) {
        ranks[i] = "Gioi";
      } else {
        ranks[i] = "Xuat sac";
      }
    }
    // Sap xep theo diem
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (scores[j] > scores[j + 1]) {
          // Hoan doi diem
          double tempScore = scores[j];
          scores[j] = scores[j + 1];
          scores[j + 1] = tempScore;
          // Hoan doi ten
          String tempName = names[j];
          names[j] = names[j + 1];
          names[j + 1] = tempName;
          // Hoan doi hoc luc
          String tempRank = ranks[j];
          ranks[j] = ranks[j + 1];
          ranks[j + 1] = tempRank;
        }
      }
    }
    // Xuat danh sach sinh vien sau khi sap xep
    System.out.println("\nDanh sach sinh vien sau khi sap xep:");
    for (int i = 0; i < n; i++) {
      System.out.printf("Ten: %s, Diem: %.2f, Hoc luc: %s\n", names[i], scores[i], ranks[i]);
    }
    scanner.close();
  }
}
