package OverLoadingProgram;
class Test{
	public void accept(int s) {
		System.out.println("int");
	}
	public void accept(char s) {
		System.out.println("char");
	}
}
public class Ambiguity2 {

	public static void main(String[] args) {
		new Test().accept(18);

	}

}
