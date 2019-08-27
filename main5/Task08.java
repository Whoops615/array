package by.pth.home02.main5;

/*
 * 8. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
 */

public class Task08 {

	public static void main(String[] args) {

		int[] mas = new int[] { -1, -2, 0, 0, 0, 0, 3, 4, -5, -4, 0, 3, 4, 5 };
		Method.print(mas);
		System.out.println("\n------------------------------");

		int positiv = 0;
		int negativ = 0;
		int noliki = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > 0) {
				positiv++;
			} else if (mas[i] < 0) {
				negativ++;
			} else {
				noliki++;
			}
		}
		System.out.println("Положительных элементов: " + positiv);
		System.out.println("Отрицательных элементов: " + negativ);
		System.out.println("Нулевых элементов: " + noliki);

	}

}
