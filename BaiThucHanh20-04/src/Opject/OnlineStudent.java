package Opject;

public class OnlineStudent extends Student {
    protected String thietBiHocTap;

    public void setThietBiHocTap(String thietBiHocTap){
        if (thietBiHocTap == null || thietBiHocTap.isEmpty()){
            this.thietBiHocTap = "Khong co";
        } else {
            this.thietBiHocTap = "Co laptop";
        }
    }

    public void dongHoc(){
        System.out.println("Dong hoc phi thong qua SmartBanking hoac ra ngan hang o dia phuong dong hoc");
    }
}