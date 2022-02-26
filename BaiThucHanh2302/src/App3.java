import java.util.Scanner;
public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so tu ban phim : ");
        int n = sc.nextInt();
        if(SNT(n)){
            System.out.println(n+" la so nguyen to ");
        }else{
            System.out.println(n+" khong phai la so nguyen to");
        }
    }
    public static boolean SNT(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}