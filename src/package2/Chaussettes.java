package package2;

public class Chaussettes{
	boolean chaudes;
	boolean sales;
	
	public Chaussettes(){
		chaudes = true;
		sales = false;
	}
	
	public static void main(String[] args){
		System.out.println("les chaussettes sont elles chaudes ?");
		System.out.println(new Chaussettes().chaudes);
	}
}
