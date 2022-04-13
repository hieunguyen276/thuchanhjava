package Slide79.main;

import Slide79.model.*;
import Slide79.util.Configs;

public class App79 {
    
    public static void main(String[] args){
        //Cong ty co 3 nhan vien toan thoi gian, trong do co 1 sep, sep khong lam them ngay nao

        NhanVienFullTime sep = new NhanVienFullTime("Tran Van Sep");
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        NhanVienFullTime linh1 = new NhanVienFullTime("Nguyen Van Linh"); //Khong lam them ngay nao
        linh1.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        NhanVienFullTime linh2 = new NhanVienFullTime("Le Thi Linh", 3); //lam them 3 ngay
        linh2.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        //Cong ty dang thue 1 nhan vien thoi vu
        NhanVienPartTime thoiVu = new NhanVienPartTime("Phan Thi Thoi Vu", 240); // Co ay sieng nang lam

        //Tinh luong cho nhan vien
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoiVu.tinhLuong();
        
        //In thong tin nhan vien
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoiVu.xuatThongTin();
    }
}
