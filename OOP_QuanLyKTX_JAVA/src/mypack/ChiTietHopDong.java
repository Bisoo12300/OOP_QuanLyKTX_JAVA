package mypack;


public class ChiTietHopDong {

    public String maHopDong;
    public String maPhong;
    public String ngayBatDau;
    public String ngayKetThuc;

    //related = singular
    public HopDongThuePhong hopDong;
    public Phong phong;

    //constructor
    public ChiTietHopDong() {}
    public ChiTietHopDong(String maHopDong,String maPhong, String ngayBatDau, String ngayKetThuc,
                          HopDongThuePhong hopDong, Phong phong)
    {
        this.maHopDong = maHopDong;
        this.maPhong = maPhong;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.hopDong = hopDong;
        this.phong = phong;
    }
    public ChiTietHopDong(ChiTietHopDong ct)
    {
        this.maHopDong = ct.maHopDong;
        this.maPhong = ct.maPhong;
        this.ngayBatDau = ct.ngayBatDau;
        this.ngayKetThuc = ct.ngayKetThuc;
        this.hopDong = ct.hopDong;
        this.phong = ct.phong;
    }

    //getter - setter
    public HopDongThuePhong getHopDong() {
        return hopDong;
    }
    public void setHopDong(HopDongThuePhong hopDong) {
        this.hopDong = hopDong;
    }
    public Phong getPhong() {
        return phong;
    }
    public void setPhong(Phong phong) {
        this.phong = phong;
    }
    public String getNgayBatDau() {
        return ngayBatDau;
    }
    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }
    public String getNgayKetThuc() {
        return ngayKetThuc;
    }
    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }
    public String getMaHopDong() {
        return maHopDong;
    }
    public void setMaHopDong(String maHopDong) {
        this.maHopDong = maHopDong;
    }
    public String getMaPhong() {
        return maPhong;
    }
    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }
}