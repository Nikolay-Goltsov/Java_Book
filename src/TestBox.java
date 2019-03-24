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
	static Integer i;//Создаем итеджер i значение null
	static int j;//Cоздаем переменную j значение 0
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBox t = new TestBox();//Создаем объект и назначаем ссылку
		t.go();// Вызываем метод go

		
	}
	
	public static void go() {
		j=i;// Приравниваем j к i
		System.out.println(j);// Вывод значения j
		System.out.println(i);// Вывод значения i
	}
}
