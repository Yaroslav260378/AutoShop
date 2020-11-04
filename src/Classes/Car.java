package Classes;

import java.time.Year;

public class Car extends Auto {
    private char class_auto; //класс автомобиля
    private int gear; // привод автомобиля (передный/задный/полный - 1/2/3)

    public Car(String name, String color, int year, double price, int number_of_wheels, int max_speed
    , char class_auto, int gear, double engine_capacity, int engine_power, double fuel_consumption){
        super.name=name;
        super.color=color;
        super.year=year;
        super.price=price;
        super.number_of_wheels=number_of_wheels;
        super.max_speed=max_speed;
        this.class_auto=class_auto;
        this.gear=gear;
        super.engine_capacity=engine_capacity;
        super.engine_power=engine_power;
        super.fuel_consumption=fuel_consumption;
    }

    @Override
    public void showVehicle(){
        String gear="";
        switch (this.gear) {
            case 1 : { gear = "Передний"; break; }
            case 2 : { gear = "Задний"; break; }
            case 3 : { gear = "Полный"; break; }
        }
        System.out.println("\nМодель: "+super.name+"\nЦвет: "+super.color+"\nГод: "+super.year+
                "\nЦена: "+super.price+"\nКоличество колес: "+super.number_of_wheels+"\nМаксимальная скорость: "+
                super.max_speed+"\nКласс: "+this.class_auto+"\nПривод: "+gear+"\nОбъем двигателя: "+
                super.engine_capacity+"\nМощность двигателя: "+super.engine_power+"\nРасход топлива: "+super.fuel_consumption);
    }
}
