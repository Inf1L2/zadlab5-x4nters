package pl.edu.ur.oopl5;
import java.util.Scanner;

public class Firma {
    private Pracownik[] workersList = new Pracownik[100];
    private int workersCounter;
    
    // CONSTRUCTOR
    public Firma() {
        for (int index = 0;index<100;index++){
            workersList[index] = new Pracownik("","",0,"");
        }
        workersCounter = 0;
    }
    
    // METHODS
    private boolean addWorker(){
        Scanner scanner = new Scanner(System.in);
        Scanner scannerImie = new Scanner(System.in);
        Scanner scannerNazwisko = new Scanner(System.in);
        Scanner scannerStanowisko = new Scanner(System.in);
        
        if (workersCounter < workersList.length-1){
            System.out.println("zadlab5 > Menu > Zadanie 5 > Menu > Dodaj pracownika >");
            
            int index = 0;
            int menuIndex = 0;
            
            do{
                System.out.print("Podaj index dla nowego pracownika: ");  
                index = scanner.nextInt();
                
                if (index < 0 || index >= 100){
                    System.out.println("Nieprawidlowy indeks pracownika. Co chcesz zrobic?");
                    System.out.println(" [ 1 ] Zmien indeks (domyslne)");
                    System.out.println(" [ 2 ] Przerwij operacje");
                    System.out.print("Menu > ");
                    menuIndex = scanner.nextInt();
                    
                    switch(menuIndex){
                        case 1: break;
                        case 2: return false;
                        default: break;
                    }
                }else break;
            }while(menuIndex != 0);
            
            if (workersList[index].isExist()){
                System.out.println("Pracownik o danym indeksie juz istnieje. Co chcesz zrobic?");
                System.out.println(" [ 1 ] Zastap pracownika (domyslne)");
                System.out.println(" [ 2 ] Przerwij dodawanie pracownika");
                System.out.print("Menu > ");
                int menu = scanner.nextInt();
                
                switch(menu){
                    case 1: break;
                    case 2: return false;
                    default: break;
                }
            }
            
            System.out.print(" Imie: ");
            String imie = scannerImie.nextLine();
            
            System.out.print(" Nazwisko: ");
            String nazwisko = scannerNazwisko.nextLine();
            
            int wiek = -1;
            do {
                System.out.print(" Wiek: ");
                wiek = scanner.nextInt();
                
                if (wiek < 0){
                    int menu = 1;
                    
                    System.out.println("Podano nieprawidlowy wiek. Co chcesz zrobic?");
                    System.out.println(" [ 1 ] Popraw wartosc (domyslne)");
                    System.out.println(" [ 2 ] Przerwij dodawanie pracownika");
                    System.out.print("Opcja > ");
                    menu = scanner.nextInt();
                    
                    switch(menu){
                        case 1: break;
                        case 2: return false;
                        default: break;
                    }
                }
            }
            while(wiek < 0);
            
            System.out.print(" Stanowisko: ");
            String stanowisko = scannerStanowisko.nextLine();
            
            System.out.println(index);
            
            if (!workersList[index].isExist()) workersCounter++;
            workersList[index].setImie(imie);
            workersList[index].setNazwisko(nazwisko);
            workersList[index].setWiek(wiek);
            workersList[index].setStanowisko(stanowisko);
            workersList[index].setExist(true);
            return true;
        }
        else{
            System.out.println("Lista pelna. Nie mozna dodac pracownika");
            scanner.nextLine();
            return false;
        }
    }
    private boolean deleteWorker(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("zadlab5 > Menu > Zadanie 5 > Menu > Usun pracownika >");
        
        if (workersCounter > 0){
            int menuIndex = 1;
            int index;
            
            do{
                System.out.print(" Podaj indeks pracownika do usuniecia: ");
                index = scanner.nextInt();
                
                if (index < 0 || index >= 100){
                    System.out.println("Nieprawidlowy indeks pracownika. Co chcesz zrobic?");
                    System.out.println(" [ 1 ] Zmien indeks (domyslne)");
                    System.out.println(" [ 2 ] Przerwij operacje");
                    System.out.print("Menu > ");
                    menuIndex = scanner.nextInt();
                    
                    switch(menuIndex){
                        case 1: break;
                        case 2: return false;
                        default: break;
                    }
                }
            }while(menuIndex != 1);
            
            workersList[index].setImie("");
            workersList[index].setNazwisko("");
            workersList[index].setWiek(0);
            workersList[index].setStanowisko("");
            workersList[index].setExist(false);
            workersCounter--;
            return true;
        }
        else {
            System.out.println("Lista pusta. Nie ma pracownika do usuniecia");
            scanner.nextLine();
            return false;
        }
    }
    private boolean showWorkersList(){
        System.out.println("zadlab5 > Menu > Zadanie 5 > Menu > Wyswietl spis pracownikow >");
        
        if (workersCounter > 0){
            for (int i=0;i<workersList.length-1;i++){
                if (workersList[i].isExist()){
                    System.out.println("\n----------");
                    System.out.println(" Indeks: " + i);
                    System.out.println(" Imie: " + workersList[i].getImie());
                    System.out.println(" Nazwisko: " + workersList[i].getNazwisko());
                    System.out.println(" Wiek: " + workersList[i].getWiek());
                    System.out.println(" Stanowisko: " + workersList[i].getStanowisko());
                    System.out.println("----------\n");
                }
            }
            return true;
        }
        else {
            System.out.println("Lista pracownikow pusta. Nie ma nic do wyswietlenia");
            return false;
        }
    }
    
    // MENU
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        int menu = 1;
        
        while(menu != 0){
            System.out.println("zadlab5 > Menu > Zadanie 5 > Menu >");
            System.out.println(" [ 1 ] Dodaj pracownika");
            System.out.println(" [ 2 ] Usun pracownika");
            System.out.println(" [ 3 ] Wyswietl spis pracownikow");
            System.out.println(" [ 0 ] Cofnij");
            System.out.print("Menu > ");
            menu = scanner.nextInt();
            
            switch(menu){
                case 1: if (addWorker()) System.out.println("! Operacja zakończona pomyślnie. Powrot do menu");
                        else System.out.println("! Niepowodzenie");
                        break;
                        
                case 2: if (deleteWorker()) System.out.println("! Operacja zakończona pomyślnie. Powrot do menu");
                        else System.out.println("! Niepowodzenie");
                        break;
                        
                case 3: if (showWorkersList()) System.out.println("! Operacja zakończona pomyślnie. Powrot do menu");
                        else System.out.println("! Niepowodzenie");
                        break;
                        
                case 0: break;
            }
        } 
    }
}
