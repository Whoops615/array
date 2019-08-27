package by.pth.home02.main5;

/*
 * 20. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
(освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */

public class Task20 {

	public static void main(String[] args) {

		int n = 10;
		int[] mas = new int[n];
		Method.randMas(mas);
		Method.print(mas);
		System.out.println("\n---------------------------");

		for (int i = 1; i < mas.length; i = i + 2) {
			mas[i] = 0;
		}
		Method.print(mas);

	}

}
