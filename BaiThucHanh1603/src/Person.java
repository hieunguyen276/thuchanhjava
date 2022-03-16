import java.util.Scanner;

public class Person{
    String PersonID, PersonName,Address;
    Boolean Gender ;

    public String nhapID(){
        System.out.print("Moi nhap ID : ");
        Scanner sc = new Scanner(System.in);
        PersonID = sc.nextLine();
        return PersonID;
    }
    public String nhapName(){
        System.out.print("Moi nhap ten : ");
        Scanner sc = new Scanner(System.in);
        PersonName = sc.nextLine(); 
        return PersonName;
    }
    public void nhapGioiTinh(){
        System.out.print("Moi nhap gioi tinh : ");
        Scanner sc = new Scanner(System.in);
        Gender = sc.nextBoolean();
    }
    public String nhapAddress(){
        System.out.print("Moi nhap dia chi : ");
        Scanner sc = new Scanner(System.in);
        Address = sc.nextLine();
        return Address;
    }
    public void info(){
        String x;
        if(Gender == true){
            x = "Nam";
        }else{
            x = "Nu";
        }
        System.out.print("\nThong tin nguoi vua nhap: \n");
        System.out.print("PersonID: " + PersonID  + "\n" + "PersonName: "  + PersonName + "\n" + "Gender: "  + x  + "\n" + "Address: " + Address );
    }
}