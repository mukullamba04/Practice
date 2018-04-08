import java.util.Arrays;

public class numberOfPlatform {

	public static void main(String[] args) {
		int arr[] = {900, 940, 950, 1100, 1500, 1800};
		int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
		
		int maxTrainsAtOneTime[] = new int [arr.length];
		
		for(int i=0;i<dep.length;i++)
		{
			maxTrainsAtOneTime[i]=1;
			for(int j=0;j<arr.length;j++)
			{
				if(dep[i]>arr[j] && dep[j]>dep[i])
					maxTrainsAtOneTime[i]++;
			}
		}
		Arrays.sort(maxTrainsAtOneTime);
		
		System.out.println("Platforms needed:" + maxTrainsAtOneTime[arr.length-1]);
	}

}
