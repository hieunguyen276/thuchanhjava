import java.util.Scanner;
public class App9 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n,sdn;
        n = sc.nextInt();
        boolean ok = true;
        while(n>0){
            sdn = n % 10;
            if(ok == true){
                if(sdn !=0){
                    System.out.print(sdn);
                    ok = false;
                }
            }else{
                System.out.print(sdn);
            }
            n = n/10;
        }
    }
}