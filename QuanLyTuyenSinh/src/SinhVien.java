public class SinhVien {
    private int soBaoDanh;
    private String hoTen;
    private String diaChi;
    private int mucUuTien;
    private String khoi;

    public SinhVien(int soBaoDanh, String hoTen, String diaChi, int mucUuTien, String khoi) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
        this.khoi = khoi;
    }

    public int getSoBaoDanh() {
        return soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getMucUuTien() {
        return mucUuTien;
    }

    public String getKhoi() {
        return khoi;
    }
}