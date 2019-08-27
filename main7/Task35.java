package by.pth.home02.main7;

/*
 * 35. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

public class Task35 {

	public static void main(String[] args) {

		int[][] mas = new int[5][5];
		Method.masRand(mas, 10);
		Method.print1(mas);

		int max = Method.max(mas);
		System.out.println("Наибольший элемент: " + max);
		System.out.println("-------------------------");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] % 2 != 0) {
					mas[i][j] = max;
				}
			}
		}

		Method.print1(mas);

	}

}
