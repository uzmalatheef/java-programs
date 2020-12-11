class SmallestNumber{
public static void main (String args[]){
	int a=2,b=3,c=5;
	if(a<b)
	{
		if(a<c){
			System.out.println("the smallest num is:" + a);
				}
				else
				System.out.println("the smallest num is:" + c);	
	}
	else
	{
		if(b<a)
		{
			if(b<c)
			{
				System.out.println("the smallest num is:" + b);
			}
			else
				System.out.println("the smallest num is:" + c);
		}
	}
}
}