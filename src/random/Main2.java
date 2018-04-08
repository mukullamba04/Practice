package random;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

public class Main2 {
	public static List<Date> getDatesBetweenUsingJava7(
			  Date startDate, Date endDate) {
			    List<Date> datesInRange = new ArrayList<>();
			    Calendar calendar = new GregorianCalendar();
			    calendar.setTime(startDate);
			     
			    Calendar endCalendar = new GregorianCalendar();
			    endCalendar.setTime(endDate);
			 
			    while (calendar.before(endCalendar)) {
			        Date result = calendar.getTime();
			        datesInRange.add(result);
			        calendar.add(Calendar.DATE, 1);
			    }
			    return datesInRange;
			}
	public static void main(String[] args) throws IOException {

		List<Date> allDates = getDatesBetweenUsingJava7(new Date(116, 5, 4), new Date(118, 5, 4));
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		for (Iterator iterator = allDates.iterator(); iterator.hasNext();) {
			Date date = (Date) iterator.next();
			System.out.println(df.format(date));
		}
	}
}
