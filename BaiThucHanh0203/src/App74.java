import java.util.Scanner;

public class App74 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);     
        int n,sum=0;  
        do{
            System.out.println("Moi ban nhap so luong phan tu cua mang!");
            n = sc.nextInt();
        }while(n<=0);
        //  Khởi tạo và cấp phát bộ nhớ cho mảng
        int a[] = new int [n];
            System.out.println("Moi nhap cac phan tu :");
            for(int i =0 ; i < n; i++){
                System.out.print("Nhap phan tu thu : " + i + " : ");
                a[i] = sc.nextInt();
            }
        //Hiển thị mảng vừa nhập
        System.out.println("Mang vua nhap la : ");
            for( int i=0; i<n; i++){
                System.out.println(a[i] + "\t");
            }
        //Tính tổng các phần tử chẵn trong mảng
        for( int i=0; i<n; i++){
            if(i%2==0){
                sum+=a[i];
            }
        }
        System.out.println("Tong cac phan tu chan trong mang la: " +sum);
        sc.close();
    }   
}