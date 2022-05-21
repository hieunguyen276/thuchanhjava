import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Scanner;

public class App60 {
    public static void main(String[] args) {
        int n;
        String a;
        Scanner sc = new Scanner(System.in);
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Java");
        linkedHashSet.add("C++");
        linkedHashSet.add("Java");
        linkedHashSet.add("PHP");

        System.out.println("Moi nhap so phan tu ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Moi ban nhap phan tu thu " + i);
            a = sc.nextLine();
            linkedHashSet.add(a);
        }

        for (String str : linkedHashSet) {
            System.out.println(str);
        }
    }
}
