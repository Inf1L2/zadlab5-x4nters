package pl.edu.ur.oopl5;
import java.util.Date;
import java.util.Calendar;

public class Data {
    private Date data = new Date();
    private Calendar cal = Calendar.getInstance();
    
    public Data() {
        cal.setTime(data);
    }
    
    public void odczytajDate(){
        System.out.println("Data: " + cal.getTime());
    }
    
    public void przesunDoPrzodu(){
        
        cal.add(Calendar.DATE,7);
    }
    
    public void przesunDoTylu(){
        cal.add(Calendar.DATE, -7);
    }
}
