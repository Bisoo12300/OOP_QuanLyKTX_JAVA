package mypack;

public class SinhVien {

	public String maSV;
	public String tenSV;
	public boolean gioiTinh;
	public String soDienThoai;

	//related = singular
	public Phong phong;

	//constructor
	public SinhVien() {}
	public SinhVien(String maSV, String tenSV, boolean gioiTinh, String soDienThoai,
			Phong phong)
	{
		this.maSV = maSV;
		this.tenSV = tenSV;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.phong = phong;
	}
	public SinhVien(SinhVien sv)
	{
		this.maSV = sv.maSV;
		this.tenSV = sv.tenSV;
		this.gioiTinh = sv.gioiTinh;
		this.soDienThoai = sv.soDienThoai;
		this.phong = sv.phong;
	}
	
	//getter - setter
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public Phong getPhong() {
		return phong;
	}
	public void setPhong(Phong phong) {
		this.phong = phong;
	}
}
