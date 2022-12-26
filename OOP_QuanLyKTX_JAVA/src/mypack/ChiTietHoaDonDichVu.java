package mypack;

public class ChiTietHoaDonDichVu {
    public String maHoaDon;
    public String maPhong;
    public double tongTien;
    public String ngayThanhToan;

    //related = singular
    public DichVu dichvu;

    //constructor
    public ChiTietHoaDonDichVu() {}
    public ChiTietHoaDonDichVu(String maHoaDon, String maPhong, double tongTien, String ngayThanhToan,
                               DichVu dichvu)
    {
        this.maHoaDon = maHoaDon;
        this.maPhong = maPhong;
        this.tongTien = tongTien;
        this.ngayThanhToan = ngayThanhToan;
        this.dichvu = dichvu;
    }
    public ChiTietHoaDonDichVu(ChiTietHoaDonDichVu cthd)
    {
        this.maHoaDon = cthd.maHoaDon;
        this.maPhong = cthd.maPhong;
        this.tongTien = cthd.tongTien;
        this.ngayThanhToan = cthd.ngayThanhToan;
        this.dichvu = cthd.dichvu;
    }

    //getter - setter
    public String getMaHoaDon() {
        return maHoaDon;
    }
    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }
    public String getMaPhong() {
        return maPhong;
    }
    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }
    public double getTongTien() {
        return tongTien;
    }
    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
    public String getNgayThanhToan() {
        return ngayThanhToan;
    }
    public void setNgayThanhToan(String ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }
    public DichVu getDichvu() {
        return dichvu;
    }
    public void setDichvu(DichVu dichvu) {
        this.dichvu = dichvu;
    }

}
