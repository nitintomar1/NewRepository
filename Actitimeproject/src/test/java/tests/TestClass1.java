package tests;

public class TestClass1 {
	public static void main(String[] args)
	{
		String[] a={"1","2","3","4","2"};
		String  duplicate= "";
		
		
		
		for (int j= 0; j < a.length; j++)
		{
			int count = 0; // to find out how many time value is appeared in the arry
			for (int i = 0; i < a.length; i++)
			   {
			         if(a[i] == a[j] )
			           {    
			             // if(arr[i] == 1 ) { once boyleydi ikinci for gelince soldaki oldu
			            count++; 
			           }
			  }
			     if(count == 1 )
			    { 
			    	duplicate=duplicate+ a[j];
			       System.out.print(duplicate);
			    }
			     else
			     {
			    	 System.out.println(a[j]+" ");
			     }
			   
	   }
		
		
	}

}
