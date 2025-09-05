package instanceoff;
class Super{
void m1() {
	System.out.println("kalia");
}
}
class Sub extends Super{
	void m1() {
		System.out.println("balia");
	}
}
public class demo1 {

	public static void main(String[] args) {
		Sub s=new Sub();
		if(s instanceof Sub) {
			System.out.println("point to sub class");
		}

	}

}
