//Bai 4_1: Tạo lớp SanPham gồm 3 thuộc tính là tên, giá và giảm giá. Lớp cũng gồm 2 phương thức là tính thuế nhập khẩu (10% giá sản phẩm) và xuất thông tin ra mànhình.
public class SanPham {
    // Thuoc tinh
    private String tenSp;
    private double donGia;
    private double giamGia;

    // Constructor
    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    // Default constructor
    public SanPham() {
    }

    // Ham Getter va Setter 
    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    // Ham tinh thue nhap khau
    public double getThueNhapKhau() {
        return donGia * 0.1;
    }

    // Ham xuat thong tin san pham
    public void xuat() {
        System.out.println("Ten san pham: " + tenSp);
        System.out.println("Don gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
    }

    // Ham nhap thong tin san pham
    public void nhap() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Nhap ten san pham: ");
        tenSp = scanner.nextLine();

        System.out.print("Nhap don gia: ");
        donGia = scanner.nextDouble();

        System.out.print("Nhap giam gia: ");
        giamGia = scanner.nextDouble();
    }
}
