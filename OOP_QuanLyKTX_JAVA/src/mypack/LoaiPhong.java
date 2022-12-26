package mypack;

import java.util.ArrayList;
import java.util.List;

public class LoaiPhong {
    public String maLoaiPhong;
    public String tenLoaiPhong;
    public double giaPhong;

    //related = plural
    //1 loại phòng có nhiều phòng
    public List<Phong> dsphong_loai;

    //constructor
    public LoaiPhong() {}
    public LoaiPhong(String maLoaiPhong, String tenLoaiPhong, double giaPhong, ArrayList<Phong> dsphong_loai)
    {
        this.maLoaiPhong = maLoaiPhong;
        this.tenLoaiPhong = tenLoaiPhong;
        this.giaPhong = giaPhong;
        this.dsphong_loai = dsphong_loai;
    }
    public LoaiPhong(LoaiPhong lp)
    {
        this.maLoaiPhong = lp.maLoaiPhong;
        this.tenLoaiPhong = lp.tenLoaiPhong;
        this.giaPhong = lp.giaPhong;
        this.dsphong_loai= lp.dsphong_loai;

    }

    //getter - setter
    public String getMaLoaiPhong() {
        return maLoaiPhong;
    }
    public void setMaLoaiPhong(String maLoaiPhong) {
        this.maLoaiPhong = maLoaiPhong;
    }
    public String getTenLoaiPhong() {
        return tenLoaiPhong;
    }
    public void setTenLoaiPhong(String tenLoaiPhong) {
        this.tenLoaiPhong = tenLoaiPhong;
    }
    public double getGiaPhong() {
        return giaPhong;
    }
    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }
    public List<Phong> getDsphong() {
        return dsphong_loai;
    }
    public void setDsphong(List<Phong> dsphong_loai) {
        this.dsphong_loai = dsphong_loai;
    }
    public List<Phong> getDsphong_loai() {
        return dsphong_loai;
    }
    public void setDsphong_loai(List<Phong> dsphong_loai) {
        this.dsphong_loai = dsphong_loai;
    }
}
