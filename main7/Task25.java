package by.pth.home02.main7;

/*
 * 25. Получить квадратную матрицу порядка n:
 */

public class Task25 {

	public static void main(String[] args) {

		int n = 6;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = i * n + j + 1;
			}
		}

		Method.print1(mas);

	}

}
