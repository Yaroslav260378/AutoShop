package Classes;

public class Bicycle extends Vehicle{
    private int type_of_brakes; //тип тормозов (дисковые/ободные)
    private int type_of_bicycle; //спорт/туристический/горный

    public Bicycle(String name, String color, int year, double price, int number_of_wheels, int max_speed
            , int type_of_bicycle, int type_of_brakes)
    {
        super.name=name;
        super.color=color;
        super.year=year;
        super.price=price;
        super.number_of_wheels=number_of_wheels;
        super.max_speed=max_speed;
        this.type_of_bicycle=type_of_bicycle;
        this.type_of_brakes=type_of_brakes;
    }


    @Override
    public void showVehicle() {
        System.out.println("\nМодель: "+super.name+"\nЦвет: "+super.color+"\nГод выпуска: "+super.year
                +"\nЦена: "+super.price);
    }
}
