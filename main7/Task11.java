package by.pth.home02.main7;

/*
 * 11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая
строка слева направо, третья строка справа налево и так далее.
 */

public class Task11 {

	public static void main(String[] args) {

		int m = 5;
		int n = 5;
		int[][] mas = new int[m][n];

		Method.masRand(mas, 9);
		Method.print1(mas);

		System.out.println("Новая матрица:");

		for (int i = 0; i < m; i++) {
			if (i % 2 == 0) {
				for (int j = n - 1; j >= 0; j--) {
					System.out.print(mas[i][j] + "   ");
				}
			} else {
				for (int j = 0; j < n; j++) {
					System.out.print(mas[i][j] + "   ");
				}
			}
			System.out.println();
		}
	}
}
