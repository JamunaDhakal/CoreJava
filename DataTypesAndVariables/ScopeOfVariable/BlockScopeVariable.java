package ScopeOfVariable;

public class BlockScopeVariable {
	
	public static void main(String[] args) {
	{
		int x;
        for (x = 0; x < 4; x++)
        {
            System.out.println(x);
        }

       System.out.println(x);
    }
	
	}

}
