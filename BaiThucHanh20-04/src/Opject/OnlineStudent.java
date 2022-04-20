package Opject;

public class OnlineStudent extends Student{
    public String theSV;

    public void setTheSv(String theSV){
        if(theSV == null || theSV.isEmpty()){
            this.theSV = "Khong co the sinh vien";
        }else{
            this.theSV = "Co the sinh vien";
        }
    }
}
