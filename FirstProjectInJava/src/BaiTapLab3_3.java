//Viết chương trình nhập mảng số nguyên từ bàn phím.✓ Sắp xếp và xuất mảng vừa nhập ra màn hình.✓ Xuất phần tử có giá trị nhỏ nhất ra màn hình✓ Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3

import java.util.Arrays;
import java.util.Scanner;

public class BaiTapLab3_3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap so luong phan tu: ");
    int n = scanner.nextInt();
    int[] arr = new int[n];
    System.out.println("Nhap cac phan tu:");
    for (int i = 0; i < n; i++) {
      System.out.print("arr[" + i + "]: ");
      arr[i] = scanner.nextInt();
    }
    // Sap xep mang
    Arrays.sort(arr);
    System.out.println("Mang sau khi sap xep:");
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();
    // Phan tu nho nhat
    int min = arr[0];
    System.out.println("Phan tu nho nhat: " + min);
    // Tinh trung binh cong cac phan tu chia het cho 3
    int sum = 0;
    int count = 0;
    for (int num : arr) {
      if (num % 3 == 0) {
        sum += num;
        count++;
      }
    }
    if (count > 0) {
      double tb = (double) sum / count;
      System.out.println("Trung binh cong cac phan tu chia het cho 3: " + tb);
    } else {
      System.out.println("Khong co phan tu nao chia het cho 3.");
    }
    scanner.close();
  }
}