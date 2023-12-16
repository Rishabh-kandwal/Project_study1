package loos;

public class lose 
{
	static int i=b.j;
	public static void main(String[] args) {
		System.out.println(i);
	}
}
class b
{
	static int j=c.k;
}
class c{
	
	static int k=d.m();
}
class d
{
	static int m() 
	{
		return 10;
	}
}