package Com.PracticeCollection;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hi PrajWAL NichAT";
		
		int upper=0;
		int lower=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90)
			{
				upper++;
			}
			else
				{
				lower++;
				
				}
				}
		
		System.out.println("upper" +upper);
		
		System.out.println("lower" +lower);
			

	}

}
