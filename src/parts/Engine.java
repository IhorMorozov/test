package parts;

public class Engine {
    private String name;
    private int mass;
    private int fuelConsumption;
    private int volume;
    Engine(EngineVariants ev){
        this.fuelConsumption=ev.fuelConsumption;
        this.mass=ev.mass;
        this.name=ev.name;
        this.volume=ev.volume;
    }
}
