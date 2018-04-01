package pl.edu.ur.oopl5;
import java.util.Scanner;

public class Zadanie6 {
    Liczba liczba = new Liczba();
    
    public void showContent(){
        liczba.showContent();
    }
    
    public void setValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("zadlab5 > Menu > Zadanie 6 > Menu > Nadaj wartosc >");
        System.out.print(" Podaj wartosc: ");
        String value = scanner.nextLine();
        liczba.setValue(value);
    }
    
    public void multi(){
        
    }
    
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        int menu = 1;
        
        while(menu !=0){
            System.out.println("zadlab5 > Menu > Zadanie 6 > Menu >");
            System.out.println(" [ 1 ] Wypisz");
            System.out.println(" [ 2 ] Nadaj wartosc");
            System.out.println(" [ 3 ] Pomnoz");
            System.out.println(" [ 0 ] Cofnij");
            System.out.print("Menu > ");
            menu = scanner.nextInt();
            
            switch(menu){
                case 1: showContent(); break;
                case 2: setValue(); break;
                case 3: multi(); break;
                case 0: break;
                default: System.out.println("! Nieprawidlowa opcja");
            }
        }
    }
}
