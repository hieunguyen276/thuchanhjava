import java.util.Scanner;
public class App2 {
    public static void main(String[] args) throws Exception {
        float a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap canh a: ");
        a = sc.nextFloat();
        System.out.println("Moi nhap canh b: ");
        b = sc.nextFloat();
        System.out.println("Moi nhap canh c: ");
        c = sc.nextFloat();
        if(a+b>c && a+c>b && b+c>a){
            if(a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b){
                System.out.println("Day la tam giac vuong");
                }else if(a == b&& b == c){
                    System.out.println("Day la tam giac deu");
                }else if(a==b || a==c|| b==c){
                    System.out.println("Day la tam giac can");
                }else if(a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b && a==b || a==c|| b==c ){
                    System.out.println("Day la tam giac vuong can");
                }else if(a*a > b*b+c*c || b*b > a*a+c*c || c*c > a*a+b*b){
                    System.out.println("Day la tam giac thuong ");
                }              
        }else{
            System.out.println("3 canh nhap vao khong phai la 1 tam giac");
            }
    }
}
            
        

