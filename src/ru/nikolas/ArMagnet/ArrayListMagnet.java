package ru.nikolas.ArMagnet;

import java.util.*;

public class ArrayListMagnet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Создаем коллекцию типа ArrayList
		ArrayList<String> a = new ArrayList<String>();
		// Добовляем элементы по индексу при помощи метода add();
		a.add(0, "ноль");
		a.add(1, "один");
		a.add(2, "два");
		a.add(3, "три");

		printAL(a);// Вызываем метод для вывода элементов
		// проверка элемента коллекции
		if (a.contains("три")) {
			a.add("четыре");
		}

		a.remove(2);// удаляем элемент

		if (a.contains("два")) {
			a.add("2.2");
		}
		printAL(a);// Вызываем метод для вывода элементов

		if (a.indexOf("четыре") != 4) {
			a.add(4, "4.2");
		}
		printAL(a);// Вызываем метод для вывода элементов
		if (a.contains("два")) {
			a.add("2.2");
		}
		printAL(a);// Вызываем метод для вывода элементов

	}

	public static void printAL(ArrayList<String> al) {
		// TODO Auto-generated method stub
		for (String elementt : al) {
			System.out.print(elementt + " ");
		}
		System.out.println(" ");

	}

}
