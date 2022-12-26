package mypack;

public class DichVu {
    public String maHoaDon;
    public String tenDichVu;

    //constructor
    public DichVu() {}
    public DichVu(String maHoaDon, String tenDichVu)
    {
        this.maHoaDon = maHoaDon;
        this.tenDichVu = tenDichVu;
    }
    public DichVu(DichVu HoaDonDV)
    {
        this.maHoaDon = HoaDonDV.maHoaDon;
        this.tenDichVu = HoaDonDV.tenDichVu;
    }

    //getter - setter
    public String getMaHoaDon() {
        return maHoaDon;
    }
    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }
    public String getTenDichVu() {
        return tenDichVu;
    }
    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }
}