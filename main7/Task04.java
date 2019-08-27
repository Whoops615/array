package by.pth.home02.main7;

/*
 * 4. Дана матрица. Вывести на экран первую и последнюю строки.
 */

public class Task04 {

	public static void main(String[] args) {

		int[][] mas = new int[4][4];
		Method.masRand(mas, 10);
		Method.print1(mas);

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == 0 | i == mas.length - 1) {
					System.out.print(mas[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
