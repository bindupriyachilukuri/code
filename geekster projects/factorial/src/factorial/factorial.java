package factorial;

public class factorial {
public static int fact(int num)
{
	int factorial=1;
	for(int i=1;i<=num;i++)
	{
		factorial=factorial*i;
	}
	return factorial;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int r=2;
		int nfact=fact(n);
		int rfact=fact(r);
		int nrfact=fact(n-r);
		int ans=nfact/(rfact*nrfact);
		System.out.println(ans);
	}

}
