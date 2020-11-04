package Classes;

public class Lorry extends Auto {
    private int max_cargo_weight; //максимальный вес груза
    private int number_of_trailers; //количество прицепов

    public Lorry(String name, String color, int year, double price, int number_of_wheels, int max_speed
            , double engine_capacity, int engine_power, double fuel_consumption
            , int max_cargo_weight, int number_of_trailers){
        super.name=name;
        super.color=color;
        super.year=year;
        super.price=price;
        super.number_of_wheels=number_of_wheels;
        super.max_speed=max_speed;
        super.engine_capacity=engine_capacity;
        super.engine_power=engine_power;
        super.fuel_consumption=fuel_consumption;
        this.max_cargo_weight=max_cargo_weight;
        this.number_of_trailers=number_of_trailers;
    }

    @Override
    public void showVehicle() {
        System.out.println("\nМодель: "+super.name+"\nЦвет: "+super.color+"\nГод: "+super.year);
    }
}
