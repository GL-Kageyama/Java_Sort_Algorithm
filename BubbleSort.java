import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {

		// 20 random numbers are generated
		int randNum[] = new int[20];
		Random rand = new Random();
		for(int i = 0; i < 20; i++) {
			randNum[i] = rand.nextInt(10000);
		}

		BubbleSort.sort(randNum);

		for(int i = 0; i < randNum.length; i++) {
			System.out.println(randNum[i]);
		}
	}

	public static void sort(int[] array) {
		int tmp;

		/**
		* --- Bubble Sort Algorithm ---
		*
		* 1. Compare the value of the first element 'A' with the value of the next element 'B' next to it.
		* 2. If element 'A' is greater than element 'B', exchange the value of element 'A' for element 'B'.
		* 3. Moves the first element to 'B' and compares/exchanges the value of element 'B' with its neighbour 'C'.
		* 4. Repeat the comparison/exchange until the end of the list, 
		*    moving the first element to 'C', 'D', 'E'... and so on until the end of the list..
		* 5. The element with the highest value is placed at the end of the list.
		* 6. Since the end of the list contains the largest value, 
		*    reduce the number of elements by one and repeat steps 1 to 5.
		*
		*/
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length - i - 1; j++) {
				if(array[j] > array[j + 1]) {
					tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
	}
}

//============================================
//               Output Sample
//============================================

// $ javac BubbleSort.java 
// $ java BubbleSort
// 153
// 202
// 1001
// 1135
// 1621
// 2268
// 2304
// 2700
// 3833
// 3915
// 4379
// 5275
// 5370
// 6238
// 6721
// 7231
// 8267
// 8700
// 8881
// 9042

//============================================