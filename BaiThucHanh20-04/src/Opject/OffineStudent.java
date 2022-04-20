package Opject;

public class OffineStudent extends Student {
    protected String thietBiHocTap;

    public String getThietBiHocTap(){
        return thietBiHocTap;
    }
    public void setThietBiHocTap(String thietBiHocTap){
        if (thietBiHocTap == null || thietBiHocTap.isEmpty()){
            this.thietBiHocTap = "Khong co";
        } else {
            this.thietBiHocTap = "Co laptop";
        }
    }

    public void dongHoc(){
        System.out.println("Len phong ke hoach tai chinh dong tien hoc");
    }
}
