package parts;

public enum FuelTankVariants {
    F1("apple",600,50,200),
    F2("kik",260,550,600),
    F3("bmw",100,150,200),
    F4("hororr",600,50,200),
    F5("bulka",600,50,200);

    public final String name;
    public final int mass;
    public final int fuel;
    public final int volume;

    FuelTankVariants(String name,int mass,int fuel,int volume){
        this.name=name;
        this.mass=mass;
        this.fuel=fuel;
        this.volume=volume;

    }

}

