class CountDigit{
public static void main(String args[]){
int a=246,count=0,b=0;
while(a!=0)
{
a=a/10;
++count;
}
System.out.println(count);
}
}