package Opject;

public class Employee extends Person {
    protected String chucVu;
    protected long luong;

    public String getChucvu(){
        return chucVu;
    }
    public long getLuong(){
        return luong;
    }
    public void setChucVu(String chucVu){
        this.chucVu = chucVu;
    }
    public void setLuong(long luong){
        this.luong = luong;
    }
    @Override
    public String phuongTienDiChuyen(){
        return " Xe may ";
    }
    public void xuatThongTin(){
        System.out.println("Ten : " + super.ten);
        System.out.println("Loai nhan vien : " + this.chucVu);
    }
}
