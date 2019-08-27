package by.pth.home02.main7;

/*
 * 36. Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой получается
как среднее арифметическое соседей соответствующего элемента исходной матрицы. Построить результат
сглаживания заданной матрицы
 */

public class Task36 {

	public static void main(String[] args) {

		int[][] mas = new int[6][6];
		Method.masRand(mas, 20);
		Method.print1(mas);
		double[][] mas2 = new double[6][6];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == 0 & j == 0) {
					mas2[i][j] = arifmetic(mas[i][j + 1], mas[i + 1][j]);
				} else if (i == 0 & j == mas[i].length - 1) {
					mas2[i][j] = arifmetic(mas[i][j - 1], mas[i + 1][j]);
				} else if (i == 0) {
					mas2[i][j] = arifmetic(mas[i][j - 1], mas[i][j + 1], mas[i + 1][j]);
				} else if (i == mas.length - 1 & j == 0) {
					mas2[i][j] = arifmetic(mas[i - 1][j], mas[i][j + 1]);
				} else if (i == mas.length - 1 & j == mas[i].length - 1) {
					mas2[i][j] = arifmetic(mas[mas.length - 2][j], mas[i][mas[i].length - 2]);
				} else if (j == 0) {
					mas2[i][j] = arifmetic(mas[i - 1][j], mas[i + 1][j], mas[i][j + 1]);
				} else if (i == mas.length - 1) {
					mas2[i][j] = arifmetic(mas[i][j - 1], mas[i][j + 1], mas[i - 1][j]);
				} else if (j == mas[i].length - 1) {
					mas2[i][j] = arifmetic(mas[i - 1][j], mas[i + 1][j], mas[i][j - 1]);
				} else {
					mas2[i][j] = arifmetic(mas[i - 1][j], mas[i + 1][j], mas[i][j - 1], mas[i][j + 1]);
				}
			}
		}

		printD(mas2);

	}

	public static void printD(double[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%5.2f\t", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	public static double arifmetic(int... mas) {

		int sum = 0;
		double arif = 0;
		for (int i = 0; i < mas.length; i++) {
			sum = sum + mas[i];
		}
		arif = (double) sum / mas.length;
		return arif;
	}

}
