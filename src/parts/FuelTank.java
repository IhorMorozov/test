package parts;

public class FuelTank {
    private String name;
    private int mass;
    private int fuel;
    private int volume;
    FuelTank(FuelTankVariants ft){
        this.fuel=ft.fuel;
        this.mass=ft.mass;
        this.name=ft.name;
        this.volume=ft.volume;
    }
}
