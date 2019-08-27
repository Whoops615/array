package by.pth.home02.main5;

/*
 * 6. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа.
 */

public class Task06 {

	public static void main(String[] args) {

		int[] mas = new int[10];
		Method.randMas(mas);
		Method.print(mas);
		System.out.println("\n------------------------------");
		int max = 0;

		for (int i = 0; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
			}
		}
		System.out.println("Наименьшая длинна числовой оси: " + max);

	}
}
