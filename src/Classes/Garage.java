package Classes;

import java.util.ArrayList;

public class Garage {
    private ArrayList<Vehicle> cars = new ArrayList<Vehicle>();

    public void addToGarage(Vehicle v){
        cars.add(v);
    }
    public void showByIndex(int index){
        cars.get(index).showVehicle();
    }
}
