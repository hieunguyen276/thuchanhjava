package Opject;

public class Student extends Person {
    protected String maSV;
    protected String khoa;

    public String getMaSV(){
        return maSV;
    }
    public String getKhoa(){
        return khoa;
    }
    public void setMaSV(String maSV){
        this.maSV = maSV;
    }
    public void setKhoa(String khoa){
        this.khoa = khoa;
    }
    @Override
    public String phuongTienDiChuyen(){
        return " Xe bus ";
    }
    public String hinhThucThi(){
        //Lop con Override
        return "";
    }

}
