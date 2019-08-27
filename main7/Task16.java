package by.pth.home02.main7;

/*
 * 16. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */

public class Task16 {

	public static void main(String[] args) {

		int n = 6;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					mas[i][j] = (i + 1) * (i + 2);
				}
			}
		}

		Method.print1(mas);

	}

}
