package parts;

public enum EngineVariants {
    E1("vitya loh",600,50,200),
    E2("t - 32",260,550,600),
    E3("qwerty",100,150,200),
    E4("v8+",600,50,200),
    E5("samsung",600,50,200);

    public final String name;
    public final int mass;
    public final int fuelConsumption;
    public final int volume;



    EngineVariants(String name,int mass,int fuelConsumption,int volume){
        this.name=name;
        this.mass=mass;
        this.fuelConsumption=fuelConsumption;
        this.volume=volume;


    }
}
