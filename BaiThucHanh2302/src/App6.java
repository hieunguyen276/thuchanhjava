import java.util.Scanner;
public class App6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
            System.out.println("Moi nhap so tu ban phim!");
            int n = sc.nextInt();
            for(int i=1;i<n;i++){
                if(SHT(i)){
                    System.out.println(""+i);
                }
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