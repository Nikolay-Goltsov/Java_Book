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
//		������������� ���� 7 ������ 2004 15:40 
		c.set(2004, 0, 7, 15, 40);//(��)
// 		��������� � ������������
		long day1 = c.getTimeInMillis();//��������� ���������� day 1 ????
//		��������� ���������� ���� � �������������
		day1 += 1000 * 60 * 60;// ������� ���� � ������������
//		����� ��������� �����
		c.setTimeInMillis(day1);//(��)
		System.out.println("New Hour " + c.get(c.HOUR_OF_DAY));
//		��������� � ���� 35 ����.(����������� � �������)
		c.add(c.DATE, 35);
		System.out.println("add 35 day " + c.getTime());
		//(��) ������������� �� 11.02.2004 16:41.�.�. ��� ��� ��������� ����
		
// 		"������������" ���� �� 35 ����.(����������� � �������)
		c.roll(c.DATE, 35);
		System.out.println("scroll 35 day " + c.getTime());
		// ???? ��� "�������������"  ����������� �� 17.02.2004 16:40
		
//		������������� ����.
		c.set(c.DATE, 1);//(��)
		System.out.println("date 1 " + c.getTime());
	}
}
