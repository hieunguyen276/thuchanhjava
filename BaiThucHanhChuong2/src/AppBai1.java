import java.util.Scanner;

public class AppBai1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        float a,b,tong=0,hieu=0,tich=0,thuong=0,chiadu=0;
        System.out.print("Moi ban nhap so a: ");
        a = sc.nextFloat();
        System.out.print("Moi ban nhap so b: ");
        b = sc.nextFloat();
        tong=a+b;
        hieu=a-b;
        tich=a*b;
        thuong=a/b;
        chiadu=a%b; 
        System.out.println(+a+ " + " +b+ " = "+tong);
        System.out.println(+a+ " - " +b+ " = "+hieu);
        System.out.println(+a+ " * " +b+ " = "+tich);
        System.out.println(+a+ " / " +b+ " = "+thuong);
        System.out.println(+a+ " chia du " +b+ " = "+chiadu);
        if(a>b){
            System.out.println(+a+ " > " +b);
        }else if(a==b){
            System.out.println(+a+ " = " +b);
        }else if(a<b){
            System.out.println(+a+ " < " +b);
        }  
        sc.close();    
    }
}
