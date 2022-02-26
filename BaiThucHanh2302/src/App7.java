import java.util.Scanner;
public class App7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        float max=0, n=1;
        while(n!=0){
            System.out.println("Moi nhap so! ");     
            n = sc.nextFloat();
            if(max<n){
            max=n;
        }
    }
    
        System.out.println(max+" la so lon nhat trong day so ");   
        }
}