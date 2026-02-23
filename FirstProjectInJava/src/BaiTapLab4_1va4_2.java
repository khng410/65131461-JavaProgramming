//Viết chương trình tạo ra 2 sản phẩm thông tin được nhập từ bàn phím sau đó gọiphương thức xuất để xuất thông tin 2 đối tượng sản phẩm đã tạo
//Dùng lại SanPham.java đã tạo ở bài 4_1 để tạo ra 2 sản phẩm thông tin được nhập từ bàn phím sau đó gọi phương thức xuất để xuất thông tin 2 đối tượng sản phẩm đã tạo
public class BaiTapLab4_1va4_2 {

    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();

        System.out.println("Nhap thong tin san pham 1:");
        sp1.nhap();

        System.out.println("Nhap thong tin san pham 2:");
        sp2.nhap();
        System.out.println("\n=================================");
        System.out.println("\nThong tin san pham 1:");
        sp1.xuat();

        System.out.println("\nThong tin san pham 2:");
        sp2.xuat();
    }
}
