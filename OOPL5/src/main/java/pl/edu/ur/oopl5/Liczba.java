package pl.edu.ur.oopl5;
import java.util.Scanner;

public class Liczba {
    private Integer[] number;

    public Liczba(String valueString) {
        number = new Integer[valueString.length()];
        Character[] znaki = new Character[valueString.length()];
        
        for (int i=0; i<znaki.length; i++){
            znaki[i] = valueString.charAt(i);
        }
        
        for (int i=0; i<znaki.length; i++){
            number[i] = Character.getNumericValue(znaki[i]);
        }
    }
    
    public void showContent(){
        for (int i=0; i<number.length; i++){
            System.out.print(number[i]);
        }
        System.out.println();
    }
    
    public void multi(){
        Scanner scanner = new Scanner(System.in);
        String valueString = "";
        
        System.out.println("zadlab5 > Menu > Zadanie 6 > Menu > Pomnoz >");
        System.out.print(" Podaj czynnik: ");
        int skladnik = scanner.nextInt();
        
        for (int i=0; i<number.length; i++){
            valueString = valueString + Integer.toString(number[i]);
        }
        
        int valueInt = Integer.valueOf(valueString);
        int result = valueInt * skladnik;
        
        valueString = Integer.toString(result);
        
        Character[] znaki = new Character[valueString.length()];
        
        for (int i=0; i<znaki.length; i++){
            znaki[i] = valueString.charAt(i);
        }
        
        Integer[] resultTable = new Integer[znaki.length];
        
        for (int i=0; i<znaki.length; i++){
            resultTable[i] = Character.getNumericValue(znaki[i]);
        }
        
        System.out.print("Wynik mnozenia: ");
        for (int i=0; i<resultTable.length; i++){
            System.out.print(resultTable[i]);
        }
        System.out.println();
    }
}