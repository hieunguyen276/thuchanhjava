package Opject;
    
public class Customer {
    private String muaHang;
    private String theThanhToan;

    public String getMuaHang(){
        return muaHang;
    }
    public String getTheThanhToan(){
        return theThanhToan;
    }
    public void setMuaHang(String muaHang){
        this.muaHang = muaHang;
    }
    public void setTheThanhToan(String theThanhToan){
        if(theThanhToan == null || theThanhToan.isEmpty()){
            this.theThanhToan = "Khong dung the";
        }else{
            this.theThanhToan = theThanhToan;
        }
    }
    public void giaoDich(){
        System.out.println("Khach hang la thuong de ");
    }
}
