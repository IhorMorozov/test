import parts.CarBody;
import parts.CarBodyVariants;
import parts.Engine;
import parts.EngineVariants;
import parts.FuelTank;
import parts.FuelTankVariants;

import util.Validator;


public  class Car {
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


    void choiceEngine(){
        System.out.println("Choose engine");
        System.out.println("#\tname\tmass\tfuelConsumption\tvolume");
        for(int i=0;i<EngineVariants.values().length;i++){
        System.out.println((i+1)+") "+
        EngineVariants.valueOf("E"+(i+1)).name+"\t"+
        EngineVariants.valueOf("E"+(i+1)).mass+"\t"+
        EngineVariants.valueOf("E"+(i+1)).fuelConsumption+"\t"+
        EngineVariants.valueOf("E"+(i+1)).volume+"\t");
        }
        int answer=Validator.getNumber(1,EngineVariants.values().length);
        engine=new Engine(EngineVariants.valueOf("E"+answer));
    }






    void choiceFuelTank(){
        System.out.println("Choose engine");
        System.out.println("#\tname\tmass\tfuel\tvolume");
        for(int i=0;i<EngineVariants.values().length;i++){
        System.out.println((i+1)+") "+
        EngineVariants.valueOf("F"+(i+1)).name+"\t"+
        EngineVariants.valueOf("F"+(i+1)).mass+"\t"+
        EngineVariants.valueOf("F"+(i+1)).fuel+"\t"+
        EngineVariants.valueOf("F"+(i+1)).volume+"\t");
        }
        int answer=Validator.getNumber(1,FuelTankVariants.values().length);
        fuetTank = new FuelTank(FuelTankVariants.valueOf("F"+answer));
    }




}
