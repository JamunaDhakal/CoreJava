package Interfaces;

class English implements StudentBook {
	
	public void study() {
		System.out.print("They are trying to solve the problem");
	}
	
}

class Computer implements StudentBook{
	
	public void study() {
		System.out.print("They are trying to solve the problem11");
	}
	
}



public class Interfaces {
	
	public static void main(String[] args) {
		Computer b = new  Computer();
		English sb = new  English();
		b.study();
		sb.study();
	}

}
