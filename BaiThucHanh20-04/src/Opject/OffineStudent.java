package Opject;

public class OffineStudent extends Student {
    protected String thietBiHocTap;
    
    public void setThietBiHocTap(String thietBiHocTap){
        if (thietBiHocTap == null || thietBiHocTap.isEmpty()){
            this.thietBiHocTap = "Khong co";
        } else {
            this.thietBiHocTap = "Co laptop";
        }
    }
}
