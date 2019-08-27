package by.pth.home02.main7;

/*
 * 9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

public class Task09 {

	public static void main(String[] args) {

		int[][] mas = new int[5][5];
		Method.masRand(mas, 10);
		Method.print1(mas);

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					System.out.print(mas[i][j] + " ");
				}
			}
		}
	}
}
