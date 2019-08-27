package by.pth.home02.main7;

/*
 * 10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Task10 {

	public static void main(String[] args) {

		int[][] mas = new int[5][5];

		int column = 3;
		int line = 2;
		Method.masRand(mas, 10);
		Method.print1(mas);

		System.out.print("Строка " + line + " : ");
		line(mas, line);
		System.out.println("\n-------------------------");
		System.out.print("Столбец " + column + " : ");
		column(mas, column);

	}

	public static void line(int[][] mas, int line) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == line) {
					System.out.print(mas[i][j] + " ");
				}
			}
		}
	}

	public static void column(int[][] mas, int column) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (j == column) {
					System.out.print(mas[i][j] + " ");
				}

			}
		}
	}

}
