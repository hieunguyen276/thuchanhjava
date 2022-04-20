package Slide71;

public class App71 {
    
    public static void main (String[] args) {
        //Khoi tao doi tuong hinh tron tu lop HinhTron
        HinhTron hinhTron = new HinhTron();

        //Set ban kinh hinhTron thong qua phuong thuc setter 
        hinhTron.setBanKinh(10);

        //Cac tinh toan khac
        float chuVi = hinhTron.tinhChuVi();
        float dienTinh = hinhTron.tinhDienTich();
        System.out.println("Chu vi hinh tron: "+ chuVi + "; va dien tich: " +dienTinh);
    }
}
