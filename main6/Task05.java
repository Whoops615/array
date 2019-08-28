package by.pth.home02.main6;

/*
 * 5. Сортировка вставками.
 */

public class Task05 {

	public static void main(String[] args) {
		
		
		int[] mas = new int[10];
		Method.randMas(mas);
		Method.print(mas);
		
		for (int left = 0; left < mas.length; left++) {
			// Вытаскиваем значение элемента
			int value = mas[left];
			// Перемещаемся по элементам, которые перед вытащенным элементом
			int i = left - 1;
			for (; i >= 0; i--) {
				// Если вытащили значение меньшее — передвигаем больший элемент дальше
				if (value < mas[i]) {
					mas[i + 1] = mas[i];
				} else {
					// Если вытащенный элемент больше — останавливаемся
					break;
				}
			}
			// В освободившееся место вставляем вытащенное значение
			mas[i + 1] = value;
		}
		Method.print(mas);

	}

}
