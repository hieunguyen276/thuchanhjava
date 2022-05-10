import java.util.ArrayList;

public class Slide16 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrListString = new ArrayList<>();

        arrListString.add("JAVA");
        arrListString.add("PHP");
        arrListString.add("C#");
        arrListString.add("C++");

        System.out.println("Cac phan tu co trong arrayListString la: ");
        for (int i = 0; i < arrListString.size(); i++) {
            System.out.print(arrListString.get(i) + "\t");
        }

        arrListString.set(1, "PYTHON");
        System.out.println("Cac phan tu co trong arrayListString sau khi thay doi la : ");
        for (int i = 0; i < arrListString.size(); i++) {
            System.out.print(arrListString.get(i) + "\t");
        }

        arrListString.remove(2);
        System.out.println("Cac phan tu co trong arrayListString sau khi thay doi la : ");
        for (int i = 0; i < arrListString.size(); i++) {
            System.out.print(arrListString.get(i) + "\t");
        }

    }
}
