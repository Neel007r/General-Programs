package Practice;

class Animal{}

public class Instance_of extends Animal{

	

//public class Practice1 extends Animal{
//	public static void main(String[] args) {
//		Practice1 s = new Practice1();
//		System.out.println(s instanceof Animal);
//	}
//	
//}

	public static void main(String[] args) {
		Instance_of s =(Instance_of) new Animal();
		System.out.println(s instanceof Instance_of);
	}
	
}
