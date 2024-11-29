public class Factorialcalculation{
public static long calculateFactorial (int number){
	if(number==0 || number==1){
	return 1;
}
else{
return number* calculateFactorial(number-1);
}
}
	public static void main(String args[])
	{
	int num=5;
long factorial=calculateFactorial(num);
System.out.println("the factorial of"+num+"is"+factorial);
}
}

