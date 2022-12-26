package mypack;
import java.util.ArrayList;
import java.util.List;
public class LoaiNhanVien {
    public String maLoaiNV;
    public String chucVu;
    public String congViec;
    public String maQuanLy;

    //related = singular
    public NhanVien quanLy;
    //related  = plural
    public List<NhanVien> dsnhanvien_loai;

    //constructor
    public LoaiNhanVien() {}
    public LoaiNhanVien(String maLoaiNV, String chucVu, String congViec,
                        ArrayList <NhanVien> dsnhanvien_loai, String maQuanLy)
    {
        this.maLoaiNV = maLoaiNV;
        this.chucVu = chucVu;
        this.congViec = congViec;
        this.dsnhanvien_loai = dsnhanvien_loai;
        this.maQuanLy = maQuanLy;
    }
    public LoaiNhanVien(LoaiNhanVien lnv)
    {
        this.maLoaiNV = lnv.maLoaiNV;
        this.chucVu = lnv.chucVu;
        this.congViec = lnv.congViec;
        this.dsnhanvien_loai = lnv.dsnhanvien_loai;
        this.maQuanLy = lnv.maQuanLy;
    }

    //getter - setter
    public String getMaLoaiNV() {
        return maLoaiNV;
    }
    public void setMaLoaiNV(String maLoaiNV) {
        this.maLoaiNV = maLoaiNV;
    }
    public String getChucVu() {
        return chucVu;
    }
    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    public String getCongViec() {
        return congViec;
    }
    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
    public List<NhanVien> getDsnhanvien_loai() {
        return dsnhanvien_loai;
    }
    public void setDsnhanvien_loai(List<NhanVien> dsnhanvien_loai) {
        this.dsnhanvien_loai = dsnhanvien_loai;
    }
    public String getMaQuanLy() {
        return maQuanLy;
    }
    public void setMaQuanLy(String maQuanLy) {
        this.maQuanLy = maQuanLy;
    }
    public NhanVien getQuanLy() {
        return quanLy;
    }
    public void setQuanLy(NhanVien quanLy) {
        this.quanLy = quanLy;
    }

}
