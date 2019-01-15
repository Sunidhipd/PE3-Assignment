import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class FirstAndLastDateOfWeek {

    public static String[] findDate(Calendar c){
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        String[] storeDate = new String[2];
        storeDate[0] = df.format(c.getTime());
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        storeDate[1]= df.format(c.getTime());
        return storeDate;
    }
}
