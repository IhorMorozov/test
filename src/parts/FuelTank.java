package parts;

public class FuelTank {
    private String name;
    private int mass;
    private int fuel;
    private int volume;
    FuelTank(String name, int mass, int fuelConsumption,int volume){
        this.fuel=fuelConsumption;
        this.mass=mass;
        this.name=name;
        this.volume=volume;
    }
}
