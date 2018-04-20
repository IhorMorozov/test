package util;

import java.util.Scanner;

public class Validator {

    public static int getNumber(int min, int max){
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Choose your option: ");
        while (true){
            input=scanner.nextLine();
            if(input.matches( "\\d+")){
                if(Integer.parseInt(input)>=min && Integer.parseInt(input)<=max){
                    return Integer.parseInt(input);
                }
            }
            System.out.println("input invalid");
        }


    }

}
