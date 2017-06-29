package Day2;

class Developer{
	static int count=0;
	
	String name;

	public Developer(String name) {
		Developer.count ++;
		this.name = name;
	}
	
	public static int getCount(){
		return Developer.count;
	}
		
}

public class UnderstandingStatic {

	public static void main(String[] args) {
		
		Developer d1 = new Developer("abc");
		Developer d2 = new Developer("def");
		System.out.println(Developer.count);
		System.out.println(Developer.getCount());
		
	}

}
