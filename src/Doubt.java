class Book {
	String title;
	static int bookCopies = 100;
	@Override
	public String toString() {
		return title + ", Copies:" + bookCopies;
	}
}

class CourseBook extends Book {
	static int bookCopies = 99999;
	@Override
	public String toString() {
		return title + ", Copies:" + bookCopies;
	}

}

public class Doubt{
	public static void main(String[] args) {
		CourseBook b = new CourseBook();
		b.title = "sample";

		System.out.println("1)"+b);
		System.out.println("2)"+b.title + " and " + b.bookCopies);
	}
}