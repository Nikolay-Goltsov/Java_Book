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
	// Переменные экземпляра класса DotCom
	private ArrayList<String>locationCells;// ArrayList с ячейками описывающими местоположение
	private String name;// Имя объекта (Zerg)

	// Объявляем сеттер который принимает целочисленный массив(хранящий адрес трех
	// ячеек)
	//Сеттер который обновляет местоположение объекта (Zorg)(случайный адрес, предоставляемый методом peaceDotCom из класса GameHelper
	public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}
	public void setName(String n) {// Ваш простой сеттер
		name =n;
	}
	
	// Объявляем метод, который принемает ход user в качестве параметра String
	// Проверяет его и возвращает результат выстрела.

	public String checkYourseIf(String userInput) {

		String result = "Fack(Мимо)";
		
		// Метод indexOf из ArrayList в действии. Если ход пользователя совпал с одним
		// из элементов ArrayList, то метод indexOf вернет его местоположение. 
		// Если нет, то indexOf вернет -1
		int index = locationCells.indexOf(userInput);
		
		if (index>=0) {
			// Применяем метод remove из ArrayList для удаления элемента
			locationCells.remove(index);
			
			// Используем метод isEmpty, чтобы проверить все ли адреса разгаданы
			if (locationCells.isEmpty()) { 
			
				result = "GoodBye(Попал)";	
				// Сообщаем пользователю о потоплении  объекта (Zerg)(
			System.out.println("Ой! Вы попотопили "+ name+ " : ( ");
			}else {
				
				result="Yes(Попал)";
				}// Конец else
		}// Конец if
		
				return result;// Возвращаем "Мимо", "Попал", "Потопил".
	}// Конец метода
}// Конец класса
