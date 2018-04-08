class A
{
	int a = 10;
}


class B
{
	int a = 10;
}

public class example {
	int I[] = { 0 };
	static A newA = new A();
	static B newB = new B();
	
	public static void main(String args[]) {
		int i[] = { 1 };
		change_i(i);
		change_2(newA.a);
		change_3(newB);
		System.out.println(i[0]);
		System.out.println(newA.a);
		System.out.println(newB.a);
	}

	public static void change_i(int i[]) {
		int j[] = { 2 };
		i[0] = j[0];
	}
	
	public static void change_2(int i) {
		int j = 2;
		i = j;
	}
	
	public static void change_3(B Breference) {
		int j = 2;
		Breference.a = j;
	}
}