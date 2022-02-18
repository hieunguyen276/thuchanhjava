import java.util.Scanner;
public class App35 {
    public static void main(String[] args) throws Exception {
        //Khai báo biến
        float a,b;
        //Thông báo cho người dùng nhập hệ số
        System.out.println("Nhap so a bat ky: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        System.out.println("Nhap so b bat ky: ");
        b = sc.nextFloat();
        if(a>b){
           System.out.println("So mho nhat la a : "+b);
        }else{
            System.out.println("So nho nhat la b: "+a);
        }
    }
}