package pl.edu.ur.oopl5;
import java.util.Scanner;

public class Stack {
    private int[] stack;
    private int indicator;
    
    // CONSTRUCTOR
    public Stack(int stackSize) {
        stack = new int[stackSize];
        indicator = -1;
    }
    
    
    // METHODS
    private boolean push(){
        System.out.println("zadlab5 > Menu > Zadanie 3 > Menu > Push >");
        Scanner scanner = new Scanner(System.in);

        if(indicator < stack.length-1){
            indicator++;
            
            System.out.print("Podaj wartosc do wprowadzenia na stos: ");
            int newValue = scanner.nextInt();
            stack[indicator] = newValue;
            System.out.println("Gotowe");
            return true;
        }
        else {
            System.out.println("Stos pelny, nie mozna dodac elementu");
            scanner.nextLine();
            return false;
        }
    }
    private boolean pop(){
        System.out.println("zadlab5 > Menu > Zadanie 3 > Menu > Pop >");
        Scanner scanner = new Scanner(System.in);
        
        if (indicator >= 0){
            stack[indicator] = 0;
            indicator--;
            System.out.println("Gotowe");
            return true;
        }
        else {
            System.out.println("Stos pusty, nie mozna sciagnac wartosci");
            scanner.nextLine();
            return false;
        }
    }
    
    
    private boolean showStackContent(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("zadlab5 > Menu > Zadanie 3 > Menu > Pokaz zawartosc stosu >");
        
        if (indicator != -1){
            System.out.println("\n\n----------");
            for (int i=0;i<=stack.length-1;i++){
                System.out.println(stack[i]);
            }
            System.out.println("----------\n\n");
            return true;
        }
        else {
            System.out.println("Stos pusty. Nie mozna wyswietlic zawartosci");
            scanner.nextLine();
            return false;
        }
        
    }
    
    // MENU
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        int menu = 1;
        
        while(menu != 0){
            System.out.println("\n\nzadlab5 > Menu > Zadanie 3 > Menu >");
            System.out.println(" [ 1 ] Push");
            System.out.println(" [ 2 ] Pop");
            System.out.println(" [ 3 ] Pokaz zawartosc stosu");
            System.out.println(" [ 0 ] Cofnij");
            System.out.print("Menu > ");
            menu = scanner.nextInt();
            
            switch(menu){
                case 1: if (push()) System.out.println("! Operacja zakończona pomyślnie. Powrot do menu");
                        else System.out.println("! Niepowodzenie");
                        break;
                        
                case 2: if (pop()) System.out.println("! Operacja zakończona pomyślnie. Powrot do menu");
                        else System.out.println("! Niepowodzenie");
                        break;
                        
                case 3: if (showStackContent()) System.out.println("! Operacja zakończona pomyślnie. Powrot do menu");
                        else System.out.println("! Niepowodzenie");
                        break;
                        
                case 0: break;
            }
        }
    }
}
