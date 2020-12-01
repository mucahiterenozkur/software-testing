package q2;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ConcatenateArraysJunitTest {

	@Test
	public void test() {
		ConcatenateArrays ca = new ConcatenateArrays();
		int[] array1 = {1,2,3};
		int[] array2 = {4,5};
		int[] expected = {1,2,3,4,5};
		
		int[] result = ca.ConcatenateTwoArrays();
		
		Assert.assertArrayEquals(result, expected);
	}

}
