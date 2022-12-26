package mypack;
import java.util.ArrayList;
import java.util.List;
public class Phong {

    public String maPhong;
    public char maToa;
    public String maLoaiPhong;
    public boolean trangThai;

    //related = singular
    public Toa toa;
    public LoaiPhong loaiPhong;
    //related = plural
    public List<SinhVien> dssv_phong;
    //constructor
    public Phong() {}
    public Phong(String maPhong, char maToa,String maLoaiPhong, boolean trangThai, Toa toa,
                 LoaiPhong loaiPhong, ArrayList<SinhVien> dssv_phong)
    {
        this.maPhong = maPhong;
        this.maToa = maToa;
        this.maLoaiPhong = maLoaiPhong;
        this.trangThai = trangThai;
        this.toa = toa;
        this.loaiPhong = loaiPhong;
        this.dssv_phong = dssv_phong;
    }
    public Phong(Phong p)
    {
        this.maPhong = p.maPhong;
        this.maToa = p.maToa;
        this.maLoaiPhong = p.maLoaiPhong;
        this.trangThai = p.trangThai;
        this.toa = p.toa;
        this.loaiPhong = p.loaiPhong;
        this.dssv_phong = p.dssv_phong;
    }

    //getter - setter
    public String getMaPhong() {
        return maPhong;
    }
    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }
    public Toa getToa() {
        return toa;
    }
    public void setToa(Toa toa) {
        this.toa = toa;
    }
    public LoaiPhong getLoaiPhong() {
        return loaiPhong;
    }
    public void setLoaiPhong(LoaiPhong loaiPhong) {
        this.loaiPhong = loaiPhong;
    }
    public boolean isTrangThai() {
        return trangThai;
    }
    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    public char getMaToa() {
        return maToa;
    }
    public void setMaToa(char maToa) {
        this.maToa = maToa;
    }
    public String getMaLoaiPhong() {
        return maLoaiPhong;
    }
    public void setMaLoaiPhong(String maLoaiPhong) {
        this.maLoaiPhong = maLoaiPhong;
    }
    public List<SinhVien> getDssv_phong() {
        return dssv_phong;
    }
    public void setDssv_phong(List<SinhVien> dssv_phong) {
        this.dssv_phong = dssv_phong;
    }
}
