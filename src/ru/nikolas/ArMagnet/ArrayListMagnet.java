package ru.nikolas.ArMagnet;

import java.util.*;

public class ArrayListMagnet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������� ��������� ���� ArrayList
		ArrayList<String> a = new ArrayList<String>();
		// ��������� �������� �� ������� ��� ������ ������ add();
		a.add(0, "����");
		a.add(1, "����");
		a.add(2, "���");
		a.add(3, "���");

		printAL(a);// �������� ����� ��� ������ ���������
		// �������� �������� ���������
		if (a.contains("���")) {
			a.add("������");
		}

		a.remove(2);// ������� �������

		if (a.contains("���")) {
			a.add("2.2");
		}
		printAL(a);// �������� ����� ��� ������ ���������

		if (a.indexOf("������") != 4) {
			a.add(4, "4.2");
		}
		printAL(a);// �������� ����� ��� ������ ���������
		if (a.contains("���")) {
			a.add("2.2");
		}
		printAL(a);// �������� ����� ��� ������ ���������

	}

	public static void printAL(ArrayList<String> al) {
		// TODO Auto-generated method stub
		for (String elementt : al) {
			System.out.print(elementt + " ");
		}
		System.out.println(" ");

	}

}
