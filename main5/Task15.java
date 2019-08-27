package by.pth.home02.main5;

/*
 * 15. Дана последовательность действительных чисел
a1,a2,...,an . Указать те ее элементы, которые принадлежат отрезку
[с, d].
 */

public class Task15 {

	public static void main(String[] args) {
		
		int[] mas = new int[10];
		Method.randMas(mas);
		Method.print(mas);
		System.out.println("\n---------------------------");
		int c = 20;
		int d = 40;
		
		for(int i = 0; i <mas.length;i++) {
			if(mas[i] > c & mas[i] < d) {
				System.out.print(mas[i]+" ");
			}
		}
		

	}

}
