import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
    private ArrayList<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
    private Scanner sc = new Scanner(System.in);

    public void themSinhVien() {
        System.out.println("Nhap so bao danh:");
        int soBaoDanh = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho ten:");
        String hoTen = sc.nextLine();
        System.out.println("Nhap dia chi:");
        String diaChi = sc.nextLine();
        System.out.println("Nhap muc uu tien:");
        int mucUuTien = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap khoi thi:");
        String khoi = sc.nextLine();
        SinhVien sv = new SinhVien(soBaoDanh, hoTen, diaChi, mucUuTien, khoi);
        dsSinhVien.add(sv);
    }

    public void hienThiSinhVien() {
        for (SinhVien sv : dsSinhVien) {
            System.out.println("So bao danh: " + sv.getSoBaoDanh());
            System.out.println("Ho ten: " + sv.getHoTen());
            System.out.println("Dia chi: " + sv.getDiaChi());
            System.out.println("Muc uu tien: " + sv.getMucUuTien());
            System.out.println("Khoi thi: " + sv.getKhoi());
            System.out.println("=======================");
        }
    }

    public void timKiemSinhVien() {
        System.out.println("Nhap so bao danh can tim:");
        int soBaoDanh = sc.nextInt();
        SinhVien sv = null;
        for (SinhVien s : dsSinhVien) {
            if (s.getSoBaoDanh() == soBaoDanh) {
                sv = s;
                break;
            }
        }
        if (sv != null) {
            System.out.println("Thong tin sinh vien:");
            System.out.println("So bao danh: " + sv.getSoBaoDanh());
            System.out.println("Ho ten: " + sv.getHoTen());
            System.out.println("Dia chi: " + sv.getDiaChi());
            System.out.println("Muc uu tien: " + sv.getMucUuTien());
            System.out.println("Khoi thi: " + sv.getKhoi());
        } else {
            System.out.println("Khong tim thay sinh vien.");
        }
    }

    public void thoat() {
        System.out.println("Da thoat chuong trinh.");
        System.exit(0);
    }
}