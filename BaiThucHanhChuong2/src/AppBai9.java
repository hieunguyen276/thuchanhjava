import java.util.Scanner;

public class AppBai9 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String chuoi = new String("");
        int kyTuHoa =0, kyTuThuong=0, so=0;
        System.out.print("Nhap vao mot chuoi bat ky: ");
        chuoi=sc.nextLine();
        for(int i=0;i<chuoi.length();i++){
            //hàm isUppercase() là hàm dùng để kiểm tra ký tự tại vị trí i
            //có phải là ký tự hoa hay k
            //Character là đối tượng thay cho kiểu dữ liệu gốc
            if(Character.isUpperCase(chuoi.charAt(i))){
                kyTuHoa++;
            }
            if(Character.isLowerCase(chuoi.charAt(i))){
                kyTuThuong++;
            }
            if(Character.isDigit(chuoi.charAt(i))){
                so++;
            }
        }
        System.out.println("Chuoi " +chuoi+ " co " +kyTuHoa+ " ky tu hoa , " +kyTuThuong+ " ky tu thuong , " +so+ " so");
        sc.close();
    }
}