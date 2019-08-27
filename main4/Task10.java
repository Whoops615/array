package by.pth.home02.main4;

/*
 * 10. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */

public class Task10 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i =1; i<=9; i = i+2) {
			sum = sum + fact(i);
		}
		
		System.out.println("Сумма: " + sum);

	}

	public static int fact(int x) {

		int fact = 1;
		if (x == 0 || x == 1) {
			fact = x;
		} else {
			for (int i = 1; i <= x; i++) {
				fact = fact * i;
			}
		}
		return fact;
	}
}
