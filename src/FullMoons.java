import java.util.*;
import static java.lang.System.out;

/*
 * Полнолуние было 7 января 2004
 * Вывести даты когда еще было полнолуние
 * с учетом того что полнолуние бывает ~ раз в 29,52 дня
 * Результат зависит от часового пояса нахождения 
 */
public class FullMoons {

	static int DAY_IM = 1000 * 60 * 60 * 24;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		c.set(2004, 0, 7, 15, 40);
		long day1 = c.getTimeInMillis();
		
		for (int x = 0; x < 200; x++) {
			day1 += (DAY_IM * 29.52);
			c.setTimeInMillis(day1);
			out.println(String.format("Полнолуние было в %tc", c));
		}

	}

}
