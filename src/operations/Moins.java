package operations;

public class Moins extends Operation{
	
	public Moins(int a, int b) {
		super(a, b);
	}

	public int compute(){
		return a - b;
	}
}
