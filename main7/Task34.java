package by.pth.home02.main7;

/*
 * 34. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.
 */

public class Task34 {

	public static void main(String[] args) {

		int n = 5;
		int m = 6;

		int[][] mas = new int[n][m];
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				count = j;
				for (int k = 0; k < mas.length; k++) {

					if (count == 0) {

					} else {
						mas[k][j] = 1;
						count--;
					}
				}
			}
		}

		Method.print1(mas);

	}

}
