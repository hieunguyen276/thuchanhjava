package Slide79.model;

/**
 * NhanVienPartTime chinh la nhan vien thoi vu
 */
public class NhanVienPartTime extends NhanVien {
    private int gioLamviec; //Tong so gio lam viec cua nhan vien

    public NhanVienPartTime(String ten, int gioLamviec) {
        this.ten = ten;
        this.gioLamviec = gioLamviec;
    }

    @Override
    public String loaiNhanVien() {
        return "Nhan vien thoi vu";
    }

    public void tinhLuong() {
        luong = Slide79.util.Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamviec;
    }
}
