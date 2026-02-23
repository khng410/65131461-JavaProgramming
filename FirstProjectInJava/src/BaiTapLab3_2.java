//Viết chương trình xuất ra màn hình bảng cửu chương
public class BaiTapLab3_2 {
  public static void main(String[] args)
  {
    System.out.println("Bang cuu chuong:");
    for (int i = 2; i <= 10; i++)
    {
      for (int j = 1; j <= 10; j++)
      {
        System.out.printf("%d x %d = %d\t", i, j, i * j);
      }
      System.out.println();
    }
  }
}