package Interfaces;

class Animals implements AnimalEat, AnimalTravel {

	public void eat() {
	      System.out.println("Animal is eating");
	   }
	   public void travel() {
	      System.out.println("Animal is travelling");
	   }
	}	

public class MultipleInheritanceByInterface {
	  public static void main(String[] args) {
	      Animals a = new Animals();
	      a.eat();
	      a.travel();
	   }

}

