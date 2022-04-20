package main;

import Abstract.*;

public class MainAbsstract {
    public static void main(String[] args) throws Exception {
        Tiger tiger1 = new Tiger();
        tiger1.Eat();
        TaxiCar taxiCar1 = new TaxiCar();
        taxiCar1.Stop();

        Animal baodom = new Tiger();
        baodom.run();

    }
}
