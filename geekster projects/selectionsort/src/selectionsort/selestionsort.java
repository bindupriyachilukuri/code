package selectionsort;

public class selestionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,7,6,4,5};
		for(int i=0;i<arr.length-2;i++)
		{
			int min=arr[i];
			int minindex=i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					minindex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minindex];
			arr[minindex]=temp;
		}
		for(int i:arr)
		{
			System.out.println(i);
		}
	}

}
