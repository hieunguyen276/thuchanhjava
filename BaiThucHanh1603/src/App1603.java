public class App1603 {
    public static void main(String[] args){
        Person ps = new Person();
        SinhVien sv = new SinhVien();
        PhuongTrinhBacHai pt = new PhuongTrinhBacHai();

        ps.nhapID();
        ps.nhapName();
        ps.nhapGioiTinh();
        ps.nhapAddress();
        ps.info();

        System.out.print("\n-------------------------------\n");

        sv.nhapMSV();
        sv.nhapHoTen();
        sv.nhapGioiTinh();
        sv.nhapDiaChi();
        sv.nhapNgaySinh();
        sv.info();

        System.out.print("\n-------------------------------\n");

        pt.nhapA();
        pt.nhapB();
        pt.nhapC();
        pt.giaiPhuongTrinh();
    }
}
