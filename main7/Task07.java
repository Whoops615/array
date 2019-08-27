package by.pth.home02.main7;

/*
 * 7. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.
 */

public class Task07 {

	public static void main(String[] args) {

		int[][] mas = new int[][] { 
			{ 1, 1, 1, -2, 1 }, 
			{ 1, -1, 1, 1, 1 }, 
			{ 1, 1, 1, -7, 1 }, 
			{ 1, -1, 1, -9, 1 },
			{ 1, 1, 1, 1, 1 } 
			};

		Method.print1(mas);

		int sum = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i % 2 != 0 & j % 2 != 0) {
					sum = sum + Math.abs(mas[i][j]);

				}
			}
		}
		System.out.println("Сумма модулей нечетных элементов: " + sum);
	}
}
