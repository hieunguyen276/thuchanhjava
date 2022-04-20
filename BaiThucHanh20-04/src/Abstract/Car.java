package Abstract;

interface  Car {
    void Move();
    void Stop();
    void TurnRight();
    void TurnLeft();
    void Reverse();
}
class TaxiCar implements Car{
    public void Move(){
        System.out.println("Xe o to co the di chuyen");
    }
    public void Stop(){
        System.out.println("Xe o to co the dung lai");
    }
    public void TurnRight(){
        System.out.println("Xe o to co the re phai");
    }
    public void TurnLeft(){
        System.out.println("Xe o to co the re trai");
    }
    public void Reverse(){
        System.out.println("Xe o to co the quay dau");
    }

}