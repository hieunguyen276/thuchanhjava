package TinhToan;
import java.util.Scanner;


public class HinhTron {
    //Các thuộc tính
    final float PI = 3.14f;

    float r;
    float cv;
    float dt;
    //Các phương thức
    public void nhapBanKinh(){
        System.out.print("Hay nhap ban kinh hinh tron: ");
        Scanner sc= new Scanner(System.in);
        r = sc.nextFloat();
    }
    public void tinhChuVi(){
        cv = 2 * PI * r;
    }
    public void tinhDienTich(){
        dt = PI * r * r;
    }
    public void inChuVi(){
        System.out.print("Chu vi hinh tron: " + cv);
    }
    public void inDienTich(){
        System.out.print("\nDien tich hinh tron: " +dt);
    }
}