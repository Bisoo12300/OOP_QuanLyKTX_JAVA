package mypack;

public class NhanVien {

    public String maNV;
    public String maLoaiNV;
    public char maToa;
    public String tenNhanVien;
    public String soDienThoai;
    public double luong;

    //related = singular
    public LoaiNhanVien loaiNhanVien;
    public Toa toa;

    //constructor
    public NhanVien() {}
    public NhanVien(String maNV,String maLoaiNV, char maToa, String tenNhanVien,
                    String soDienThoai, double luong, LoaiNhanVien loaiNhanVien, Toa toa)
    {
        this.maNV = maNV;
        this.maLoaiNV = maLoaiNV;
        this.maToa = maToa;
        this.tenNhanVien = tenNhanVien;
        this.soDienThoai = soDienThoai;
        this.luong = luong;
        this.loaiNhanVien = loaiNhanVien;
        this.toa = toa;
    }
    public NhanVien(NhanVien nv)
    {
        this.maNV = nv.maNV;
        this.maLoaiNV = nv.maLoaiNV;
        this.maToa = nv.maToa;
        this.tenNhanVien = nv.tenNhanVien;
        this.soDienThoai = nv.soDienThoai;
        this.luong = nv.luong;
        this.loaiNhanVien = nv.loaiNhanVien;
        this.toa = nv.toa;
    }

    //getter - setter
    public String getMaNV() {
        return maNV;
    }
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    public LoaiNhanVien getLoaiNhanVien() {
        return loaiNhanVien;
    }
    public void setLoaiNhanVien(LoaiNhanVien loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }
    public Toa getToa() {
        return toa;
    }
    public void setToa(Toa toa) {
        this.toa = toa;
    }
    public String getTenNhanVien() {
        return tenNhanVien;
    }
    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }
    public String getSoDienThoai() {
        return soDienThoai;
    }
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public double getLuong() {
        return luong;
    }
    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getMaLoaiNV() {
        return maLoaiNV;
    }
    public void setMaLoaiNV(String maLoaiNV) {
        this.maLoaiNV = maLoaiNV;
    }
    public char getMaToa() {
        return maToa;
    }
    public void setMaToa(char maToa) {
        this.maToa = maToa;
    }
}
