import java.util.Date;
import java.util.Scanner;

public class SinhVien {
    String MaSinhVien;
    String HoTen;
    String DiaChi;
    String NgaySinh;
    Boolean GioiTinh;

    public String nhapMSV(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap MSV : ");
        MaSinhVien = sc.nextLine();
        return MaSinhVien;
    }
    public String nhapHoTen(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap ho va ten : ");
        HoTen = sc.nextLine();
        return HoTen;
    }
    public String nhapDiaChi(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap dia chi : ");
        DiaChi = sc.nextLine();
        return DiaChi;
    }
    public void nhapGioiTinh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap gioi tinh: ");
        GioiTinh = sc.nextBoolean();
    }
    public void nhapNgaySinh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap ngay sinh : ");
        NgaySinh = sc.nextLine();
    }
    public void info(){
        String x;
        System.out.print("\nThong tin sinh vien vua nhap: \n");
        if(GioiTinh == true){
            x = "Nam";
        }else{
            x = "Nu";
        }
        System.out.print("MSV: " + MaSinhVien + "\n" + "Ho va ten: " +HoTen+ "\n" +"Gioi tinh: " +x+ "\n" + "Dia chi: " +DiaChi+ "\n" +"Ngay sinh: " +NgaySinh );
    }
}
