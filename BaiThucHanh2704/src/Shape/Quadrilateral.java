package Shape;

import java.util.Scanner;

public class Quadrilateral extends Point {
    double x1, x2, x3, y1, y2, y3, x4, y4, a, b, c, d, e, f;

    public void nhap4Diem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap hoanh do diem 1: ");
        x1 = sc.nextDouble();
        System.out.println("Moi nhap tung do diem 1: ");
        y1 = sc.nextDouble();
        System.out.println("Moi nhap hoanh do diem 2: ");
        x2 = sc.nextDouble();
        System.out.println("Moi nhap tung do diem 2: ");
        y2 = sc.nextDouble();
        System.out.println("Moi nhap hoanh do diem 3: ");
        x3 = sc.nextDouble();
        System.out.println("Moi nhap tung do diem 3: ");
        y3 = sc.nextDouble();
        System.out.println("Moi nhap hoanh do diem 4: ");
        x4 = sc.nextDouble();
        System.out.println("Moi nhap tung do diem 4: ");
        y4 = sc.nextDouble();

        a = Math.sqrt(Math.pow(x1 - x2, 2)) + Math.sqrt(Math.pow(y1 - y2, 2));
        b = Math.sqrt(Math.pow(x2 - x3, 2)) + Math.sqrt(Math.pow(y2 - y3, 2));
        c = Math.sqrt(Math.pow(x3 - x4, 2)) + Math.sqrt(Math.pow(y3 - y4, 2));
        d = Math.sqrt(Math.pow(x1 - x4, 2)) + Math.sqrt(Math.pow(y1 - y4, 2));
        e = Math.sqrt(Math.pow(x1 - x3, 2)) + Math.sqrt(Math.pow(y1 - y3, 2));
        f = Math.sqrt(Math.pow(x2 - x4, 2)) + Math.sqrt(Math.pow(y2 - y4, 2));
    }

    public void kiemTra() {
        if (a + b == e || b + c == f || c + d == e || a + d == f)
            System.out.println("Bon diem khong tao thanh tu giac");
        else {
            if (a == b && b == c && c == d) {
                if ((a * a + b * b - e * e) / (2 * a * b) == 0 || (b * b + c * c - f * f) / (2 * b * c) == 0
                        || (c * c + d * d - e * e) / (2 * c * d) == 0 || (d * d + a * a - f * f) / (2 * d * a) == 0)
                    System.out.println("Day la hinh vuong");
                else
                    System.out.println("Day la hinh thoi");
            } else if (a == c && b == d) {
                if ((a * a + b * b - e * e) / (2 * a * b) == 0 || (b * b + c * c - f * f) / (2 * b * c) == 0
                        || (c * c + d * d - e * e) / (2 * c * d) == 0 || (d * d + a * a - f * f) / (2 * d * a) == 0)
                    System.out.println("Day la hinh chu nhat");
                else
                    System.out.println("Day la hinh binh hanh");
            } else
                System.out.println("Day la tu giac thuong");
        }
    }

    public static void main(String[] args) throws Exception {
        Quadrilateral tugiac = new Quadrilateral();
        tugiac.nhap4Diem();
        tugiac.kiemTra();
    }
}
