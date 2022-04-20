package Opject;

public class Person {
    protected String ten;
    protected byte tuoi;
    protected String gioiTinh;

    public String getTen(){
        return ten;
    }
    public byte getTuoi(){
        return tuoi;
    }
    public String getGioiTinh(){
        return gioiTinh;
    }
    public void setTen(String ten){
        this.ten = ten;
    }
    public String phuongTienDiChuyen(){
        //Lop con Override
        return "";
    }

    public void diLam(){
        System.out.println("Con nguoi phai lam viec");
    }
}
