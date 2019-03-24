import java.util.Calendar;

/**
 * 
 */

/**
 * @author Hakers
 *
 */
public class Test_Date {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c = Calendar.getInstance();
//		Устанавливаем дату 7 января 2004 15:40 
		c.set(2004, 0, 7, 15, 40);//(ОК)
// 		Переводим в миллисекунды
		long day1 = c.getTimeInMillis();//Присвоили переменной day 1 ????
//		Добавляем эквивалент часа в миллисекундах
		day1 += 1000 * 60 * 60;// Перевод часа в миллисекунды
//		затем обновляем время
		c.setTimeInMillis(day1);//(ОК)
		System.out.println("New Hour " + c.get(c.HOUR_OF_DAY));
//		Добавляем к дате 35 дней.(оказываемся в феврале)
		c.add(c.DATE, 35);
		System.out.println("add 35 day " + c.getTime());
		//(ОК) Переместились на 11.02.2004 16:41.т.к. час был прибавлен тоже
		
// 		"Прокручиваем" дату на 35 дней.(оказываемся в феврале)
		c.roll(c.DATE, 35);
		System.out.println("scroll 35 day " + c.getTime());
		// ???? При "прокручивании"  оказываемся на 17.02.2004 16:40
		
//		Устанавливаем дату.
		c.set(c.DATE, 1);//(ОК)
		System.out.println("date 1 " + c.getTime());
	}
}
