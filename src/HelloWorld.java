class abc {
	abc() {
		System.out.println("abc2");
	}

	{
		System.out.println("abc1");
	}

	public void overload() {
		System.out.println("A");
	}
}

public class HelloWorld extends abc {
	HelloWorld() {
		System.out.println("HW2");
	}

	{
		System.out.println("HW1");
	}

	public void overload(int a) {
System.out.println("B");
	}

	public static void main(String[] args) {
		System.out.println("START");
		HelloWorld x = new HelloWorld();
		System.out.println("END");
		x.overload();
		x.overload(10);
	}
}