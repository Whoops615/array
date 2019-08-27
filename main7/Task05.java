package by.pth.home02.main7;

/*
 * 5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.
 */

public class Task05 {

	public static void main(String[] args) {

		int[][] mas = new int[5][5];
		Method.masRand(mas, 15);
		Method.print1(mas);

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i % 2 == 0) {
					System.out.print(mas[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

}
