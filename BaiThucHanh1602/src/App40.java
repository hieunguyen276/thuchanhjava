import java.util.Scanner;
public class App40 {
    public static void main(String[] args) throws Exception {
        //Khai báo biến
        byte ngay;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so bat ky: ");   
        ngay = sc.nextByte();
        switch (ngay){
            case 2: System.out.println("Hom nay la thu 2");
            break;
            case 3: System.out.println("Hom nay la thu 3");
            break;
            case 4: System.out.println("Hom nay la thu 4");
            break;
            case 5: System.out.println("Hom nay la thu 5");
            break;
            case 6: System.out.println("Hom nay la thu 6");
            break;
            case 7: System.out.println("Hom nay la thu 7");
            break;
            case 8: System.out.println("Hom nay la chu nhat");
            break;
            default: System.out.println("Khong co ngay nao trong tuan");
        }
    }
}