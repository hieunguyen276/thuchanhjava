package Slide73;

public class App73 {
    
    public static void main (String[] args) {
        //Cac thuoc tinh x,y nay chi duoc truy xuat den thong qua the hien toaDo1
        ToaDo toaDo1 = new ToaDo();
        toaDo1.x = 10;
        toaDo1.y = 20;

        ////Cac thuoc tinh x,y nay chi duoc truy xuat den thong qua the hien toaDo2
        ToaDo toaDo2 = new ToaDo();
        toaDo2.x = 5;
        toaDo2.y = 6;

        // Thuoc tinh thongTin lai duoc truy xuat den thong qua lop ToaDo
        ToaDo.thongTin = "Luu toa do cac hinh hoc";
    }
}
