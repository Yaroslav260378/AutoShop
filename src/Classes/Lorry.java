package Classes;

public class Lorry extends Auto {
    private int max_cargo_weight; //максимальный вес груза
    private int number_of_trailers; //количество прицепов

    public Lorry(String name, String color, int year, double price, int number_of_wheels, int max_speed
            , double engine_capacity, int engine_power, double fuel_consumption
            , int max_cargo_weight, int number_of_trailers){
        setName(name);
        setColor(color);
        setYear(year);
        setPrice(price);
        setNumber_of_wheels(number_of_wheels);
        setMax_speed(max_speed);
        setEngine_capacity(engine_capacity);
        setEngine_power(engine_power);
        setFuel_consumption(fuel_consumption);
        setMax_cargo_weight(max_cargo_weight);
        setNumber_of_trailers(number_of_trailers);
    }

    public void setMax_cargo_weight(int max_cargo_weight) {
        this.max_cargo_weight = max_cargo_weight;
    }

    public int getMax_cargo_weight() {
        return max_cargo_weight;
    }

    public void setNumber_of_trailers(int number_of_trailers) {
        this.number_of_trailers = number_of_trailers;
    }

    public int getNumber_of_trailers() {
        return number_of_trailers;
    }

    @Override
    public void showVehicle() {
        System.out.println("\nМодель: "+getName()+"\nЦвет: "+getColor()+"\nГод: "+getYear());
    }
}
