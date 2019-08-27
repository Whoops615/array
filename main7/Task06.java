package by.pth.home02.main7;

/*
 * 6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

public class Task06 {

	public static void main(String[] args) {

		int[][] mas = new int[3][8];
		Method.masRand(mas, 10);
		Method.print1(mas);

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (j % 2 != 0) {
					if (mas[0][j] > mas[mas.length - 1][j]) {
						System.out.printf("mas[%d][%d]=%-6d", i, j, mas[i][j]);
					}
				}
			}
			System.out.println();
		}
	}
}
