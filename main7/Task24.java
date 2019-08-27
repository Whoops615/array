package by.pth.home02.main7;

/*
 * 24. Дан линейный массив x1, x2,, xn−1, xn . Получить действительную квадратную матрицу порядка n:
 */

public class Task24 {

	public static void main(String[] args) {

		int x = 2;
		int n = 6;

		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) Math.pow(x, i + 1);
			}
		}

		Method.print1(mas);

	}

}
