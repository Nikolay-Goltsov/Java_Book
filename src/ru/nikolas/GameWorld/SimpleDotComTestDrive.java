package ru.nikolas.GameWorld;

public class SimpleDotComTestDrive {

	public static void main(String[] args) {
		
		DotComBust game = new DotComBust();// ������� ������� ������
//		game.setUpGame();//  ������� �������� ������� ����������� ����
		// ������� �������� ������� ������ ������� ������� ���� 
		// (���������� ����������� ���������������� ���� � ��������� ���������� ������)
//		game.startPlaying();  

		int numOfGuesses = 0;

		GameHelper helper = new GameHelper();

		// ������� ��������� ������ SampleDotCom
		DotCom dot = new DotCom();

		int randomNum = (int) (Math.random() * 10);

		// ��������� ������������� ������ ��� ��������������� "����"
//		int[] locations = {2,};

		int[] locations = { randomNum, randomNum + 1, randomNum + 3, randomNum + 4 };

		// ������� ������ "����"
//		dot.setLocationCells(locations);

		boolean isAlive = true;

		while (isAlive == true) {
			String userInput = helper.getUserInput("Common-->>");

			String result = dot.checkYourseIf(userInput);
			numOfGuesses++;

			if (result.equals("GoodBye")) {
				isAlive = false;
				System.out.println("��� ������������� " + numOfGuesses + " �������");
			}
		}
	}

}
