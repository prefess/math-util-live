/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static com.fu.mathutil.util.SelectionSort.selectionSort;

/**
 *
 * @author Thoai
 */
public class ThoaiSelectionSortTest {
    
	@Test
	public void tesInsertIntoSorted() {
		int[] inputArr = new int[] {1,3,5};
		int[] inputResult = new int[] {1,3,5};
		selectionSort(inputArr);
		assertArrayEquals(inputResult, inputArr);
	}

	@Test
	public void tesInsertIntoSorted2() {
		int[] inputArr = new int[] {5,3,1};
		int[] inputResult = new int[] {1,3,5};
		selectionSort(inputArr);
		assertArrayEquals(inputResult, inputArr);
	}

	@Test
	public void tesInsertIntoSorted3() {
		int[] inputArr = new int[] {4,5,3,2};
		int[] inputResult = new int[] {2,3,4,5};
		selectionSort(inputArr);
		assertArrayEquals(inputResult, inputArr);
	}
    
}
