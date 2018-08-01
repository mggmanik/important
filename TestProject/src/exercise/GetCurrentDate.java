package exercise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetCurrentDate {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println("First day of the week: "+df.format(c.getTime()));
        for (int i=0;i<6;i++)
        {
         c.add(Calendar.DATE,1);
        }
        System.out.println("Last day of the week: "+df.format(c.getTime()));
    }
}
