/**
 * 
 */
package ru.nikolas.GameWorld;

import java.util.ArrayList;

/**
 * @author Hakers
 *
 */


public class DotCom {

	/**
	 * @param args
	 */
	// ���������� ���������� ������ DotCom
	private ArrayList<String>locationCells;// ArrayList � �������� ������������ ��������������
	private String name;// ��� ������� (Zerg)

	// ��������� ������ ������� ��������� ������������� ������(�������� ����� ����
	// �����)
	//������ ������� ��������� �������������� ������� (Zorg)(��������� �����, ��������������� ������� peaceDotCom �� ������ GameHelper
	public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}
	public void setName(String n) {// ��� ������� ������
		name =n;
	}
	
	// ��������� �����, ������� ��������� ��� user � �������� ��������� String
	// ��������� ��� � ���������� ��������� ��������.

	public String checkYourseIf(String userInput) {

		String result = "Fack(����)";
		
		// ����� indexOf �� ArrayList � ��������. ���� ��� ������������ ������ � �����
		// �� ��������� ArrayList, �� ����� indexOf ������ ��� ��������������. 
		// ���� ���, �� indexOf ������ -1
		int index = locationCells.indexOf(userInput);
		
		if (index>=0) {
			// ��������� ����� remove �� ArrayList ��� �������� ��������
			locationCells.remove(index);
			
			// ���������� ����� isEmpty, ����� ��������� ��� �� ������ ���������
			if (locationCells.isEmpty()) { 
			
				result = "GoodBye(�����)";	
				// �������� ������������ � ����������  ������� (Zerg)(
			System.out.println("��! �� ���������� "+ name+ " : ( ");
			}else {
				
				result="Yes(�����)";
				}// ����� else
		}// ����� if
		
				return result;// ���������� "����", "�����", "�������".
	}// ����� ������
}// ����� ������
