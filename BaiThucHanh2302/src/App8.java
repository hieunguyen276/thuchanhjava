import java.util.Scanner;
public class App8 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int max=0, n=1;
        while(n!=0){
            System.out.println("Moi nhap so! ");     
            n = sc.nextInt();
            if(n%5==0){
                if(max<n){
                    max=n;
            }
        }
        }
        System.out.println(max+" la so lon nhat trong day so chia het cho 5 ");   
    }
}