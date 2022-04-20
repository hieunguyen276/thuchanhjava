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
    }
}