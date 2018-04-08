
public class Compliment2 {

	 static int getIntegerComplement(int n) {
	        int arr[] = new int[1];
	        int size=0,h=0;
	        int result=0;
	        for (int i=n;i>0;)
	        {
	            arr[size++]=i%2;
	            i=i/2;
	        }
	        for(int x=0;x<size;x++) {
	            if(arr[x]==0) {
	                arr[x]=1;
	            }
	            else
	                arr[x]=0;
	        }
	        for(int y=(size-1);y>=0;y--) {
	            double temp=((Math.pow(2,h))*arr[y]);
	            result=result+(int)temp;
	            h++;
	        }
	        return result;
	    }
	public static void main(String[] args) {
		System.out.println(getIntegerComplement(100));
	}

}
