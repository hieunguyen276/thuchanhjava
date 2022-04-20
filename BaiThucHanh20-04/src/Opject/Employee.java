package Opject;

public class Employee extends Person {
    protected String chucVu;
    protected long luong;

    public String chucVu(){
        return "";
    }

    public void xuatThongTin(){
        System.out.println("==== Nhan vien: " + super.ten + "====");
        System.out.println("- Loai nhan vien: " + chucVu());
        System.out.println("- Luong: " + luong + "VND");
    }
}
