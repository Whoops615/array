package by.pth.home02.main7;

/*
 * 29. Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class Task29 {

	public static void main(String[] args) {

		int n = 6;
		int[][] mas = new int[n][n];

		Method.masRand(mas, 10);
		Method.print1(mas);

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j & mas[i][j] > 0) {
					System.out.print(mas[i][j] + " ");
				}
			}
		}

	}

}
