import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {

		// 20 random numbers are generated
		int randNum[] = new int[20];
		Random rand = new Random();
		for(int i = 0; i < 20; i++) {
			randNum[i] = rand.nextInt(10000);
		}

		InsertionSort.sort(randNum);

		for(int i = 0; i < randNum.length; i++) {
			System.out.println(randNum[i]);
		}
	}

	public static void sort (int[] array) {

		/**
		* --- Selection Sort Algorithm ---
		*
		* 1. Let the index 'A' be an aligned element.
		* 2. Let the element 'B' after 'A' be the unaligned part.
		* 3. Insert 'B' into 'A'.
		* 4. Compare the value of 'A' with the value of 'B' and if the value of 'B' is small, 
		*    exchange it for 'A'.
		* 5. 'A' and 'B' will be the aligned part.
		* 6. 'B' with the next element 'C' as the unaligned part.
		* 7. Insert 'C' in the aligned part 'A', 'B'.
		* 8. Compare the values of adjacent 'C' and 'B' and if the value of 'C' is small, 
		*    replace it with 'B'.
		* 9. If the value of 'C' is smaller than the value of 'A', 
		*    it is exchanged for 'A'.
		*
		* note : Repeat the above sequentially.
		*
		*/
		for(int i = 0; i < array.length; i++) {
			int j = i;
			while(j >= 1 && array[j-1] > array[j]) {
				int tmp = array[j];
				array[j] = array[j - 1];
				array[j - 1] = tmp;
				j--;
			}
		}
	}
}

//============================================
//               Output Sample
//============================================

// $ javac InsertionSort.java 
// $ java InsertionSort
// 386
// 424
// 655
// 1455
// 1495
// 2214
// 2307
// 3265
// 4246
// 4940
// 5038
// 5502
// 7387
// 7837
// 8186
// 8269
// 9362
// 9558
// 9680
// 9936

//============================================