package session011;

import java.util.Arrays;

/*
 * 23.5643456789
 * 12.5748453
 * 
 */
public class BigNumberAddition {

	public static void main(String[] args) {
		
		String num1 = "5566.548484165";
		String num2 = "4511681.161681868168";			  
		
		// 1. convert the given Strings into char arrays
		char[] chars1 = num1.toCharArray();
		char[] chars2 = num2.toCharArray();
		
		// 2. convert the char arrays into num arrays
		int[] nums1 = charArrayToIntArray( chars1 );
		int[] nums2 = charArrayToIntArray( chars2 );
		
		// 3. bring both arrays to the same length on both sides of decimal point
		int indexOfDot1 = num1.indexOf('.');
		int indexOfDot2 = num2.indexOf('.');
		if (indexOfDot1 != indexOfDot2) {
			
			if (indexOfDot1 > indexOfDot2) {
				int diff = indexOfDot1 - indexOfDot2;
				nums2 = addZerosBeforeDot( nums2, diff );
			} else {
				int diff = indexOfDot2 - indexOfDot1;
				nums1 = addZerosBeforeDot( nums1, diff );
			}
		}
		
		if (nums1.length != nums2.length) {
			
			if (nums1.length > nums2.length) {
				nums2 = Arrays.copyOf(nums2, nums1.length);
			} else {
				nums1 = Arrays.copyOf(nums1, nums2.length);
			}
		}
		
		// 4. add 'synchronized' arrays, each number individually
		//	a. consider additions that end up to be more than 10
		//	b. consider -2, skip it before it represents decimal point
		int[] result = addSynchronizedArrays( nums1, nums2 );
		
		// 5. HOW do you want to see the result?
		String finalResult = finalConversionToString( result );
		finalResult = finalResult.startsWith("0") ? finalResult.substring(1) : finalResult;
		
System.out.println( Arrays.toString( nums1 ) );
System.out.println( Arrays.toString( nums2 ) );
System.out.println( Arrays.toString( result ) );
System.out.println( finalResult );
	}
	
	
	public static String finalConversionToString( int[] nums ) {
		String ret = "";
		
		for (int i = 0; i < nums.length; i++) {
			ret = ret + (( nums[i] == -2 ) ? "." : nums[i]);
		}
		
		return ret;
	}
	
	
	public static int[] addSynchronizedArrays(int[] nums1, int[] nums2) {
		int[] ret = new int[nums1.length + 1];
		
		int extra = 0;
		for (int i = nums1.length - 1; i >= 0; i--) {
			if (nums1[i] == -2) {
				ret[i + 1] = -2;
				continue;
			}
			
			int sum = nums1[i] + nums2[i] + extra;
			extra = 0;
			
			if (sum > 9) {
				ret[i + 1] = sum - 10;
				extra = extra + 1;
			} else {
				ret[i + 1] = sum;
			}
		}
		
		if (extra > 0) {
			ret[0] = extra;
		}
		
		return ret;
	}
	
	
	public static int[] addZerosBeforeDot(int[] nums, int diff) {
		int[] ret = new int[nums.length + diff];
		
		for (int i = diff; i < ret.length; i++) {
			ret[i] = nums[i - diff];
		}
		
		return ret;
	}
	
	public static int[] charArrayToIntArray(char[] chars) {
		int[] toReturn = new int[ chars.length ];
		
		for (int i = 0; i < chars.length; i++) {
			toReturn[i] = (int) (chars[i] - '0');
		}
		
		return toReturn;
	}
}
