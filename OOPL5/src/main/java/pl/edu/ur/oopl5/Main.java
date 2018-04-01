package pl.edu.ur.oopl5;
import java.util.Scanner;
// TODO zad 3, 5, 6

public class Main {
    private static void zadanie3(){
        System.out.println("zadlab5 > Menu > Zadanie 3 >");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Podaj rozmiar stosu: ");
        int stackSize = scanner.nextInt();
        Stack stackOne = new Stack(stackSize);
        stackOne.menu();
    }
    
    private static void zadanie4(){
        Data data1 = new Data();
        Scanner scanner = new Scanner(System.in);
        int menu = 1;
        while (menu != 0){
            System.out.println("zadlab5 > Menu > Zadanie 4 > Menu >");
            System.out.println(" [ 1 ] Wyswietl date");
            System.out.println(" [ 2 ] Przesun do przodu");
            System.out.println(" [ 3 ] Przesun do tylu");
            System.out.println(" [ 0 ] Cofnij");
            System.out.print("Menu > ");
            menu = scanner.nextInt();
            
            switch(menu){
                case 1: data1.odczytajDate(); break;
                case 2: data1.przesunDoPrzodu(); break;
                case 3: data1.przesunDoTylu(); break;
                case 0: break;
            }
        }
    }
    
    private static void zadanie5(){
        Firma company1 = new Firma();
        company1.menu();
    }
    
    private static void zadanie6(){
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu = 1;
        
        while(menu != 0){
            System.out.println("zadlab5 > Menu >");
            System.out.println(" [ 3 ] Zadanie 3");
            System.out.println(" [ 4 ] Zadanie 4");
            System.out.println(" [ 5 ] Zadanie 5");
            System.out.println(" [ 6 ] Zadanie 6");
            System.out.println(" [ 0 ] Wyjscie");
            System.out.print("Menu > ");
            menu = scanner.nextInt();
            
            switch(menu){
                case 3: zadanie3(); break;
                case 4: zadanie4(); break;
                case 5: zadanie5(); break;
                case 6: zadanie6(); break;
                case 0: break;                
            }
        } 
    }
}
