import java.util.Scanner;

public class PhuongTrinhBacHai {
        Double A,B,C,X1,X2,delta;
        Scanner sc = new Scanner(System.in);
        public void nhapA(){
            System.out.print("Moi nhap he so 1: ");
            A = sc.nextDouble();
        }
        public void nhapB(){
            System.out.print("Moi nhap he so 2: ");
            B = sc.nextDouble();
        }
        public void nhapC(){
            System.out.print("Moi nhap he so 3: ");
            C = sc.nextDouble();
        }
        public void giaiPhuongTrinh(){
        delta = B*B - 4*A*C;
        System.out.println("delta = " + delta);
        if(delta>0){
            System.out.println("Phuong trinh co 2 nghiem \n" + "X1 = " + (X1= (-B + Math.sqrt(delta))/2*A) + "\n"+"X2 = "+ (X2= (-B - Math.sqrt(delta))/2*A));
        }
        else if(delta==0){
                System.out.println("Phuong trinh co nghiem kep :" + ( X1=X2=-B/2*A));
        }else{
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
