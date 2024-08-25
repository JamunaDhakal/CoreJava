package Class;

class Student implements Cloneable {
	
	private int rollNo;
	private String name;
	
	private Student(int no, String name) {
		this.rollNo = no;
		this.name = name;
}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public static void main(String[] args) {
		try {
			
			Student st = new Student(123,"joh");
			Student st1 = (Student)st.clone();
			System.out.print(st.rollNo + " " + st.name);
			System.out.print(st1.rollNo + " " + st1.name);
			
		} 
		
		catch(CloneNotSupportedException c) {
			
		}
	
	}
}
