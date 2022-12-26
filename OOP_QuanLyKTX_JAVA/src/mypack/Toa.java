package mypack;

import java.util.ArrayList;
import java.util.List;

public class Toa {

	public char maToa;
	public int sucChua;
	public int soPhong;

	//related - plural
	//1 tòa có nhiều phòng
	public List<Phong> dsphong_toa;	
	
	//1 tòa có nhiều nhân viên
	public List<NhanVien> dsnhanvien_toa;
	
	//constructor
	public Toa(){}
	public Toa(char maToa, int sucChua, int soPhong, 
			ArrayList<Phong> dsphong_toa, ArrayList<NhanVien> dsnhanvien_toa)
	{
		this.maToa = maToa;
		this.sucChua = sucChua;
		this.soPhong = soPhong;
		this.dsphong_toa = dsphong_toa;
		this.dsnhanvien_toa = dsnhanvien_toa;
	}
	public Toa(Toa t)
	{
		this.maToa = t.maToa;
		this.sucChua = t.sucChua;
		this.soPhong = t.soPhong;
		this.dsphong_toa = t.dsphong_toa;
		this.dsnhanvien_toa = t.dsnhanvien_toa;
	}

	//getter - setter
	public char getMaToa() {
		return maToa;
	}
	public void setMaToa(char maToa) {
		this.maToa = maToa;
	}
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}
	public int getSoPhong() {
		return soPhong;
	}
	public void setSoPhong(int soPhong) {
		this.soPhong = soPhong;
	}
	public List<Phong> getDsphong_toa() {
		return dsphong_toa;
	}
	public void setDsphong_toa(List<Phong> dsphong_toa) {
		this.dsphong_toa = dsphong_toa;
	}

	public List<NhanVien> getDsnhanvien_toa() {
		return dsnhanvien_toa;
	}
	public void setDsnhanvien_toa(List<NhanVien> dsnhanvien_toa) {
		this.dsnhanvien_toa = dsnhanvien_toa;
	}
}
