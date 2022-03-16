package TinhToan;

import java.util.Scanner;

public class HinhChuNhat {
    //Các thuộc tính
    
    float chieuDai;
    float chieuRong;
    float cv;
    float dt;
    //Các phương thức
    public void nhapChieuDai(){
        System.out.print("Hay nhap chieu dai hinh chu nhat: ");
        Scanner sc= new Scanner(System.in);
        chieuDai = sc.nextFloat();
    }
    public void nhapChieuRong(){
        System.out.print("Hay nhap chieu rong hinh chu nhat: ");
        Scanner sc= new Scanner(System.in);
        chieuRong = sc.nextFloat();
    }
    public void tinhChuVi(){
        cv = 2 * (chieuDai + chieuRong);
    }
    public void tinhDienTich(){
        dt = chieuDai * chieuRong;
    }
    public void inChuVi(){
        System.out.print("Chu vi hinh tron: " + cv);
    }
    public void inDienTich(){
        System.out.print("\nDien tich hinh tron: " +dt);
    }
}
