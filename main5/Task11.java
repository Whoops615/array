package by.pth.home02.main5;

/*
 * 11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1).
 */

public class Task11 {

	public static void main(String[] args) {
		
		int[] mas = new int[] {1,2,3,4,5,6,7,8,9,10};
		int m = 3;
		int l = 2;
		
		for(int i = 0;i<mas.length;i++) {
			if(mas[i] % m == l) {
				System.out.print(mas[i] + " ");
			}
		}

	}

}
