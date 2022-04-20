package main;
import Opject.*;

public class MainOpject {
    public static void main(String[] args) throws Exception {
        OffineStudent sv1 = new OffineStudent();
        sv1.setTen("Tran Kieu An");
        sv1.setMaSV("11223344");
        sv1.setThietBiHocTap("");

        System.out.println("Sinh vien 1: " +sv1.getTen()+"\n" +"Ma sinh vien: " + sv1.getMaSV() +"\n"+ "Loai thiet bi hoc: " +sv1.getThietBiHocTap());
        sv1.dongHoc();

        Employee ep1 = new Employee();
        ep1.setChucVu("Truong phong tai chinh");
        ep1.setLuong("100tr");
        ep1.setTen("Lenh Ho Xung");
        ep1.xuatThongTin();

        System.out.println("Nhan vien 1: " +ep1.getTen()+"\n" + "Chuc vu: " +ep1.getChucvu() + "\n" + "Luong: " + ep1.getLuong() + "\n" +"Phuong tien di chuyen: " +ep1.phuongTienDiChuyen());
        
    }
}