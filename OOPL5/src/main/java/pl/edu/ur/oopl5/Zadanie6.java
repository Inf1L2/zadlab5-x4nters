package pl.edu.ur.oopl5;
import java.util.Scanner;

public class Zadanie6 {
    Liczba liczba;
    
    public void showContent(){
        liczba.showContent();
    }
    
    private void setValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("zadlab5 > Menu > Zadanie 6 > Nadaj wartosc >");
        System.out.print(" Podaj wartosc: ");
        String value = scanner.nextLine();
        
        liczba = new Liczba(value);
    }
    
    private void factorialStart(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("zadlab5 > Menu > Zadanie 6 > Menu > Silnia >");
        System.out.print(" Podaj liczbe, z ktore ma zostac policzona silnia: ");
        int n = scanner.nextInt();
        System.out.println("Silnia z " + n + " jest rowna " + factorial(n));
    }
    
    private long factorial(int n){
        long result = 1;
        for (int i=1; i<=n; i++){
            result = result * i;
        }
        return result;
    }
    
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        int menu = 1;
        
        setValue();
        while(menu !=0){
            System.out.println("zadlab5 > Menu > Zadanie 6 > Menu >");
            System.out.println(" [ 1 ] Wypisz");
            System.out.println(" [ 2 ] Pomnoz");
            System.out.println(" [ 3 ] Silnia");
            System.out.println(" [ 0 ] Cofnij");
            System.out.print("Menu > ");
            menu = scanner.nextInt();
            
            switch(menu){
                case 1: showContent(); break;
                case 2: liczba.multi(); break;
                case 3: factorialStart(); break;
                case 0: break;
                default: System.out.println("! Nieprawidlowa opcja");
            }
        }
    }
}
