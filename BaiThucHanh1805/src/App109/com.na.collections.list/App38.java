import java.util.LinkedList;

public class App38 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        System.out.println("Vi du su dung phuong thuc addALL ()");
        System.out.println("--------------------------");
        // Thêm các phần tử của list vào listA
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.print("listA:");
        showList(listA);
        System.out.println("\n Vi du su dung phuong thuc retainALL()");
        System.out.println("--------------------------");

        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");
        listA.retainAll(listB);
        System.out.print("listA:");
        showList(listA);

        System.out.println("\n Vi du su dung phuong thuc removeaAll()");
        System.out.println("--------------------------");
        list.removeAll(listB);
        System.out.print("list: ");
        showList(list);

    }

    public static void showList(LinkedList<String> list) {
        for (String obj : list) {
            System.out.print("\t" + obj + ", ");
        }
        System.out.println();
    }
}