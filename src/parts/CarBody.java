package parts;

public class CarBody {
    private String name;
    private int mass;
    private int volumeTank;
    private int volumeEngine;

    public CarBody(CarBodyVariants cb){
        this.name=cb.name;
        this.mass=cb.mass;
        this.volumeEngine=cb.volumeEngine;
        this.volumeTank=cb.volumeTank;

    }

}
