import java.util.Scanner;
public class App30 {
    public static void main(String[] args) throws Exception {
        //Khai báo biến
        int n, soDu, s=0;
        //Thông báo cho người dùng nhập hệ số
        System.out.println("Nhap so n bat ky: ");
        //Đọc giá trị người dùng nhập vào từ bàn phím => gán vào biến
        //Khai báo đối tượng Scanner để đọc dữ liệu người dùng nhập vào
        Scanner sc = new Scanner(System.in);
        //Gán giá trị người dùng nhập vào từ bàn phím cho biến số n
        n = sc.nextInt();
        while(n>0){
            soDu = n%10;
            n = n/10;
            s+=soDu;
        }
        System.out.println("Tong cac chu so cua n = " +s);
    }
}