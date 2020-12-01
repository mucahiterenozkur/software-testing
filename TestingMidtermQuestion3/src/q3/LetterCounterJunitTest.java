package q3;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class LetterCounterJunitTest {

	@Test
	public void test() {
		LetterCounter lc = new LetterCounter();
		
		String example = "12Mucahit '^!+ereN /)==?)/ozKur >£#½6{[]";
		int noOfVowels = 7;  // according to my example string        
		int noOfConsonants = 9;   // according to my example string      
		
		int[] result = lc.CountLetters(); // result[0] = vowels .. result[1] = consonants
		
		Assert.assertTrue(noOfVowels == result[0] && noOfConsonants == result[1]);
	}

}
