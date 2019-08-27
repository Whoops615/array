package by.pth.home02.main4;

/*
 * 7. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из
пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */

public class Task07 {

	public static void main(String[] args) {

		int[] mas = new int[] { 2, 1, 1, 6, 7, 3, 5, -14, 2, 2 };
		double result;
		result = maxRange(mas);
		System.out.println("Максимальное расстояние между точками: " + result);
		
		

	}

	public static double maxRange(int[] mas) {

		double range1 = 0;
		double range2 = 0;
		double range3 = 0;
		double maxrange = range(mas[0], mas[1], mas[2], mas[3]);

		for (int i = 0; i < mas.length - 2; i = i + 2) {
			range1 = range(mas[i], mas[i + 1], mas[i + 2], mas[i + 3]);
			for (int j = 0; j < mas.length - 2; j = j + 2) {
				range2 = range(mas[j], mas[j + 1], mas[j + 2], mas[j + 3]);

				if (range1 >= range2) {
					range3 = range1;
				} else {
					range3 = range2;
				}
				if (maxrange >= range3) {
				} else {
					maxrange = range2;
				}
			}
		}

		return maxrange;
	}

	public static double range(int x1, int y1, int x2, int y2) {

		double range;
		range = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow(y1 - y2, 2));
		return range;
	}

}
