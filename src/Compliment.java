public class Compliment {

	static int[] convertToBinary(int n)
	{
		int remainder = 0;
		String remainderString = "";
		while(n>0)
			{
			remainder = n%2;
			n=n/2;
			remainderString = remainder + remainderString;
			}
		String [] ar=remainderString.split("");
		int arr[]= new int[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			arr[i] = Integer.parseInt(ar[i]);
		}
		return arr;
	}
	
	static int[] compliment(int n[])
	{
		for(int i=0;i<n.length;i++)
		{
			if(n[i]==1)
				n[i]=0;
			else if(n[i]==0)
				n[i]=1;
			else
				System.out.println("FATT GYA");
		}
		return n;
	}
	
	static int convertToDecimal(int n[])
	{
		int number = 0;
		for (int i = 0; i < n.length; i++) {
//			number+=Math.pow(2, i)*a.charAt(a.length()-i-1);
			double powerOfTwo = Math.pow(2, i);
			int valueAtIndex = Character.getNumericValue(n[n.length-i-1]);
			number = (int) (number + (powerOfTwo*valueAtIndex));
			System.out.println("i:"+i+"\t"+powerOfTwo+"\t"+valueAtIndex+"\t"+number);
		}
		return number;
	}
	static int getIntegerCompilment(int n)
	{
		int[] binaryNumber = convertToBinary(n);
		System.out.println("Binary:"+binaryNumber);
		int[] complimentInBinary = compliment(binaryNumber);
		System.out.println("Compliment of Binary:"+complimentInBinary);
		return convertToDecimal(complimentInBinary);
	}
	
	public static void main(String[] args) {
		System.out.println(getIntegerCompilment(100));
	}

}
