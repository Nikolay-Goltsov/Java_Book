package ru.nikolas.GameWorld;

public class SimpleDotComTestDrive {

	public static void main(String[] args) {
		
		DotComBust game = new DotComBust();// Создаем игровой объект
//		game.setUpGame();//  Говорим игровому объекту подготовить игру
		// Говорим игровому объекту начать главный игровой цикл 
		// (продолжаем запрашивать пользовательский ввод и проверять полученные данные)
//		game.startPlaying();  

		int numOfGuesses = 0;

		GameHelper helper = new GameHelper();

		// Создаем экземпляр класса SampleDotCom
		DotCom dot = new DotCom();

		int randomNum = (int) (Math.random() * 10);

		// Объявляем целочисленный массив для местонахождения "цели"
//		int[] locations = {2,};

		int[] locations = { randomNum, randomNum + 1, randomNum + 3, randomNum + 4 };

		// Вызваем сеттер "цели"
//		dot.setLocationCells(locations);

		boolean isAlive = true;

		while (isAlive == true) {
			String userInput = helper.getUserInput("Common-->>");

			String result = dot.checkYourseIf(userInput);
			numOfGuesses++;

			if (result.equals("GoodBye")) {
				isAlive = false;
				System.out.println("Вам потребовалось " + numOfGuesses + " попыток");
			}
		}
	}

}
