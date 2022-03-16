package main;
import TinhToan.HinhChuNhat;
import TinhToan.HinhTron;

public class App1 {
    public static void main(String[] args) throws Exception {
        HinhTron ht = new HinhTron();
        HinhChuNhat hcn = new HinhChuNhat();

        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();
    
        System.out.print("\n-------------------------------\n");
        
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();;
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();
    }
}
