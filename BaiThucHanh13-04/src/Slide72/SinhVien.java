package Slide72;

public class SinhVien {
    private String ten;
    private String tuoi;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if (ten==null || ten.isEmpty()){
            //neu bien ten chua khoi tao ( mang gia tri null, hoac bien ten co noi dung)
            //thi hay luu voi ten la " khong biet "
            this.ten ="Khong biet";
        }else { 
            this.ten = ten;
        }
    }
    public String getTuoi(){
        if(Integer.valueOf(tuoi) != -1) {
            //tuoi hop le
            return tuoi;
        }else {
            return "Tuoi khong hop le ";
        }
    }
    public void setTuoi(int tuoi) {
        //Kiem tra tuoi co hop ly hay khong , neu hop ly thi luu vao, neu khong se in ra -1
        if (tuoi > 18) {
            this.tuoi = String.valueOf(tuoi);
        }else {
            this.tuoi = String.valueOf(-1);
        }
    }
}
