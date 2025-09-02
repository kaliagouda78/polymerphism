package OverLoadingProgram;

class test
{
	public void accept(double d){
		System.out.println("double");
	}
	public void accept(float d){
		System.out.println("float");
	}
}

class  Ambi1
{
	public static void main(String[] args) 
	{
		new test().accept(6);
	}
}
