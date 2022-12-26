package mypack;

public class HopDongThuePhong {

    public String maHopDong;
    public String maSV;
    public String ngayKyHopDong;

    //related = singular
    public SinhVien sinhVien;

    //constructor
    public HopDongThuePhong() {}
    public HopDongThuePhong(String maHopDong,String maSV, String ngayKyHopDong, SinhVien sinhVien)
    {
        this.maHopDong = maHopDong;
        this.maSV = maSV;
        this.ngayKyHopDong = ngayKyHopDong;
        this.sinhVien = sinhVien;
    }
    public HopDongThuePhong(HopDongThuePhong hd)
    {
        this.maHopDong = hd.maHopDong;
        this.maSV = hd.maSV;
        this.ngayKyHopDong = hd.ngayKyHopDong;
        this.sinhVien = hd.sinhVien;
    }

    //getter - setter
    public String getMaHopDong() {
        return maHopDong;
    }
    public void setMaHopDong(String maHopDong) {
        this.maHopDong = maHopDong;
    }
    public String getMaSV() {
        return maSV;
    }
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    public String getNgayKyHopDong() {
        return ngayKyHopDong;
    }
    public void setNgayKyHopDong(String ngayKyHopDong) {
        this.ngayKyHopDong = ngayKyHopDong;
    }
    public SinhVien getSinhVien() {
        return sinhVien;
    }
    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }
}
