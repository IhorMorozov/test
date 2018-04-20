import parts.CarBody;
import parts.CarBodyVariants;
import parts.Engine;
import parts.FuelTank;
import util.Validator;


public class Car {
    FuelTank fuelTank;
    CarBody carBody;
    Engine engine;

    Car(){


    }

    void choiceCarBody(){
        System.out.println("Choose car body");

        System.out.println("#\tname\tmass\tvolumeTank\tvolumeEngine");


        for (int i = 0; i < CarBodyVariants.values().length; i++) {
            System.out.println((i+1)+") " +
                    CarBodyVariants.valueOf("CB"+(i+1)).name+"\t"+
                    CarBodyVariants.valueOf("CB"+(i+1)).mass+"\t"+
                    CarBodyVariants.valueOf("CB"+(i+1)).volumeTank+"\t"+
                    CarBodyVariants.valueOf("CB"+(i+1)).volumeEngine+"\t");
        }

        int answer = Validator.getNumber(1,CarBodyVariants.values().length);
        carBody = new CarBody(CarBodyVariants.valueOf("CB" + answer));



    }



}
