import java.util.Scanner;
public class App10 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n, dem=1;
        System.out.println("Moi ban nhap n!");
        n = sc.nextInt();
        while(n>=10){
            n/=10;
            dem++;
        }
        System.out.println("So vua nhap co tat ca: "+dem+ " chu so");
    }      
}