import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TuyenSinh ts = new TuyenSinh();
        while (true) {
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Tim kiem theo so bao danh");
            System.out.println("4. Thoat chuong trinh");
            System.out.println("Nhap lua chon cua ban:");
            int luaChon = new Scanner(System.in).nextInt();
            switch (luaChon) {
                case 1:
                    ts.themSinhVien();
                    break;
                case 2:
                    ts.hienThiSinhVien();
                    break;
                case 3:
                    ts.timKiemSinhVien();
                    break;
                case 4:
                    ts.thoat();
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
                    break;
            }
        }
    }
}
