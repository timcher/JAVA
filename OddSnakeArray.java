/* Создать массив из всех нечетных чисел от 1 до 40, вывести его на экран
в строку, а затем этолт же массив вывести на экран тоже в строку, но в обратном порядке
*/
class OddSnakeArray {
	public static void main (String args[]) {
		int i;
		int a = 0;
		int b;
		for (i = 1; i <= 40; i++) {
			if (i%2 != 0) a++;
		}
		int OddSnakeArray[] = new int[a];
		for (i = 1, b = 0; i <= 40; i++) {
			if (i%2 != 0) {
				OddSnakeArray[b] = i;
				System.out.print(OddSnakeArray[b] + " ");
				b++;
			}
		}
		System.out.println(" ");
		for (i = OddSnakeArray.length-1; i >= 0; i--) {
			System.out.print(OddSnakeArray[i] + " ");
		}
	}
}