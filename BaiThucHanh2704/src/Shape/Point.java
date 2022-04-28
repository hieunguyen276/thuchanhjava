package Shape;

import java.util.Scanner;

public class Point {
    private String tenDiem;
    private float hoanhDo;
    private float tungDo;

    public String getTenDiem() {
        return tenDiem;
    }

    public float getHoangDo() {
        return hoanhDo;
    }

    public float getTungDo() {
        return tungDo;
    }

    public void setTenDiem(String tenDiem) {
        this.tenDiem = tenDiem;
    }

    public void setHoanhDo(float hoanhDo) {
        this.hoanhDo = hoanhDo;
    }

    public void setTungDo(float tungDo) {
        this.tungDo = tungDo;
    }

    public void diem(String tenDiem, float hoanhDo, float tungDo) {
        this.tenDiem = tenDiem;
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
    }

    public void nhapDiem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ten diem: ");
        String tenDiem = sc.nextLine();
        setTenDiem(tenDiem);

        System.out.println("Moi nhap hoanh do: ");
        float hoanhDo = sc.nextFloat();
        setHoanhDo(hoanhDo);

        System.out.println("Moi nhap tung do: ");
        float tungDo = sc.nextFloat();
        setTungDo(tungDo);
    }

    public void inDiem() {
        System.out.println("Diem: " + getTenDiem() + "(" + getHoangDo() + "," + getTungDo() + ")");
    }
}
