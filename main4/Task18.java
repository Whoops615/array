package by.pth.home02.main4;

/*
 * 18. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
(например, 1234, 5789). Для  задачи использовать декомпозицию.
 */

public class Task18 {

	public static void main(String[] args) {

		int k;
		int temp = 10;
		boolean a = false;
		int j = 0;

		for (int i = 100; i < 1000; i++) {
			j = i;
			temp = 10;
			while (j > 0) {
				k = j % 10;
				j = (j - k) / 10;

				if (k < temp) {
					temp = k;
					a = true;
				} else {
					a = false;
					break;
				}
			}
			if (a == true) {
				System.out.println(i);
			}
		}
	}
}
