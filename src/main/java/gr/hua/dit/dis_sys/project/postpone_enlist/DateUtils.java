package gr.hua.dit.dis_sys.project.postpone_enlist;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    // read a date string and parse/convert to a date
    public static Date parseDate(String dateStr) throws ParseException {
        Date theDate = formatter.parse(dateStr);
        return theDate;
    }

    // read a date and format/convert to a string
    public static String formatDate(Date theDate) {
        String result = null;
        if (theDate != null) {
            result = formatter.format(theDate);
        }
        return result;
    }

    //Get current date and return it as Date
    public static Date getDate() throws ParseException {
        Date date = new Date();
        return parseDate(formatter.format(date));
    }
}
