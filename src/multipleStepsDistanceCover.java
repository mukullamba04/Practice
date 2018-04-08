import java.util.Arrays;
import java.util.Collections;

public class multipleStepsDistanceCover {

	static int waysCalculator(Integer small[], int big)
	{
		int ways=0;
		Arrays.sort(small, Collections.reverseOrder());
		
		
		
		return ways;
	}
	
	public static void main(String[] args) {
		Integer[] steps = {1,2,3};
		int totalDistance = 3;
		System.out.println("Total ways:" + waysCalculator(steps, totalDistance));
	}

}
