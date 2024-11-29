public class Methodoverloading{
	public static void print(int a)
{
	System.out.println("integer"+a);
}
	public static void print(double a){
	
	System.out.println("double"+a);
}
	public static void print(String a){
	
	System.out.println("string"+a);
}
	public static void print(char a){
	
	System.out.println("char"+a);
}
public static void main(String args[])
{
	print(10);
	print(13.25);
	print("hello world");
	print('c');
}
}





