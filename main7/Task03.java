package by.pth.home02.main7;

/*
 * 3. Дана матрица. Вывести на экран первый и последний столбцы.
 */

public class Task03 {

	public static void main(String[] args) {

		int[][] mas = new int[3][4];
		Method.masRand(mas, 10);
		Method.print1(mas);

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (j == 0 | j == mas[i].length - 1) {
					System.out.print(mas[i][j] + "  ");
				}

			}
			System.out.println();
		}
	}

}
