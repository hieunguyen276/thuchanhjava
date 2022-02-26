import java.util.Scanner;
public class App4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so tu ban phim : ");
        int n = sc.nextInt();
        if(n>=2){
            System.out.println(2);
        }for (int i=3; i<n; i+=2){
            if(SNT(i)){
                System.out.println(""+i);
            }
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