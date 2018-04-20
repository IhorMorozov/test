package parts;

public enum CarBodyVariants {
    CB1("Bug",600,50,200),
    CB2("Tank",260,550,600),
    CB3("Volv",100,150,200),
    CB4("Lamb",600,50,200),
    CB5("Hama",600,50,200);

    public final String name;
    public final int mass;
    public final int volumeTank;
    public final int volumeEngine;



    CarBodyVariants(String name,int mass,int volumeTank,int volumeEngine){
        this.name=name;
        this.mass=mass;
        this.volumeEngine=volumeEngine;
        this.volumeTank=volumeTank;


    }
}
