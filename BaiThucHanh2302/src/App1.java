import java.util.Scanner;
public class App1 {
    public static void main(String[] args) throws Exception {
        int a,b,UCLN=1,i,min;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Moi nhap so thu nhat : ");
            a = sc.nextInt();
            System.out.println("Moi nhap so thu hai : ");
            b = sc.nextInt(); 
        }while(a<0 || b<0);{
            if(a==0 && b==0){
                System.out.println("Hai so vua nhap khong co UCLN");
            }else if(a==0 && b!=0){
                System.out.println("UCLN la: "+b);
            }else if(a!=0 && b==0){
                System.out.println("UCLN la: "+a);
            }else{
                if(a<b){
                    min=a;
                }else{
                    min=b;
                }
                for(i=1;i<=min;i++){
                    if(a%i==0 && b%i==0){
                        UCLN=i;
                    }           
                }
                System.out.println("UCLN cua 2 so vua nhap la:" +UCLN);
            }
        }        
    }
}