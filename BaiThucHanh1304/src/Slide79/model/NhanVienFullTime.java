package Slide79.model;

/**
 * NhanVienFullTime chinh la nhan vien thoi vu
 */
public class NhanVienFullTime extends NhanVien {
    private int ngayLamThem = 1; //Tong so gio lam viec cua nhan vien
    private int loaiChucVu;

    public NhanVienFullTime(String ten) {
        this.ten = ten;
    }
    public NhanVienFullTime(String ten, int ngayLamThem) {
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }

    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    public String loaiNhanVien() {
        if(loaiChucVu == 1){
            return "Sep dai ca";
        }else{
            return "Nhan vien chinh thuc";
        }
    }

    public void tinhLuong() {
        if(loaiChucVu == 1 ){
        luong = Slide79.util.Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP * ngayLamThem;
        }else{
            luong = Slide79.util.Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH +  Slide79.util.Configs.LUONG_LAM_THEM_MOI_NGAY * ngayLamThem;
        }
    }
}
