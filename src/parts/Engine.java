package parts;

public class Engine {
    private String name;
    private int mass;
    private int fuelConsumption;
    private int volume;
    Engine(String name, int mass, int fuelConsumption,int volume){
        this.fuelConsumption=fuelConsumption;
        this.mass=mass;
        this.name=name;
        this.volume=volume;
    }
}
