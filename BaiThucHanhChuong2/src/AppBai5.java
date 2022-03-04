import java.util.Scanner;

public class AppBai5 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int tong=0;
        while(tong<=100){
            System.out.print("Moi ban nhap : ");
            int n = sc.nextInt();
            tong+=n;
        }
        System.out.print("Tong cac so vua nhap = " +tong);
        sc.close();
    }
}
