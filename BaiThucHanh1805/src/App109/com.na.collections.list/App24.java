import java.util.ArrayList;
import java.util.Scanner;

public class App24 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Nhap so phan tu cua ArrayList: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            number = sc.nextInt();
            list.add(number);
        }

        int max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong list = " + max);
    }
}
