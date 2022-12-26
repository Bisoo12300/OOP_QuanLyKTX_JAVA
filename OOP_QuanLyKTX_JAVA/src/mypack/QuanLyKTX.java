package mypack;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class QuanLyKTX {

    //Data
    public static List<Phong> dsPhong = new ArrayList<Phong>();
    public static List<LoaiPhong> dsLoaiPhong = new ArrayList<LoaiPhong>();
    public static List<Toa> dsToa = new ArrayList<Toa>();
    public static List<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
    public static List<DichVu> dsDichVu = new ArrayList<DichVu>();
    public static List<ChiTietHoaDonDichVu> dsHoaDon = new ArrayList<ChiTietHoaDonDichVu>();
    public static List<LoaiNhanVien> dsLoaiNhanVien = new ArrayList<LoaiNhanVien>();
    public static List<NhanVien> dsNhanVien = new ArrayList<NhanVien>();
    public static List<ThietBi> dsThietBi = new ArrayList<ThietBi>();
    public static List<TrangBi> dsTrangBi = new ArrayList<TrangBi>();
    public static List<HopDongThuePhong> dsHopDong = new ArrayList<HopDongThuePhong>();
    public static List<ChiTietHopDong> dsChiTietHopDong = new ArrayList<ChiTietHopDong>();

    public static void TaoDanhSachTrangBi()
    {
        dsTrangBi.add(new TrangBi(dsPhong.get(0).maLoaiPhong, dsLoaiPhong.get(0), new ArrayList<ThietBi>()));
        dsTrangBi.add(new TrangBi(dsPhong.get(1).maLoaiPhong, dsLoaiPhong.get(1), new ArrayList<ThietBi>()));
        dsTrangBi.add(new TrangBi(dsPhong.get(2).maLoaiPhong, dsLoaiPhong.get(2), new ArrayList<ThietBi>()));
        dsTrangBi.add(new TrangBi(dsPhong.get(3).maLoaiPhong, dsLoaiPhong.get(3), new ArrayList<ThietBi>()));
        dsTrangBi.add(new TrangBi(dsPhong.get(4).maLoaiPhong, dsLoaiPhong.get(4), new ArrayList<ThietBi>()));
        dsTrangBi.add(new TrangBi(dsPhong.get(5).maLoaiPhong, dsLoaiPhong.get(5), new ArrayList<ThietBi>()));
    }
    public static void TaoDanhSachThietBi()
    {
        dsThietBi.add(new ThietBi("QT", "Quạt treo"));//0
        dsThietBi.add(new ThietBi("ML", "Máy lạnh"));//1
        dsThietBi.add(new ThietBi("QĐ", "Quạt đứng"));//2
        dsThietBi.add(new ThietBi("BH", "Bàn học"));//3
        dsThietBi.add(new ThietBi("ĐH", "Đèn học"));//4
        dsThietBi.add(new ThietBi("QTr", "Quạt trần"));//5
        dsThietBi.add(new ThietBi("TĐ", "Tủ đồ cá nhân"));//6
        dsThietBi.add(new ThietBi("Ghe", "Ghế ngồi"));//7
        dsThietBi.add(new ThietBi("MTD", "Móc treo đồ"));//8
        dsThietBi.add(new ThietBi("OCD", "Ổ cắm điện"));//9


        dsTrangBi.get(0).dsthietbi_loaiphong.add(dsThietBi.get(1));
        dsTrangBi.get(0).dsthietbi_loaiphong.add(dsThietBi.get(3));
        dsTrangBi.get(0).dsthietbi_loaiphong.add(dsThietBi.get(4));
        dsTrangBi.get(0).dsthietbi_loaiphong.add(dsThietBi.get(5));
        dsTrangBi.get(0).dsthietbi_loaiphong.add(dsThietBi.get(6));
        dsTrangBi.get(0).dsthietbi_loaiphong.add(dsThietBi.get(7));
        dsTrangBi.get(0).dsthietbi_loaiphong.add(dsThietBi.get(8));

        dsTrangBi.get(1).dsthietbi_loaiphong.add(dsThietBi.get(1));
        dsTrangBi.get(1).dsthietbi_loaiphong.add(dsThietBi.get(3));
        dsTrangBi.get(1).dsthietbi_loaiphong.add(dsThietBi.get(4));
        dsTrangBi.get(1).dsthietbi_loaiphong.add(dsThietBi.get(5));
        dsTrangBi.get(1).dsthietbi_loaiphong.add(dsThietBi.get(6));
        dsTrangBi.get(1).dsthietbi_loaiphong.add(dsThietBi.get(7));
        dsTrangBi.get(1).dsthietbi_loaiphong.add(dsThietBi.get(8));
        dsTrangBi.get(1).dsthietbi_loaiphong.add(dsThietBi.get(9));

        dsTrangBi.get(2).dsthietbi_loaiphong.add(dsThietBi.get(1));
        dsTrangBi.get(2).dsthietbi_loaiphong.add(dsThietBi.get(2));
        dsTrangBi.get(2).dsthietbi_loaiphong.add(dsThietBi.get(3));
        dsTrangBi.get(2).dsthietbi_loaiphong.add(dsThietBi.get(4));
        dsTrangBi.get(2).dsthietbi_loaiphong.add(dsThietBi.get(5));
        dsTrangBi.get(2).dsthietbi_loaiphong.add(dsThietBi.get(6));
        dsTrangBi.get(2).dsthietbi_loaiphong.add(dsThietBi.get(7));
        dsTrangBi.get(2).dsthietbi_loaiphong.add(dsThietBi.get(8));
        dsTrangBi.get(2).dsthietbi_loaiphong.add(dsThietBi.get(9));

        dsTrangBi.get(3).dsthietbi_loaiphong.add(dsThietBi.get(0));
        dsTrangBi.get(3).dsthietbi_loaiphong.add(dsThietBi.get(3));
        dsTrangBi.get(3).dsthietbi_loaiphong.add(dsThietBi.get(5));
        dsTrangBi.get(3).dsthietbi_loaiphong.add(dsThietBi.get(7));

        dsTrangBi.get(4).dsthietbi_loaiphong.add(dsThietBi.get(0));
        dsTrangBi.get(4).dsthietbi_loaiphong.add(dsThietBi.get(2));
        dsTrangBi.get(4).dsthietbi_loaiphong.add(dsThietBi.get(3));
        dsTrangBi.get(4).dsthietbi_loaiphong.add(dsThietBi.get(5));
        dsTrangBi.get(4).dsthietbi_loaiphong.add(dsThietBi.get(6));
        dsTrangBi.get(4).dsthietbi_loaiphong.add(dsThietBi.get(7));

        dsTrangBi.get(5).dsthietbi_loaiphong.add(dsThietBi.get(0));
        dsTrangBi.get(5).dsthietbi_loaiphong.add(dsThietBi.get(2));
        dsTrangBi.get(5).dsthietbi_loaiphong.add(dsThietBi.get(3));
        dsTrangBi.get(5).dsthietbi_loaiphong.add(dsThietBi.get(5));
        dsTrangBi.get(5).dsthietbi_loaiphong.add(dsThietBi.get(6));
        dsTrangBi.get(5).dsthietbi_loaiphong.add(dsThietBi.get(7));
        dsTrangBi.get(5).dsthietbi_loaiphong.add(dsThietBi.get(9));

    }
    public static void TaoDanhSachDichVu()
    {
        dsDichVu.add(new DichVu("BNU", "Binh nuoc uong 20L"));//0 40K
        dsDichVu.add(new DichVu("GD", "Giat do"));//1 60k
        dsDichVu.add(new DichVu("PHOTO", "Photocopy"));//20k
        dsDichVu.add(new DichVu("INT", "Internet"));//3 200k
        dsDichVu.add(new DichVu("GX", "Giu xe"));//4 150k
    }
    public static void TaoDanhSachChiTietHoaDonDichVu()
    {
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV01 - BNU", dsPhong.get(0).maPhong, 160000, "03/12/2020", dsDichVu.get(0)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV01 - GD", dsPhong.get(0).maPhong, 180000, "03/12/2020", dsDichVu.get(1)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV01 - PHOTO", dsPhong.get(0).maPhong, 80000, "03/12/2020", dsDichVu.get(2)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV01 - INT", dsPhong.get(0).maPhong, 200000, "03/12/2020", dsDichVu.get(3)));

        dsHoaDon.add(new ChiTietHoaDonDichVu("DV02 - BNU", dsPhong.get(1).maPhong, 120000, "02/12/2020", dsDichVu.get(0)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV02 - GD", dsPhong.get(1).maPhong, 240000, "04/12/2020", dsDichVu.get(1)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV02 - INT", dsPhong.get(1).maPhong, 400000, "05/12/2020", dsDichVu.get(3)));

        dsHoaDon.add(new ChiTietHoaDonDichVu("DV03 - BNU", dsPhong.get(2).maPhong, 200000, "12/12/2020", dsDichVu.get(0)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV03 - GD", dsPhong.get(2).maPhong, 180000, "13/12/2020", dsDichVu.get(1)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV03 - INT ", dsPhong.get(2).maPhong, 200000, "13/12/2020", dsDichVu.get(3)));

        dsHoaDon.add(new ChiTietHoaDonDichVu("DV04 - BNU", dsPhong.get(3).maPhong, 120000, "23/12/2020", dsDichVu.get(0)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV04 - GD", dsPhong.get(3).maPhong, 120000, "23/12/2020", dsDichVu.get(1)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV04 - INT", dsPhong.get(3).maPhong, 400000, "23/12/2020", dsDichVu.get(3)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV04 - GX", dsPhong.get(3).maPhong, 150000, "23/12/2020", dsDichVu.get(4)));

        dsHoaDon.add(new ChiTietHoaDonDichVu("DV05 - BNU", dsPhong.get(4).maPhong, 200000, "14/12/2020", dsDichVu.get(0)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV05 - GD", dsPhong.get(4).maPhong, 240000, "0115/12/2020", dsDichVu.get(1)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV05 - PHOTO", dsPhong.get(4).maPhong, 100000, "16/12/2020", dsDichVu.get(2)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV05 - INT", dsPhong.get(4).maPhong, 400000, "16/12/2020", dsDichVu.get(3)));

        dsHoaDon.add(new ChiTietHoaDonDichVu("DV06 - INT", dsPhong.get(5).maPhong, 200000, null, dsDichVu.get(3)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV06 - PHOTO", dsPhong.get(5).maPhong, 60000, null, dsDichVu.get(2)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV06 - GD", dsPhong.get(5).maPhong, 150000, "25/12/2020", dsDichVu.get(4)));

        dsHoaDon.add(new ChiTietHoaDonDichVu("DV07 - BNU", dsPhong.get(6).maPhong, 240000, "23/12/2020", dsDichVu.get(0)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV07 - PHOTO", dsPhong.get(6).maPhong, 60000, "20/12/2020", dsDichVu.get(2)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV07 - GD", dsPhong.get(6).maPhong, 150000, "25/12/2020", dsDichVu.get(4)));

        dsHoaDon.add(new ChiTietHoaDonDichVu("DV11 - GT", dsPhong.get(10).maPhong, 120000, null, dsDichVu.get(1)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV11 - INT", dsPhong.get(10).maPhong, 200000, null, dsDichVu.get(3)));

        dsHoaDon.add(new ChiTietHoaDonDichVu("DV12 - BNU", dsPhong.get(11).maPhong, 40000, "18/12/2020", dsDichVu.get(0)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV12 - GD", dsPhong.get(11).maPhong, 60000, "01/12/2020", dsDichVu.get(1)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV12 - PHOTO", dsPhong.get(11).maPhong, 40000, "20/12/2020", dsDichVu.get(2)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV12 - INT", dsPhong.get(11).maPhong, 200000, "03/12/2020", dsDichVu.get(3)));

        dsHoaDon.add(new ChiTietHoaDonDichVu("DV13 - GD", dsPhong.get(12).maPhong, 60000, null, dsDichVu.get(1)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV13 - INT", dsPhong.get(12).maPhong, 200000, null, dsDichVu.get(3)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV13 - GX", dsPhong.get(12).maPhong, 300000, null, dsDichVu.get(4)));

        dsHoaDon.add(new ChiTietHoaDonDichVu("DV15 - BNU", dsPhong.get(14).maPhong, 80000, "19/12/2020", dsDichVu.get(0)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV15 - PHOTO", dsPhong.get(14).maPhong, 20000, "20/12/2020", dsDichVu.get(2)));

        dsHoaDon.add(new ChiTietHoaDonDichVu("DV16 - GD", dsPhong.get(15).maPhong, 60000, "21/12/2020", dsDichVu.get(1)));
        dsHoaDon.add(new ChiTietHoaDonDichVu("DV16 - PHOTO", dsPhong.get(15).maPhong, 80000, "21/12/2020", dsDichVu.get(2)));
    }
    public static void TaoDanhSachChiTietHopDong()
    {
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(0).maHopDong, dsPhong.get(0).maPhong, "08/01/2020", "08/01/2020", dsHopDong.get(0), dsPhong.get(0)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(1).maHopDong, dsPhong.get(0).maPhong, "09/01/2020", "09/01/2020", dsHopDong.get(1), dsPhong.get(0)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(2).maHopDong, dsPhong.get(1).maPhong, "23/01/2020", "23/02/2021", dsHopDong.get(2), dsPhong.get(1)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(3).maHopDong, dsPhong.get(1).maPhong, "18/02/2020", "18/02/2021", dsHopDong.get(3), dsPhong.get(1)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(4).maHopDong, dsPhong.get(1).maPhong, "02/03/2020", "02/03/2021", dsHopDong.get(4), dsPhong.get(1)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(5).maHopDong, dsPhong.get(5).maPhong, "07/03/2020", "07/01/2021", dsHopDong.get(5), dsPhong.get(5)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(6).maHopDong, dsPhong.get(2).maPhong, "12/03/2020", "12/06/2021", dsHopDong.get(6), dsPhong.get(2)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(7).maHopDong, dsPhong.get(2).maPhong, "17/03/2020", "17/06/2020", dsHopDong.get(7), dsPhong.get(2)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(8).maHopDong, dsPhong.get(3).maPhong, "24/03/2020", "24/01/2021", dsHopDong.get(8), dsPhong.get(3)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(9).maHopDong, dsPhong.get(3).maPhong, "21/04/2020", "21/04/2021", dsHopDong.get(9), dsPhong.get(3)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(10).maHopDong, dsPhong.get(4).maPhong, "24/04/2020", "24/04/2021", dsHopDong.get(10), dsPhong.get(4)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(11).maHopDong, dsPhong.get(4).maPhong, "07/05/2020", "07/05/2021", dsHopDong.get(11), dsPhong.get(4)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(12).maHopDong, dsPhong.get(5).maPhong, "08/05/2020", "08/05/2021", dsHopDong.get(12), dsPhong.get(5)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(13).maHopDong, dsPhong.get(5).maPhong, "18/05/2020", "18/05/2021", dsHopDong.get(13), dsPhong.get(5)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(14).maHopDong, dsPhong.get(6).maPhong, "28/05/2020", "28/01/2021", dsHopDong.get(14), dsPhong.get(6)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(15).maHopDong, dsPhong.get(6).maPhong, "06/06/2020", "05/02/2021", dsHopDong.get(15), dsPhong.get(6)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(16).maHopDong, dsPhong.get(6).maPhong, "09/06/2020", "09/02/2021", dsHopDong.get(16), dsPhong.get(6)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(17).maHopDong, dsPhong.get(10).maPhong, "17/06/2020", "17/02/2021", dsHopDong.get(17), dsPhong.get(10)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(18).maHopDong, dsPhong.get(10).maPhong, "24/06/2020", "24/02/2021", dsHopDong.get(18), dsPhong.get(10)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(19).maHopDong, dsPhong.get(11).maPhong, "21/07/2020", "21/07/2022", dsHopDong.get(19), dsPhong.get(11)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(20).maHopDong, dsPhong.get(11).maPhong, "28/07/2020", "28/07/2022", dsHopDong.get(20), dsPhong.get(11)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(21).maHopDong, dsPhong.get(11).maPhong, "05/08/2020", "05/08/2022", dsHopDong.get(21), dsPhong.get(11)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(22).maHopDong, dsPhong.get(12).maPhong, "12/08/2020", "12/08/2022", dsHopDong.get(22), dsPhong.get(12)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(23).maHopDong, dsPhong.get(12).maPhong, "28/08/2020", "28/082021", dsHopDong.get(23), dsPhong.get(12)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(24).maHopDong, dsPhong.get(12).maPhong, "17/09/2020", "17/09/2021", dsHopDong.get(24), dsPhong.get(12)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(25).maHopDong, dsPhong.get(14).maPhong, "12/10/2020", "12/09/2021", dsHopDong.get(25), dsPhong.get(14)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(26).maHopDong, dsPhong.get(14).maPhong, "22/10/2020", "22/10/2021", dsHopDong.get(26), dsPhong.get(14)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(27).maHopDong, dsPhong.get(15).maPhong, "26/10/2020", "26/10/2021", dsHopDong.get(27), dsPhong.get(15)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(28).maHopDong, dsPhong.get(15).maPhong, "30/10/2020", "03/10/2021", dsHopDong.get(28), dsPhong.get(15)));
        dsChiTietHopDong.add(new ChiTietHopDong(dsHopDong.get(29).maHopDong, dsPhong.get(15).maPhong, "31/10/2020", "31/10/2021", dsHopDong.get(29), dsPhong.get(15)));
    }
    public static void TaoDanhSachHopDong()
    {
        dsHopDong.add(new HopDongThuePhong("HD01", dsSinhVien.get(0).maSV, "05/01/2020", dsSinhVien.get(0)));
        dsHopDong.add(new HopDongThuePhong("HD02", dsSinhVien.get(1).maSV, "01/07/2020", dsSinhVien.get(1)));
        dsHopDong.add(new HopDongThuePhong("HD03", dsSinhVien.get(2).maSV, "17/01/2020", dsSinhVien.get(2)));
        dsHopDong.add(new HopDongThuePhong("HD04", dsSinhVien.get(3).maSV, "11/02/2020", dsSinhVien.get(3)));
        dsHopDong.add(new HopDongThuePhong("HD05", dsSinhVien.get(4).maSV, "02/03/2020", dsSinhVien.get(4)));
        dsHopDong.add(new HopDongThuePhong("HD06", dsSinhVien.get(5).maSV, "28/02/2020", dsSinhVien.get(5)));
        dsHopDong.add(new HopDongThuePhong("HD07", dsSinhVien.get(6).maSV, "02/03/2020", dsSinhVien.get(6)));
        dsHopDong.add(new HopDongThuePhong("HD08", dsSinhVien.get(7).maSV, "05/03/2020", dsSinhVien.get(7)));
        dsHopDong.add(new HopDongThuePhong("HD09", dsSinhVien.get(8).maSV, "10/03/2020", dsSinhVien.get(8)));
        dsHopDong.add(new HopDongThuePhong("HD10", dsSinhVien.get(9).maSV, "17/03/2020", dsSinhVien.get(9)));
        dsHopDong.add(new HopDongThuePhong("HD11", dsSinhVien.get(10).maSV, "13/04/2020", dsSinhVien.get(10)));
        dsHopDong.add(new HopDongThuePhong("HD12", dsSinhVien.get(11).maSV, "16/04/2020", dsSinhVien.get(11)));
        dsHopDong.add(new HopDongThuePhong("HD13", dsSinhVien.get(12).maSV, "01/05/2020", dsSinhVien.get(12)));
        dsHopDong.add(new HopDongThuePhong("HD14", dsSinhVien.get(13).maSV, "02/05/2020", dsSinhVien.get(13)));
        dsHopDong.add(new HopDongThuePhong("HD15", dsSinhVien.get(14).maSV, "11/05/2020", dsSinhVien.get(14)));
        dsHopDong.add(new HopDongThuePhong("HD16", dsSinhVien.get(15).maSV, "21/05/2020", dsSinhVien.get(15)));
        dsHopDong.add(new HopDongThuePhong("HD17", dsSinhVien.get(16).maSV, "30/05/2020", dsSinhVien.get(16)));
        dsHopDong.add(new HopDongThuePhong("HD18", dsSinhVien.get(17).maSV, "02/06/2020", dsSinhVien.get(17)));
        dsHopDong.add(new HopDongThuePhong("HD19", dsSinhVien.get(18).maSV, "02/06/2020", dsSinhVien.get(18)));
        dsHopDong.add(new HopDongThuePhong("HD20", dsSinhVien.get(19).maSV, "17/07/2020", dsSinhVien.get(19)));
        dsHopDong.add(new HopDongThuePhong("HD21", dsSinhVien.get(20).maSV, "05/07/2020", dsSinhVien.get(20)));
        dsHopDong.add(new HopDongThuePhong("HD22", dsSinhVien.get(21).maSV, "25/07/2020", dsSinhVien.get(21)));
        dsHopDong.add(new HopDongThuePhong("HD23", dsSinhVien.get(22).maSV, "28/07/2020", dsSinhVien.get(22)));
        dsHopDong.add(new HopDongThuePhong("HD24", dsSinhVien.get(23).maSV, "03/09/2020", dsSinhVien.get(23)));
        dsHopDong.add(new HopDongThuePhong("HD25", dsSinhVien.get(24).maSV, "28/09/2020", dsSinhVien.get(24)));
        dsHopDong.add(new HopDongThuePhong("HD26", dsSinhVien.get(25).maSV, "03/10/2020", dsSinhVien.get(25)));
        dsHopDong.add(new HopDongThuePhong("HD27", dsSinhVien.get(26).maSV, "07/10/2020", dsSinhVien.get(26)));
        dsHopDong.add(new HopDongThuePhong("HD28", dsSinhVien.get(27).maSV, "20/10/2020", dsSinhVien.get(27)));
        dsHopDong.add(new HopDongThuePhong("HD29", dsSinhVien.get(28).maSV, "07/10/2020", dsSinhVien.get(28)));
        dsHopDong.add(new HopDongThuePhong("HD30", dsSinhVien.get(29).maSV, "10/10/2020", dsSinhVien.get(29)));
    }
    public static void TaoDanhSachLoaiNhanVien()
    {
        dsLoaiNhanVien.add(new LoaiNhanVien("LNV01", "Lao công", "Quét sân", new ArrayList<NhanVien>(), null));
        dsLoaiNhanVien.add(new LoaiNhanVien("LNV02", "Phụ bếp", "Dọn dẹp nhà bếp", new ArrayList<NhanVien>(), null));
        dsLoaiNhanVien.add(new LoaiNhanVien("LNV03", "Đầu bếp", "Nấu ăn", new ArrayList<NhanVien>(), null));
        dsLoaiNhanVien.add(new LoaiNhanVien("LNV04", "Bảo vệ", "Canh cổng ra vào", new ArrayList<NhanVien>(), null));
        dsLoaiNhanVien.add(new LoaiNhanVien("LNV05", "Sửa điện", "Xử lý vấn đề về điện", new ArrayList<NhanVien>(), null));
    }
    public static void TaoDanhSachNhanVien()
    {
        dsNhanVien.add(new NhanVien("NV01", dsLoaiNhanVien.get(0).maLoaiNV, dsToa.get(1).maToa, "Phan Quang Đạt", "0321550699", 12000000, dsLoaiNhanVien.get(0), dsToa.get(1)));
        dsNhanVien.add(new NhanVien("NV02", dsLoaiNhanVien.get(0).maLoaiNV, dsToa.get(1).maToa, "Nguyễn Hoàng Hải", "0935538764", 10500000, dsLoaiNhanVien.get(0), dsToa.get(1)));
        dsNhanVien.add(new NhanVien("NV03", dsLoaiNhanVien.get(1).maLoaiNV, dsToa.get(2).maToa, "Phan Ninh Thuật", "0375512722", 12500000, dsLoaiNhanVien.get(1), dsToa.get(2)));
        dsNhanVien.add(new NhanVien("NV04", dsLoaiNhanVien.get(4).maLoaiNV, dsToa.get(2).maToa, "Văn Viết Hồng", "0933592539", 15500000, dsLoaiNhanVien.get(4), dsToa.get(2)));
        dsNhanVien.add(new NhanVien("NV05", dsLoaiNhanVien.get(2).maLoaiNV, dsToa.get(3).maToa, "Vũ Hoàng Lâm", "0873562883", 11300000, dsLoaiNhanVien.get(2), dsToa.get(3)));
        dsNhanVien.add(new NhanVien("NV06", dsLoaiNhanVien.get(2).maLoaiNV, dsToa.get(3).maToa, "Trần Văn Tài", "0376588314", 14800000, dsLoaiNhanVien.get(2), dsToa.get(3)));
        dsNhanVien.add(new NhanVien("NV07", dsLoaiNhanVien.get(3).maLoaiNV, dsToa.get(3).maToa, "Nguyễn Thị Bích Châu", "0935543050", 18200000, dsLoaiNhanVien.get(3), dsToa.get(3)));
        dsNhanVien.add(new NhanVien("NV08", dsLoaiNhanVien.get(3).maLoaiNV, dsToa.get(0).maToa, "Trần Hạnh Vy", "0835559895", 11500000, dsLoaiNhanVien.get(3), dsToa.get(0)));
        dsNhanVien.add(new NhanVien("NV09", dsLoaiNhanVien.get(2).maLoaiNV, dsToa.get(1).maToa, "Trần Phương Thanh", "0855586047", 12000000, dsLoaiNhanVien.get(2), dsToa.get(1)));
        dsNhanVien.add(new NhanVien("NV10", dsLoaiNhanVien.get(1).maLoaiNV, dsToa.get(2).maToa, "Ngô Ngọc Huế", "0935517709", 13500000, dsLoaiNhanVien.get(1), dsToa.get(2)));
        dsNhanVien.add(new NhanVien("NV11", dsLoaiNhanVien.get(3).maLoaiNV, dsToa.get(1).maToa, "Khưu Hoài Bắc", "0952114939", 13000000, dsLoaiNhanVien.get(3), dsToa.get(1)));
        dsNhanVien.add(new NhanVien("NV12", dsLoaiNhanVien.get(3).maLoaiNV, dsToa.get(1).maToa, "Tôn Yên Bình", "0933213448", 11500000, dsLoaiNhanVien.get(3), dsToa.get(1)));
        dsNhanVien.add(new NhanVien("NV13", dsLoaiNhanVien.get(3).maLoaiNV, dsToa.get(2).maToa, "Nguyễn Nguyên Khôi", "0941527983", 13500000, dsLoaiNhanVien.get(3), dsToa.get(2)));
        dsNhanVien.add(new NhanVien("NV14", dsLoaiNhanVien.get(3).maLoaiNV, dsToa.get(2).maToa, "Hoàng Hiệp Hà", "0992525872", 16500000, dsLoaiNhanVien.get(3), dsToa.get(2)));
        dsNhanVien.add(new NhanVien("NV15", dsLoaiNhanVien.get(0).maLoaiNV, dsToa.get(3).maToa, "Lâm Phi Hùng", "0991204916", 12300000, dsLoaiNhanVien.get(0), dsToa.get(3)));
        dsNhanVien.add(new NhanVien("NV16", dsLoaiNhanVien.get(4).maLoaiNV, dsToa.get(3).maToa, "Trần Tấn Nam", "0967537105", 15800000, dsLoaiNhanVien.get(4), dsToa.get(3)));
        dsNhanVien.add(new NhanVien("NV17", dsLoaiNhanVien.get(4).maLoaiNV, dsToa.get(3).maToa, "Trần Minh Tiến", "0938910107", 19200000, dsLoaiNhanVien.get(4), dsToa.get(3)));
        dsNhanVien.add(new NhanVien("NV18", dsLoaiNhanVien.get(4).maLoaiNV, dsToa.get(0).maToa, "Phạm Minh Thiện", "0921507874", 12500000, dsLoaiNhanVien.get(4), dsToa.get(0)));
        dsNhanVien.add(new NhanVien("NV19", dsLoaiNhanVien.get(2).maLoaiNV, dsToa.get(1).maToa, "Hoàng Công Bằng", "0973125823", 13000000, dsLoaiNhanVien.get(2), dsToa.get(1)));
        dsNhanVien.add(new NhanVien("NV20", dsLoaiNhanVien.get(2).maLoaiNV, dsToa.get(2).maToa, "Nguyễn Thành Công", "0931213547", 13500000, dsLoaiNhanVien.get(2), dsToa.get(2)));
        dsNhanVien.add(new NhanVien("NV21", dsLoaiNhanVien.get(0).maLoaiNV, dsToa.get(1).maToa, "Bùi Trọng Kim", "0935181991", 12000000, dsLoaiNhanVien.get(0), dsToa.get(1)));
        dsNhanVien.add(new NhanVien("NV22", dsLoaiNhanVien.get(0).maLoaiNV, dsToa.get(1).maToa, "Đào Phi Hải", "0912529277", 10500000, dsLoaiNhanVien.get(0), dsToa.get(1)));
        dsNhanVien.add(new NhanVien("NV23", dsLoaiNhanVien.get(0).maLoaiNV, dsToa.get(2).maToa, "Trịnh Thiện Luân", "0987558119", 12500000, dsLoaiNhanVien.get(0), dsToa.get(2)));
        dsNhanVien.add(new NhanVien("NV24", dsLoaiNhanVien.get(1).maLoaiNV, dsToa.get(2).maToa, "Nguyễn Quang Ninh", "0935502239", 15500000, dsLoaiNhanVien.get(1), dsToa.get(2)));
        dsNhanVien.add(new NhanVien("NV25", dsLoaiNhanVien.get(1).maLoaiNV, dsToa.get(3).maToa, "Trần Minh Thạc", "0936457259", 10300000, dsLoaiNhanVien.get(1), dsToa.get(3)));
        dsNhanVien.add(new NhanVien("NV26", dsLoaiNhanVien.get(1).maLoaiNV, dsToa.get(3).maToa, "Nguyễn Minh Thạc", "0935599247", 14800000, dsLoaiNhanVien.get(1), dsToa.get(3)));
        dsNhanVien.add(new NhanVien("NV27", dsLoaiNhanVien.get(0).maLoaiNV, dsToa.get(3).maToa, "Trần Công Ân", "0912590004", 17200000, dsLoaiNhanVien.get(0), dsToa.get(3)));
        dsNhanVien.add(new NhanVien("NV28", dsLoaiNhanVien.get(0).maLoaiNV, dsToa.get(0).maToa, "Mạnh Gia Bình", "0958974792", 9500000, dsLoaiNhanVien.get(0), dsToa.get(0)));
        dsNhanVien.add(new NhanVien("NV29", dsLoaiNhanVien.get(0).maLoaiNV, dsToa.get(1).maToa, "Thịnh Bảo Lâm", "0915501907", 11000000, dsLoaiNhanVien.get(0), dsToa.get(1)));
        dsNhanVien.add(new NhanVien("NV30", dsLoaiNhanVien.get(0).maLoaiNV, dsToa.get(2).maToa, "Nguyễn Cao Tiến", "0958585889", 12500000, dsLoaiNhanVien.get(0), dsToa.get(2)));

        dsLoaiNhanVien.get(0).dsnhanvien_loai.add(dsNhanVien.get(0));
        dsLoaiNhanVien.get(0).dsnhanvien_loai.add(dsNhanVien.get(1));
        dsLoaiNhanVien.get(0).dsnhanvien_loai.add(dsNhanVien.get(14));
        dsLoaiNhanVien.get(0).dsnhanvien_loai.add(dsNhanVien.get(20));
        dsLoaiNhanVien.get(0).dsnhanvien_loai.add(dsNhanVien.get(21));
        dsLoaiNhanVien.get(0).dsnhanvien_loai.add(dsNhanVien.get(22));
        dsLoaiNhanVien.get(0).dsnhanvien_loai.add(dsNhanVien.get(26));
        dsLoaiNhanVien.get(0).dsnhanvien_loai.add(dsNhanVien.get(27));
        dsLoaiNhanVien.get(0).dsnhanvien_loai.add(dsNhanVien.get(28));
        dsLoaiNhanVien.get(0).dsnhanvien_loai.add(dsNhanVien.get(29));


        dsLoaiNhanVien.get(1).dsnhanvien_loai.add(dsNhanVien.get(2));
        dsLoaiNhanVien.get(1).dsnhanvien_loai.add(dsNhanVien.get(9));
        dsLoaiNhanVien.get(1).dsnhanvien_loai.add(dsNhanVien.get(23));
        dsLoaiNhanVien.get(1).dsnhanvien_loai.add(dsNhanVien.get(24));
        dsLoaiNhanVien.get(1).dsnhanvien_loai.add(dsNhanVien.get(25));


        dsLoaiNhanVien.get(2).dsnhanvien_loai.add(dsNhanVien.get(4));
        dsLoaiNhanVien.get(2).dsnhanvien_loai.add(dsNhanVien.get(5));
        dsLoaiNhanVien.get(2).dsnhanvien_loai.add(dsNhanVien.get(8));
        dsLoaiNhanVien.get(2).dsnhanvien_loai.add(dsNhanVien.get(18));
        dsLoaiNhanVien.get(2).dsnhanvien_loai.add(dsNhanVien.get(19));

        dsLoaiNhanVien.get(3).dsnhanvien_loai.add(dsNhanVien.get(6));
        dsLoaiNhanVien.get(3).dsnhanvien_loai.add(dsNhanVien.get(7));
        dsLoaiNhanVien.get(3).dsnhanvien_loai.add(dsNhanVien.get(10));
        dsLoaiNhanVien.get(3).dsnhanvien_loai.add(dsNhanVien.get(11));
        dsLoaiNhanVien.get(3).dsnhanvien_loai.add(dsNhanVien.get(12));
        dsLoaiNhanVien.get(3).dsnhanvien_loai.add(dsNhanVien.get(13));

        dsLoaiNhanVien.get(4).dsnhanvien_loai.add(dsNhanVien.get(3));
        dsLoaiNhanVien.get(4).dsnhanvien_loai.add(dsNhanVien.get(15));
        dsLoaiNhanVien.get(4).dsnhanvien_loai.add(dsNhanVien.get(16));
        dsLoaiNhanVien.get(4).dsnhanvien_loai.add(dsNhanVien.get(17));

        //mã quản lý 0 - 2 - 4 - 6 - 3
        dsLoaiNhanVien.get(0).quanLy = new NhanVien(dsNhanVien.get(0));
        dsLoaiNhanVien.get(0).maQuanLy = dsNhanVien.get(0).maNV;

        dsLoaiNhanVien.get(1).quanLy = new NhanVien(dsNhanVien.get(2));
        dsLoaiNhanVien.get(1).maQuanLy = dsNhanVien.get(2).maNV;

        dsLoaiNhanVien.get(2).quanLy = new NhanVien(dsNhanVien.get(4));
        dsLoaiNhanVien.get(2).maQuanLy = dsNhanVien.get(4).maNV;

        dsLoaiNhanVien.get(3).quanLy = new NhanVien(dsNhanVien.get(6));
        dsLoaiNhanVien.get(3).maQuanLy = dsNhanVien.get(6).maNV;

        dsLoaiNhanVien.get(4).quanLy = new NhanVien(dsNhanVien.get(3));
        dsLoaiNhanVien.get(4).maQuanLy = dsNhanVien.get(3).maNV;

    }
    public static void TaoDachSachToa()
    {
        dsToa.add(new Toa('A', 300, 45, new ArrayList<Phong>(), new ArrayList<NhanVien>()));
        dsToa.add(new Toa('B', 330, 50, new ArrayList<Phong>(), new ArrayList<NhanVien>()));
        dsToa.add(new Toa('C', 300, 45, new ArrayList<Phong>(), new ArrayList<NhanVien>()));
        dsToa.add(new Toa('D', 330, 50, new ArrayList<Phong>(), new ArrayList<NhanVien>()));
    }
    public static void TaoDanhSachLoaiPhong()
    {
        dsLoaiPhong.add(new LoaiPhong("PML04", "Phòng máy lạnh 4 người", 4000000, new ArrayList<Phong>()));
        dsLoaiPhong.add(new LoaiPhong("PML06", "Phòng máy lạnh 6 người", 5500000, new ArrayList<Phong>()));
        dsLoaiPhong.add(new LoaiPhong("PML08", "Phòng máy lạnh 8 người", 7500000, new ArrayList<Phong>()));
        dsLoaiPhong.add(new LoaiPhong("PQ04", "Phòng quạt 4 người", 2500000, new ArrayList<Phong>()));
        dsLoaiPhong.add(new LoaiPhong("PQ06", "Phòng quạt 6 người", 3500000, new ArrayList<Phong>()));
        dsLoaiPhong.add(new LoaiPhong("PQ08", "Phòng quạt 8 người", 4500000, new ArrayList<Phong>()));
    }

    public static void TaoDanhSachPhong()
    {
        dsPhong.add(new Phong("P01", dsToa.get(0).maToa, dsLoaiPhong.get(1).maLoaiPhong, true, dsToa.get(0), dsLoaiPhong.get(1), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P02", dsToa.get(0).maToa, dsLoaiPhong.get(1).maLoaiPhong, true, dsToa.get(0), dsLoaiPhong.get(1), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P03", dsToa.get(1).maToa, dsLoaiPhong.get(3).maLoaiPhong, true, dsToa.get(1), dsLoaiPhong.get(3), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P04", dsToa.get(1).maToa, dsLoaiPhong.get(3).maLoaiPhong, true, dsToa.get(1), dsLoaiPhong.get(3), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P05", dsToa.get(2).maToa, dsLoaiPhong.get(2).maLoaiPhong, true, dsToa.get(2), dsLoaiPhong.get(2), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P06", dsToa.get(2).maToa, dsLoaiPhong.get(2).maLoaiPhong, true, dsToa.get(2), dsLoaiPhong.get(2), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P07", dsToa.get(3).maToa, dsLoaiPhong.get(1).maLoaiPhong, true, dsToa.get(3), dsLoaiPhong.get(1), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P08", dsToa.get(3).maToa, dsLoaiPhong.get(3).maLoaiPhong, false, dsToa.get(3), dsLoaiPhong.get(3), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P09", dsToa.get(1).maToa, dsLoaiPhong.get(0).maLoaiPhong, false, dsToa.get(1), dsLoaiPhong.get(0), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P10", dsToa.get(3).maToa, dsLoaiPhong.get(0).maLoaiPhong, false, dsToa.get(3), dsLoaiPhong.get(0), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P11", dsToa.get(0).maToa, dsLoaiPhong.get(4).maLoaiPhong, true, dsToa.get(0), dsLoaiPhong.get(4), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P12", dsToa.get(0).maToa, dsLoaiPhong.get(5).maLoaiPhong, true, dsToa.get(0), dsLoaiPhong.get(5), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P13", dsToa.get(1).maToa, dsLoaiPhong.get(4).maLoaiPhong, true, dsToa.get(1), dsLoaiPhong.get(4), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P14", dsToa.get(1).maToa, dsLoaiPhong.get(5).maLoaiPhong, false, dsToa.get(1), dsLoaiPhong.get(5), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P15", dsToa.get(2).maToa, dsLoaiPhong.get(4).maLoaiPhong, true, dsToa.get(2), dsLoaiPhong.get(4), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P16", dsToa.get(2).maToa, dsLoaiPhong.get(5).maLoaiPhong, true, dsToa.get(2), dsLoaiPhong.get(5), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P17", dsToa.get(3).maToa, dsLoaiPhong.get(1).maLoaiPhong, false, dsToa.get(3), dsLoaiPhong.get(1), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P18", dsToa.get(3).maToa, dsLoaiPhong.get(1).maLoaiPhong, false, dsToa.get(3), dsLoaiPhong.get(1), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P19", dsToa.get(1).maToa, dsLoaiPhong.get(2).maLoaiPhong, false, dsToa.get(1), dsLoaiPhong.get(2), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P20", dsToa.get(3).maToa, dsLoaiPhong.get(2).maLoaiPhong, false, dsToa.get(3), dsLoaiPhong.get(2), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P21", dsToa.get(0).maToa, dsLoaiPhong.get(3).maLoaiPhong, false, dsToa.get(0), dsLoaiPhong.get(3), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P22", dsToa.get(0).maToa, dsLoaiPhong.get(3).maLoaiPhong, false, dsToa.get(0), dsLoaiPhong.get(3), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P23", dsToa.get(1).maToa, dsLoaiPhong.get(4).maLoaiPhong, false, dsToa.get(1), dsLoaiPhong.get(4), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P24", dsToa.get(1).maToa, dsLoaiPhong.get(4).maLoaiPhong, false, dsToa.get(1), dsLoaiPhong.get(4), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P25", dsToa.get(2).maToa, dsLoaiPhong.get(5).maLoaiPhong, false, dsToa.get(2), dsLoaiPhong.get(5), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P26", dsToa.get(2).maToa, dsLoaiPhong.get(5).maLoaiPhong, false, dsToa.get(2), dsLoaiPhong.get(5), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P27", dsToa.get(3).maToa, dsLoaiPhong.get(0).maLoaiPhong, false, dsToa.get(3), dsLoaiPhong.get(0), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P28", dsToa.get(3).maToa, dsLoaiPhong.get(0).maLoaiPhong, false, dsToa.get(3), dsLoaiPhong.get(0), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P29", dsToa.get(1).maToa, dsLoaiPhong.get(0).maLoaiPhong, false, dsToa.get(1), dsLoaiPhong.get(0), new ArrayList<SinhVien>()));
        dsPhong.add(new Phong("P30", dsToa.get(3).maToa, dsLoaiPhong.get(0).maLoaiPhong, false, dsToa.get(3), dsLoaiPhong.get(0), new ArrayList<SinhVien>()));


        dsLoaiPhong.get(0).dsphong_loai.add(dsPhong.get(8));
        dsLoaiPhong.get(0).dsphong_loai.add(dsPhong.get(9));
        dsLoaiPhong.get(0).dsphong_loai.add(dsPhong.get(26));
        dsLoaiPhong.get(0).dsphong_loai.add(dsPhong.get(27));
        dsLoaiPhong.get(0).dsphong_loai.add(dsPhong.get(28));
        dsLoaiPhong.get(0).dsphong_loai.add(dsPhong.get(29));

        dsLoaiPhong.get(1).dsphong_loai.add(dsPhong.get(0));
        dsLoaiPhong.get(1).dsphong_loai.add(dsPhong.get(1));
        dsLoaiPhong.get(1).dsphong_loai.add(dsPhong.get(6));
        dsLoaiPhong.get(1).dsphong_loai.add(dsPhong.get(16));
        dsLoaiPhong.get(1).dsphong_loai.add(dsPhong.get(17));

        dsLoaiPhong.get(2).dsphong_loai.add(dsPhong.get(4));
        dsLoaiPhong.get(2).dsphong_loai.add(dsPhong.get(5));
        dsLoaiPhong.get(2).dsphong_loai.add(dsPhong.get(18));
        dsLoaiPhong.get(2).dsphong_loai.add(dsPhong.get(19));

        dsLoaiPhong.get(3).dsphong_loai.add(dsPhong.get(2));
        dsLoaiPhong.get(3).dsphong_loai.add(dsPhong.get(3));
        dsLoaiPhong.get(3).dsphong_loai.add(dsPhong.get(7));
        dsLoaiPhong.get(3).dsphong_loai.add(dsPhong.get(20));
        dsLoaiPhong.get(3).dsphong_loai.add(dsPhong.get(21));

        dsLoaiPhong.get(4).dsphong_loai.add(dsPhong.get(10));
        dsLoaiPhong.get(4).dsphong_loai.add(dsPhong.get(12));
        dsLoaiPhong.get(4).dsphong_loai.add(dsPhong.get(22));
        dsLoaiPhong.get(4).dsphong_loai.add(dsPhong.get(23));
        dsLoaiPhong.get(4).dsphong_loai.add(dsPhong.get(14));

        dsLoaiPhong.get(5).dsphong_loai.add(dsPhong.get(11));
        dsLoaiPhong.get(5).dsphong_loai.add(dsPhong.get(13));
        dsLoaiPhong.get(5).dsphong_loai.add(dsPhong.get(15));
        dsLoaiPhong.get(5).dsphong_loai.add(dsPhong.get(24));
        dsLoaiPhong.get(5).dsphong_loai.add(dsPhong.get(25));

        dsToa.get(0).dsphong_toa.add(dsPhong.get(0));
        dsToa.get(0).dsphong_toa.add(dsPhong.get(1));
        dsToa.get(0).dsphong_toa.add(dsPhong.get(10));
        dsToa.get(0).dsphong_toa.add(dsPhong.get(11));
        dsToa.get(0).dsphong_toa.add(dsPhong.get(20));
        dsToa.get(0).dsphong_toa.add(dsPhong.get(21));

        dsToa.get(1).dsphong_toa.add(dsPhong.get(2));
        dsToa.get(1).dsphong_toa.add(dsPhong.get(3));
        dsToa.get(1).dsphong_toa.add(dsPhong.get(8));
        dsToa.get(1).dsphong_toa.add(dsPhong.get(12));
        dsToa.get(1).dsphong_toa.add(dsPhong.get(13));
        dsToa.get(1).dsphong_toa.add(dsPhong.get(18));
        dsToa.get(1).dsphong_toa.add(dsPhong.get(22));
        dsToa.get(1).dsphong_toa.add(dsPhong.get(23));
        dsToa.get(1).dsphong_toa.add(dsPhong.get(28));

        dsToa.get(2).dsphong_toa.add(dsPhong.get(4));
        dsToa.get(2).dsphong_toa.add(dsPhong.get(5));
        dsToa.get(2).dsphong_toa.add(dsPhong.get(14));
        dsToa.get(2).dsphong_toa.add(dsPhong.get(15));
        dsToa.get(2).dsphong_toa.add(dsPhong.get(24));
        dsToa.get(2).dsphong_toa.add(dsPhong.get(25));

        dsToa.get(3).dsphong_toa.add(dsPhong.get(6));
        dsToa.get(3).dsphong_toa.add(dsPhong.get(7));
        dsToa.get(3).dsphong_toa.add(dsPhong.get(9));
        dsToa.get(3).dsphong_toa.add(dsPhong.get(16));
        dsToa.get(3).dsphong_toa.add(dsPhong.get(17));
        dsToa.get(3).dsphong_toa.add(dsPhong.get(19));
        dsToa.get(3).dsphong_toa.add(dsPhong.get(26));
        dsToa.get(3).dsphong_toa.add(dsPhong.get(27));
        dsToa.get(3).dsphong_toa.add(dsPhong.get(29));
    }
    public static void TaoDanhSachSinhVien()
    {
        dsSinhVien.add(new SinhVien("SV01", "Văn Minh Anh", true, "0335573464", dsPhong.get(0)));
        dsSinhVien.add(new SinhVien("SV02", "Kha Sỹ Phú", true, "0955546106", dsPhong.get(0)));
        dsSinhVien.add(new SinhVien("SV03", "Phan Phúc Lâm", true, "0875516075", dsPhong.get(1)));
        dsSinhVien.add(new SinhVien("SV04", "Trần Trung Thế", true, "0335555459", dsPhong.get(1)));
        dsSinhVien.add(new SinhVien("SV05", "Cao Đăng Ngọc Quý", true, "0995578740", dsPhong.get(1)));
        dsSinhVien.add(new SinhVien("SV06", "Phạm Vĩnh Long", true, "0335558622", dsPhong.get(5)));
        dsSinhVien.add(new SinhVien("SV07", "Tạ Bạch Cúc", false, "0935505935", dsPhong.get(2)));
        dsSinhVien.add(new SinhVien("SV08", "Mai Kiều Hoa", false, "0855533475", dsPhong.get(2)));
        dsSinhVien.add(new SinhVien("SV09", "Mai Phương Thúy", false, "0955515045", dsPhong.get(3)));
        dsSinhVien.add(new SinhVien("SV10", "Hoàng Phương Thảo", false, "0895501461", dsPhong.get(3)));
        dsSinhVien.add(new SinhVien("SV11", "Trần Quang Bửu", true, "09732588394", dsPhong.get(4)));
        dsSinhVien.add(new SinhVien("SV12", "Nguyễn Quang Dũng", true, "03312598591", dsPhong.get(4)));
        dsSinhVien.add(new SinhVien("SV13", "Nguyễn Thiện Giang", true, "09331529049", dsPhong.get(5)));
        dsSinhVien.add(new SinhVien("SV14", "Nguyễn Trọng Khánh", true, "09556752852", dsPhong.get(5)));
        dsSinhVien.add(new SinhVien("SV15", "Phan Bảo Long", true, "03758710360", dsPhong.get(6)));
        dsSinhVien.add(new SinhVien("SV16", "Cao Khắc Minh", true, "03512548013", dsPhong.get(6)));
        dsSinhVien.add(new SinhVien("SV17", "Đoàn Kiên Trung", true, "09655516844", dsPhong.get(6)));
        dsSinhVien.add(new SinhVien("SV18", "Huỳnh Huy Cường", true, "03578507626", dsPhong.get(10)));
        dsSinhVien.add(new SinhVien("SV19", "Danh Hoàng Giang", true, "098559527928", dsPhong.get(10)));
        dsSinhVien.add(new SinhVien("SV20", "Đỗ Mỹ Loan", false, "03515538943", dsPhong.get(11)));
        dsSinhVien.add(new SinhVien("SV21", "Nguyễn Phương Lan", false, "09959743180", dsPhong.get(11)));
        dsSinhVien.add(new SinhVien("SV22", "Trịnh Thúy Anh", false, "03565533549", dsPhong.get(11)));
        dsSinhVien.add(new SinhVien("SV23", "Lương Bạch Loan", false, "09351210183", dsPhong.get(12)));
        dsSinhVien.add(new SinhVien("SV24", "Nghiêm Diệu Hà", false, "03364557138", dsPhong.get(12)));
        dsSinhVien.add(new SinhVien("SV25", "Nguyễn Hải Châu", false, "0333129573", dsPhong.get(12)));
        dsSinhVien.add(new SinhVien("SV26", "Vũ Bạch Yến", false, "0335979171", dsPhong.get(14)));
        dsSinhVien.add(new SinhVien("SV27", "Nguyễn Bích Thủy", false, "09915542642", dsPhong.get(14)));
        dsSinhVien.add(new SinhVien("SV28", "Việt Mỹ Kiều", false, "09532563250", dsPhong.get(15)));
        dsSinhVien.add(new SinhVien("SV29", "Nguyễn Linh Sương Sương", false, "09857975293", dsPhong.get(15)));
        dsSinhVien.add(new SinhVien("SV30", "Vũ Bích Vân", false, "03368595027", dsPhong.get(15)));

        dsPhong.get(0).dssv_phong.add(dsSinhVien.get(0));
        dsPhong.get(0).dssv_phong.add(dsSinhVien.get(1));

        dsPhong.get(1).dssv_phong.add(dsSinhVien.get(2));
        dsPhong.get(1).dssv_phong.add(dsSinhVien.get(3));
        dsPhong.get(1).dssv_phong.add(dsSinhVien.get(4));

        dsPhong.get(2).dssv_phong.add(dsSinhVien.get(6));
        dsPhong.get(2).dssv_phong.add(dsSinhVien.get(7));

        dsPhong.get(3).dssv_phong.add(dsSinhVien.get(8));
        dsPhong.get(3).dssv_phong.add(dsSinhVien.get(9));

        dsPhong.get(4).dssv_phong.add(dsSinhVien.get(10));
        dsPhong.get(4).dssv_phong.add(dsSinhVien.get(11));

        dsPhong.get(5).dssv_phong.add(dsSinhVien.get(5));
        dsPhong.get(5).dssv_phong.add(dsSinhVien.get(12));
        dsPhong.get(5).dssv_phong.add(dsSinhVien.get(13));

        dsPhong.get(6).dssv_phong.add(dsSinhVien.get(14));
        dsPhong.get(6).dssv_phong.add(dsSinhVien.get(15));
        dsPhong.get(6).dssv_phong.add(dsSinhVien.get(16));

        dsPhong.get(10).dssv_phong.add(dsSinhVien.get(17));
        dsPhong.get(10).dssv_phong.add(dsSinhVien.get(18));

        dsPhong.get(11).dssv_phong.add(dsSinhVien.get(19));
        dsPhong.get(11).dssv_phong.add(dsSinhVien.get(20));
        dsPhong.get(11).dssv_phong.add(dsSinhVien.get(21));

        dsPhong.get(12).dssv_phong.add(dsSinhVien.get(22));
        dsPhong.get(12).dssv_phong.add(dsSinhVien.get(23));
        dsPhong.get(12).dssv_phong.add(dsSinhVien.get(24));

        dsPhong.get(14).dssv_phong.add(dsSinhVien.get(26));
        dsPhong.get(14).dssv_phong.add(dsSinhVien.get(25));

        dsPhong.get(15).dssv_phong.add(dsSinhVien.get(27));
        dsPhong.get(15).dssv_phong.add(dsSinhVien.get(28));
        dsPhong.get(15).dssv_phong.add(dsSinhVien.get(29));
    }

    //1. Cho biết thông tin quản lý của nhân viên
    public static void Lambda1(String ma)
    {
        System.out.println("Lambda1");

        NhanVien nv = dsNhanVien
                .stream()
                .filter(t->t.maNV == ma)
                .findFirst()
                .get();

        System.out.println("Mã nhân viên: " + nv.loaiNhanVien.maQuanLy + " Họ tên: "
                + nv.loaiNhanVien.quanLy.tenNhanVien + " đang quản lí loại nhân viên có mã là "
                + nv.loaiNhanVien.maLoaiNV);
        System.out.println();
    }

    //2. Cho biết số lượng và danh sách các phòng chưa được thuê của tòa ...
    public static void Lambda2(char ma)
    {
        System.out.println("Lambda2");
        List<Phong> phongs = dsPhong
                .stream()
                .filter(t->t.maToa == ma && t.trangThai == false)
                .collect(Collectors.toList());
        long soLuong = phongs.stream().count();
        System.out.println("Số lượng phòng chưa được thuê của tòa " + ma + " là: " + soLuong);
        for (Phong p : phongs)
            System.out.println(p.maPhong + " - " + p.loaiPhong.tenLoaiPhong);
        System.out.println();
    }

    //3. Liệt kê thông tin SV ở 1 phòng
    public static void Lambda3(String maph)
    {
        System.out.println("Lambda3");
        Map<Phong, List<SinhVien>> danhsach=  dsSinhVien.stream()
                .filter(t -> t.phong.maPhong == maph)
                .collect(Collectors
                        .groupingBy(SinhVien::getPhong,Collectors.toList()));

        for (Map.Entry<Phong, List<SinhVien>> entry : danhsach.entrySet()) {
            System.out.println("Mã phòng: " + entry.getKey().maPhong);
            for (SinhVien i:entry.getValue()) {
                System.out.println("Mã SV: " + i.maSV + " - Tên SV: " + i.tenSV + " - SĐT: " + i.soDienThoai);
            }
        }
        System.out.println();
    }

    //4. Cho biết số lượng phòng máy lạnh đang được thuê ở tòa ...
    public static void Lambda4(char t)
    {
        System.out.println("Lambda4");
        List<Phong> phongMayLanhs = dsPhong
                .stream()
                .filter(p->p.loaiPhong.tenLoaiPhong.startsWith("Phòng máy lạnh") && p.maToa == t)
                .collect(Collectors.toList());
        long soLuong = phongMayLanhs.stream().count();
        System.out.println("Số lượng máy lạnh được thuê ở tòa " + t + " là: " + soLuong);
        for (Phong p : phongMayLanhs)
            System.out.println("Phòng: " + p.maPhong);
        System.out.println();
    }

    //5. Cho biết thông tin những nhân viên giữ chức vụ ... đang làm việc ở tòa ...
    public static void Lambda5(String congViec, char t)
    {
        System.out.println("Lambda5");
        //Vietnamese dong formatter
        Locale vn = new Locale("vi", "VN");
        NumberFormat vndFormat = NumberFormat.getCurrencyInstance(vn);

        List<NhanVien> danhSachNhanVien = dsNhanVien
                .stream()
                .filter(nv->nv.loaiNhanVien.chucVu.contains(congViec) && nv.maToa == t)
                .collect(Collectors.toList());
        System.out.println("Danh sách thông tin các nhân viên giữ chức vụ " + congViec +
                " đang làm việc ở tòa " + t + " là: ");
        for(NhanVien nv : danhSachNhanVien)
            System.out.println("Mã nhân viên: " + nv.maNV +" - Tên nhân viên: " +
                    nv.tenNhanVien + " - Lương: " + vndFormat.format(nv.luong));
        System.out.println();
    }

    public static void main(String[] args)
    {
        TaoDanhSachLoaiPhong();
        TaoDachSachToa();
        TaoDanhSachPhong();
        TaoDanhSachTrangBi();
        TaoDanhSachThietBi();
        TaoDanhSachLoaiNhanVien();
        TaoDanhSachNhanVien();
        TaoDanhSachSinhVien();
        TaoDanhSachHopDong();
        TaoDanhSachChiTietHopDong();
        TaoDanhSachDichVu();
        TaoDanhSachChiTietHoaDonDichVu();

        Lambda1("NV05");
        Lambda2('D');
        Lambda3("P16");
        Lambda4('C');
        Lambda5("Đầu bếp", 'B');


    }


}
