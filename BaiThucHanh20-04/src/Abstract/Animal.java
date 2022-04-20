package Abstract;

abstract class Animal {
    abstract void Eat();
    abstract void sleep();
    abstract void walk();
    abstract void run();
    abstract void roar();
}
class Tiger extends Animal{
    void Eat(){
        System.out.println("Su tu thi an thit");
    }
    void sleep(){
        System.out.println("Su tu ngay ngu 5 tieng");
    }
    void walk(){
        System.out.println("Su tu di bo khi khong san moi");
    }
    void run(){
        System.out.println("Su tu chay khi duoi theo con moi");
    }
    void roar(){
        System.out.println("Su tu gam khi muon canh bao");
    }
}