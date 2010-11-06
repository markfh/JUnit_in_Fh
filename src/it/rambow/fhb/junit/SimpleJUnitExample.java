package it.rambow.fhb.junit;

public class SimpleJUnitExample {

	public int getLargestNumber(int[] list) {
		int max = 0;
		for(int i = 0; i < list.length-1; i++) {
			if(list[i] > max) {
				max = list[i];
			}
		}
		return max;
	}

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getSmallestNumber(int[] list) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < list.length; i++) {
			if(list[i] < min) {
				min = list[i];
			}
		}
		return min;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
	public int getLargestNumber(int[] list) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < list.length-1; i++) {
			if(list[i] > max) {
				max = list[i];
			}
		}
		return max;
	}

	public int getSmallestNumber(int[] list) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < list.length; i++) {
			if(list[i] < min) {
				min = list[i];
			}
		}
		return min;
	}
*/
}
