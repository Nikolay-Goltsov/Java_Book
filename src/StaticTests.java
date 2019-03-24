/**
 * 
 */

/**
 * @author Hakers
 *
 */
class StaticSuper {

	static {
		System.out.println("������������ ����������� ����");
	}

	StaticSuper (){
		System.out.println("������������ �����������");
	}
}

public class StaticTests extends StaticSuper {

	static int rand;
	static {
		rand = (int) (Math.random() * 6);
		System.out.println("����������� ���� " + rand);
	}

	StaticTests() {
		System.out.println("�����������");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ main");
		StaticTests st = new StaticTests();
	}
}
