import java.util.Scanner;
public class App47 {
    public static void main(String[] args) throws Exception {
        int n,tong=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap vao so nguyen bat ki: "); 
            n = sc.nextInt();
            tong+= n;
        }while(tong<100);
            System.out.println("Tong cac so vua nhap la: " + tong);
        }
    }
