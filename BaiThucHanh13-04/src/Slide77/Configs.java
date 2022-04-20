package Slide77;

public class Configs {
    
    //Cau hinh so luong hinh hoc
    public static final int SO_LUONG_HINH_TOI_THIEU = 0;
    public static final int SO_LUONG_HINH_TOI_DA = 5;

    // Cac cau hinh khac
    public static final float PI = 3.14f;
    public static final float INCH_CM = 2.54f; //1 INCH = 2.54cm
    public static final int DON_VI_CM = 1; // Danh dau don vi dang dung don vi bang 1
    public static final int DON_VI_INC = 2; // Danh dau don vi dang dung don vi bang 2
    public static int donVi =DON_VI_CM; //Co cho biet dang dung don vi gi
    
    //Phuong thuc static giup chuyen doi centimet sang inch
    public static float ChuyenCentimetSangInch(float cm) {
        float inch = cm / INCH_CM;
        return inch;
    }

    //Phuong thuc static giup chuyen doi inch sang centimet
    public static float ChuyenInchSangCentimet(float inch) {
        float cm = inch * INCH_CM;
        return cm;
    }
}