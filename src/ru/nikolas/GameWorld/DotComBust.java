/**
 * 
 */
package ru.nikolas.GameWorld;

import java.util.ArrayList;

/**
 * @author Hakers
 *
 */
public class DotComBust {
//��������� � �������������� ����������, ������� ��� �����������
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();// ������� ArrayList ������ ��� �������� DotCom
	private int numOfGuesses = 0;

	private void setUpGame() {
//		������� ��������� �������� ��� ����������� � �������� �� ������
//		������� ��� ������� DotCom, ���� �� ����� � ���������� �� � ArrayList.
		DotCom one = new DotCom();
		one.setName("Zerg_1");
		DotCom two = new DotCom();
		two.setName("Zerg_2");
		DotCom three = new DotCom();
		three.setName("Zerg_3");
		dotComList.add(one);
		dotComList.add(two);
		dotComList.add(three);
//		����� ������� ���������� ��� ������������
		System.out.println("���� ���� �������� ��� �������.");
		System.out.println("Zerg_1, Zerg_2, Zerg_3");
		System.out.println("����������� �������� �� �� ����������� ���������� �����");

		for (DotCom dotComToSet : dotComList) {// ��������� � ������ �������� DotCom � ������
			// ����������� � ���������������� ������� ����� ������� ���� Zeng...
//			ArrayList<String> newLocation = helper.placeDotCom(3);
			// �������� ������ �� ������� DotCom, ����� �������� ��� ��������������, �������
			// ������ ��� �������� �� ���������������� �������
//			dotComToSet.setLocationCells(newLocation);
		} // ����� �����
	}// ����� ������ setUpGame

	private void startPlaying() {
		while (!dotComList.isEmpty()) {// ��������� ���� ������ �������� DotCom �� ������ ������
			// �������� ���������������� ����
			String userGuess = helper.getUserInput("������ ��� !.");
//			checkUserGuess(userGuess);// �������� ��� ����� checkUserGuess
		} // ����� while
		finishGame();// ������� ��� ����� finishGame
	}// ����� ������ startPlaying.

	private void chechUserGuess(String userGuess) {
		numOfGuesses++;// ���������������� ���������� �������, ������� ������ ������������
		String result = "����"; // ������������� ������, ���� �� ������� ���������
		// ��������� ��� ���� ������� DotCom � ������
		for (DotCom dotComToTest : dotComList) {
			// ������ DotCom ��������� ��� ������������, ���� ��������� ��� ����������
			result = dotComToTest.checkYourseIf(userGuess);
			if (result.equals("�����")) {
				break;//���������� �� ����� ������ �������, ��� ������ ��������� ������ �������.
			}
			if (result.equals("�������")) {
				dotComList.remove(dotComToTest);// ���� Zerg ������ ����� ������� ��� �� ������� ��������
				break;
			}
		}// ����� for
		System.out.println(result);// ������� ��� ������������ ��������� 

	}// ����� ������
	// ������� ��������� ��� ������������ ������� ����
	private void finishGame() {
		System.out.println("��� Zerg \"i\" ���� �� ���! ���� ����� ������ ������ �� �����.  ");
		if (numOfGuesses<=18) {
			System.out.println("��� ������ � ��� ����� "+ numOfGuesses+ " �������(�).");
			System.out.println("�� ������ ��������� �� ����, ��� ���� �������� �������");
			}else {
				System.out.println("��� ������ � ��� �������� ����� �������. "+numOfGuesses+ " �������(�).");
				System.out.println("���� ����� �������� ������ ����� ��������.");
			}
	} // ����� ������
}
