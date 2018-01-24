package operations;

public class Plus extends Operation{
	
	public Plus(int a, int b){
		super(a, b);
	}
	
	public int compute(){
		return a + b;
	}
}
