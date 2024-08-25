package Inheritance;

class Book{

	public void bookMethod() {
		System.out.print(" Book" +"\n");
	}
	
}

class Science extends Book{
	
	public void scienceBook() {
		System.out.print("science book " +"\n");
	}
}


class Math extends Science{
	
	public void mathBook() {
		System.out.print("math book" +"\n");
	}
}



public class MultiLeverInheritance {
	
	public static void main(String[] args) {
		Math mt = new Math();
		mt.mathBook();
		mt.scienceBook();
		mt.bookMethod();

	}

}
