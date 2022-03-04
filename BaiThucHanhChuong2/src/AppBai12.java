import java.util.Scanner;

public class AppBai12 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int x,y;
        do{
            System.out.print("Moi nhap so dong cho mang : ");
            x = sc.nextInt();
            System.out.print("Moi nhap so cot cho mang : ");
            y = sc.nextInt();
        }while(x<0||y<0);
        int a[][] = new int [x][y];    
        for(int i=0;i<x;i++){
            for(int j = 0; j<y; j ++){
                System.out.print("Moi nhap phan tu " +i+ " " +j+ " = ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mang vua nhap la: ");
        for(int i=0;i<x;i++){
            for(int j = 0; j<y; j ++){
                System.out.print("\t" +a[i][j]+ " ");
            }
            System.out.println();
        }
        int max=a[0][0];
        for(int i=0;i<x;i++){
            for(int j = 0; j<y; j ++){
                if(max<a[i][j]){
                    max=a[i][j];
                }
            }
        }
        System.out.print("Phan tu lon nhat trong mang la : " +max);
        sc.close();
    }
}