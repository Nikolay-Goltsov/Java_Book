/**
 * 
 */

/**
 * @author Hakers
 *
 */
public class TestBox {

	/**
	 * @param args
	 */
	static Integer i;//������� ������� i �������� null
	static int j;//C������ ���������� j �������� 0
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBox t = new TestBox();//������� ������ � ��������� ������
		t.go();// �������� ����� go

		
	}
	
	public static void go() {
		j=i;// ������������ j � i
		System.out.println(j);// ����� �������� j
		System.out.println(i);// ����� �������� i
	}
}
