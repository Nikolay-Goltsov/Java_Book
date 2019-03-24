import java.util.Date;

/**
 * 
 */

/**
 * @author Hakers
 *
 */
public class Format_S {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = String.format("Мне нужно исправить %,d ошибки.", 476509876);
//		String s = String.format("%,d", 1000000000);
		int d = 54564564;
		double d1=d;
//		String s = String.format("%,d %,.2f", d, d1);
//		String s = String.format("%tc", new Date());
//		String s = String.format("%tr", new Date());
		Date today = new Date();
		
//		String s = String.format("%tA, %tB %td", today,today, today);
		String s1 = String.format("%tA, %<tB %<td", today);
		
		System.out.println(s);
		System.out.println(s1);
		
		float d2 = 5646.4654f;
		System.out.println(d2);
		
	}

}
