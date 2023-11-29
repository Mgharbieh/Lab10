/*
 * testSelectionSort.java
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */


import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;


public class testSelectionSort {
	
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}
	
	public testSelectionSort() {
	}

	public void testPositive(){
		/** added for github commit **/
		SelectionSort obj = new SelectionSort();

		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;
		
		int[] resultArr = obj.basicSelectionSort(arr);
		assertArrayEquals(Sortedarr, resultArr);
	}
	public void testNegative(){
		/** added for github commit **/
		SelectionSort obj = new SelectionSort();
		
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -9;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = -2;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -9;
		Sortedarr[2] = -8;
		Sortedarr[3] = -7;
		Sortedarr[4] = -2;
		/** Test data contains negative values only **/
		
		int[] resultArr = obj.basicSelectionSort(arr);
		assertArrayEquals(Sortedarr, resultArr);
	}
	
	public void testMixed(){
		/** Test data contains with both positive, negative and zeros **/
		/** added for github commit **/
		SelectionSort obj = new SelectionSort();
		
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = 9;
		arr[2] = -17;
		arr[3] = 100;
		arr[4] = 0;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -17;
		Sortedarr[1] = -8;
		Sortedarr[2] = 0;
		Sortedarr[3] = 9;
		Sortedarr[4] = 100;
		/** Test data contains negative values only **/
		
		int[] resultArr = obj.basicSelectionSort(arr);
		assertArrayEquals(Sortedarr, resultArr);
	}
	
	public void testDuplicates(){
		/** Test data contains duplicates **/
		/** added for github commit **/
		SelectionSort obj = new SelectionSort();
		
		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = 27;
		arr[2] = -7;
		arr[3] = -42;
		arr[4] = 5;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -42;
		Sortedarr[1] = -7;
		Sortedarr[2] = 5;
		Sortedarr[3] = 5;
		Sortedarr[4] = 27;
		/** Test data contains negative values only **/
		
		int[] resultArr = obj.basicSelectionSort(arr);
		assertArrayEquals(Sortedarr, resultArr);
		
	}

}
