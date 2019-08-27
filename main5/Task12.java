package by.pth.home02.main5;

/*
 * 12. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются
простыми числами.
 */

public class Task12 {

	public static void main(String[] args) {

		int[] mas = new int[12];
		Method.randMas(mas);
		Method.print(mas);
		System.out.println("\n------------------------------");
		System.out.print("Нужные элементы: ");

		int summa = 0;
		int divider;
		boolean a = false;
		
		
		// Метод "перебора делителей" для нахождения простых чисел;

		for (int i = 0; i < mas.length; i++) {

			if (i == 2 || i == 3) {
				summa += mas[i];
				System.out.print(i + " ");
			} else if (i > 1) {
				divider = (int) Math.sqrt(i);
				for (int j = 2; j <= divider; j++) {
					if (i % j != 0) {
						a = true;

					} else {
						a = false;
						break;
					}
				}
				if (a == true) {
					summa += mas[i];
					System.out.print(i + " ");
				}
			} else;

		}
		System.out.println("\n------------------------------");
		System.out.println("Сумма: " + summa);

	}

}
