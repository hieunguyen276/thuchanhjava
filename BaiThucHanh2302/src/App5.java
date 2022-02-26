import java.util.Scanner;
public class App5 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner (System.in);
        System.out.println("Moi nhap vao mot so !");
        int n = sc.nextInt();
        if(SHT(n)){
            System.out.println(n+" la so hoan thien");
        }else{
            System.out.println(n+" khong phai la so hoan thien");
        }
    }    
        public static boolean SHT(int n){
            int S=0;
            for (int i=1;i<n;i++){
                if(n%i==0){
                    S+=i;
                }
            }if(S==n){
                    return true;
                }else{
                    return false;
                
            }
        }
}