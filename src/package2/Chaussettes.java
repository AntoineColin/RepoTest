package package2;

public class Chaussettes {
	boolean chaudes;
	
	
	public Chaussettes(){
		chaudes = true;
	}
	
	public static void main(String[] args){
		System.out.println("les chaussettes sont elles chaudes ?");
		System.out.println(new Chaussettes().chaudes);
		System.out.println("mais elle grattent");
	}
}
