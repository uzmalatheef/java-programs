
public class SumUsingDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a, n= 123, sum = 0;
do
{
	a= n % 10;
	sum = sum + a;
	n = n / 10;
}
while (n>0);
System.out.println("sum of digits: " + sum);
	}

}
