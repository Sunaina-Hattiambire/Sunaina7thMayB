package MyJavaProgram;

public class myJavaProg {
	static int a=10;
	static int b=20;
	
	public void addition() {
		int c=a+b;
		System.out.println(c);
		System.out.println(a);
	}

public static void main(String[] args){
	myJavaProg mathematics = new myJavaProg();
	mathematics.addition();
}
}