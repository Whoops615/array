package by.pth.home02.main7;

/*
 * 39. Найдите произведение двух матриц.
 */

public class Task39 {

	public static void main(String[] args) {
		
		int[][] mas1 = new int[5][5];
		int[][] mas2 = new int[5][5];

		int[][] mas = new int[5][5];

		Method.masRand(mas1, 10);
		Method.masRand(mas2, 10);

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = mas1[i][j] * mas2[i][j];
			}
		}
		Method.print1(mas);

	}

}
