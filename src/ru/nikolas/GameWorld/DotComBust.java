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
//Объявляем и инициализируем переменные, которые нам понадобятся
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();// Создаем ArrayList только для объектов DotCom
	private int numOfGuesses = 0;

	private void setUpGame() {
//		Создаем несколько объектов для уничтожения и присвоим им адреса
//		Создаем три объекта DotCom, даем им имена и перемещаем их в ArrayList.
		DotCom one = new DotCom();
		one.setName("Zerg_1");
		DotCom two = new DotCom();
		two.setName("Zerg_2");
		DotCom three = new DotCom();
		three.setName("Zerg_3");
		dotComList.add(one);
		dotComList.add(two);
		dotComList.add(three);
//		Вывод кратких инструкций для пользователя
		System.out.println("Ваша цель потопить три объекта.");
		System.out.println("Zerg_1, Zerg_2, Zerg_3");
		System.out.println("Попытайтесь потопить их за минимальное количество ходов");

		for (DotCom dotComToSet : dotComList) {// повторять с каждым объектом DotCom в списке
			// Запрашиваем у вспомогательного объекта адрес объекта типа Zeng...
//			ArrayList<String> newLocation = helper.placeDotCom(3);
			// Вызывает сеттер из объекта DotCom, чтобы передать ему местоположение, которое
			// только что получили от вспомогательного объекта
//			dotComToSet.setLocationCells(newLocation);
		} // Конец цикла
	}// Конец метода setUpGame

	private void startPlaying() {
		while (!dotComList.isEmpty()) {// Повторять пока список объектов DotCom не станет пустым
			// Получаем пользовательский ввод
			String userGuess = helper.getUserInput("Сделай ход !.");
//			checkUserGuess(userGuess);// Вызываем наш метод checkUserGuess
		} // Конец while
		finishGame();// Вызваем наш метод finishGame
	}// Конец метода startPlaying.

	private void chechUserGuess(String userGuess) {
		numOfGuesses++;// Инкриментировать количество попыток, которые сделал пользователь
		String result = "Мимо"; // Подразумевает промах, пока не выявили обратного
		// Проверяем для всех оъектов DotCom в списке
		for (DotCom dotComToTest : dotComList) {
			// Просим DotCom проверить ход пользователя, ищем попадание или потопление
			result = dotComToTest.checkYourseIf(userGuess);
			if (result.equals("Попал")) {
				break;//Выбераемся из цикла раньше времени, нет смысла проверять другие объекты.
			}
			if (result.equals("Потопил")) {
				dotComList.remove(dotComToTest);// Если Zerg пришел конец удаляем его из списков объектов
				break;
			}
		}// Конец for
		System.out.println(result);// Выводим для пользователя результат 

	}// Конец метода
	// Выводим сообщение как пользователь окончил игру
	private void finishGame() {
		System.out.println("Все Zerg \"i\" ушли ко дну! Ваши акции теперь нечего не стоят.  ");
		if (numOfGuesses<=18) {
			System.out.println("Это заняло у Вас всего "+ numOfGuesses+ " попыток(и).");
			System.out.println("Вы успели выбраться до того, как Ваши вложения утонули");
			}else {
				System.out.println("Это заняло у Вас довольно много времени. "+numOfGuesses+ " попыток(и).");
				System.out.println("Рыбы водят хороводы вокруг Ваших вложений.");
			}
	} // Конец метода
}
