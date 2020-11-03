package com.company;

import Classes.*;

public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car("Lanos", "Green", 2007, 3500, 4
                , 160, 'D', 1, 1.6, 89, 9.3);

        Vehicle lorry = new Lorry("ЗИЛ", "Синий", 1994, 8000, 6
                , 90, 5.9, 150, 32, 6000,
                1);
        Vehicle bicycle = new Bicycle("Space", "Белый", 2018, 300, 2
                , 2, 1, 1);

        car.showVehicle();
        lorry.showVehicle();
        bicycle.showVehicle();


//        Garage garage = new Garage();
//        garage.addToGarage(car);
//        garage.addToGarage(lorry);
//        garage.showByIndex(1);
//        garage.showByIndex(0);
    }
}
