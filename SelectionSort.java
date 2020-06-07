import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {

		// 20 random numbers are generated
		int randNum[] = new int[20];
		Random rand = new Random();
		for(int i = 0; i < 20; i++) {
			randNum[i] = rand.nextInt(10000);
		}

		SelectionSort.sort(randNum);

		for(int i = 0; i < randNum.length; i++) {
			System.out.println(randNum[i]);
		}
	}

	public static void sort(int[] array) {

		/**
		* --- Selection Sort Algorithm ---
		*
		* 1. Let the first element of the array be "A0", the element with a provisional minimum value.
		* 2. Comparing "A0" with other elements other than "A0", 
		*    the element "A1" with a value less than "A0" is If we find them, we'll trade "A0" for "A1".
		* 3. Repeat 2. "A0" is set to the minimum value in the array.
		* 4. Do operations 2. and 3. on the elements of "A1" and "A2" and so on.
		*
		*/
		for(int i = 0; i < array.length; i++) {
			int index = i;
			for (int j = i + 1; j < array.length; j++) {
				if(array[j] < array[index]) {
					index = j;
				}
			}
			if(i != index) {
				int tmp = array[index];
				array[index] = array[i];
				array[i] = tmp;
			}
		}
	}
}

//============================================
//               Output Sample
//============================================

// $ javac SelectionSort.java 
// $ java SelectionSort
// 11
// 288
// 1007
// 1485
// 2436
// 3069
// 3198
// 3506
// 3550
// 4017
// 4126
// 5140
// 5155
// 6809
// 6922
// 6938
// 8247
// 8314
// 8407
// 8851

//============================================