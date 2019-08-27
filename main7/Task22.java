package by.pth.home02.main7;

/*
 * 22. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */

public class Task22 {

	public static void main(String[] args) {

		int n = 6;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i + j < n - 1) {
					mas[i][j] = i + j + 1;
				}
				if (i + j == n - 1) {
					mas[i][j] = n;
				}
			}
		}

		Method.print1(mas);

	}

}
