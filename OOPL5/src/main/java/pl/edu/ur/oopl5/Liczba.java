package pl.edu.ur.oopl5;
import java.util.Scanner;

public class Liczba {
    private Integer[] number = new Integer[10];

    public Liczba() {
        
    }
    
    public void showContent(){
        for (int i=0; i<number.length-1; i++){
            System.out.print(number[i]);
        }
        System.out.println();
    }
    
    public void setValue(String valueString){
        int tempInt;
        char tempC;
        for (int i=0; i<valueString.length()-1;i++){
            tempC = valueString.charAt(i);
            //tempInt = Integer.valueOf(tempC);
            tempInt = Character.getNumericValue(tempC);
            number[i] = tempInt;
        }
    }
}