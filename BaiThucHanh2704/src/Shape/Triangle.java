package Shape;

import java.util.Scanner;

public class Triangle extends Point {
    double x1, x2, x3, y1, y2, y3, a, b, c;

    public void nhapBadiem() {
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

        a = Math.sqrt(Math.pow(x1 - x2, 2)) + Math.sqrt(Math.pow(y1 - y2, 2));
        b = Math.sqrt(Math.pow(x2 - x3, 2)) + Math.sqrt(Math.pow(y2 - y3, 2));
        c = Math.sqrt(Math.pow(x1 - x3, 2)) + Math.sqrt(Math.pow(y1 - y3, 2));
    }

    public void kiemTra() {
        if ((a + b == c) || (b + c == a) || (a + c == b))
            System.out.println("Day la 3 diem thang hang");
        else if (a == b && b == c && c == a)
            System.out.println("Day la tam giac deu");
        else if ((a == b || b == c || c == a)
                && ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)))
            System.out.println("Day la tam giac vuong can");
        else if (a == b || b == c || c == a)
            System.out.println("Day la tam giac can");
        else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b))
            System.out.println("Day la tam giac vuong");
        else
            System.out.println("Day la tam giac thuong");
        System.out.println("Diem A: " + "(" + x1 + "," + y1 + ")" + "\n" + "Diem B: " + "(" + x2 + "," + y2 + ")" + "\n"
                + "Diem C: " + "(" + x3 + "," + y3 + ")");
    }

    public static void main(String[] args) throws Exception {
        Triangle tamgiac1 = new Triangle();
        tamgiac1.nhapBadiem();
        tamgiac1.kiemTra();
    }
}
