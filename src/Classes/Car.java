package Classes;

import java.time.Year;

public class Car extends Auto {
    private char class_auto; //класс автомобиля
    private int gear; // привод автомобиля (передный/задный/полный - 1/2/3)

    public Car(String name, String color, int year, double price, int number_of_wheels, int max_speed
    , char class_auto, int gear, double engine_capacity, int engine_power, double fuel_consumption){
        setName(name);
        setColor(color);
        setYear(year);
        setPrice(price);
        setNumber_of_wheels(number_of_wheels);
        setMax_speed(max_speed);
        setClass_auto(class_auto);
        setGear(gear);
        setEngine_capacity(engine_capacity);
        setEngine_power(engine_power);
        setFuel_consumption(fuel_consumption);
    }

    public void setClass_auto(char class_auto) {
        this.class_auto = class_auto;
    }

    public char getClass_auto() {
        return class_auto;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getGear() {
        return gear;
    }

    @Override
    public void showVehicle(){
        String gear="";
        switch (getGear()) {
            case 1 : { gear = "Передний"; break; }
            case 2 : { gear = "Задний"; break; }
            case 3 : { gear = "Полный"; break; }
        }
        System.out.println("\nМодель: "+getName()+"\nЦвет: "+getColor()+"\nГод: "+getYear()+
                "\nЦена: "+getPrice()+"\nКоличество колес: "+getNumber_of_wheels()+"\nМаксимальная скорость: "+
                getMax_speed()+"\nКласс: "+getClass_auto()+"\nПривод: "+gear+"\nОбъем двигателя: "+
                getEngine_capacity()+"\nМощность двигателя: "+getEngine_power()+"\nРасход топлива: "+getFuel_consumption());
    }
}
