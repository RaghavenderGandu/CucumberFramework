package Com.Locators;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Java
{

//	public static boolean isprime(int prime)
//	{
//		if(prime<=1)
//		{
//			return false;
//		}
//		
//		for(int i=2;i<prime;i++)
//		{
//			if(prime%i==0)
//			{
//				return false;
//			}
//		}
//		
//		return true;
//		
//		
//	}
//	
//	public static void printprime(int prime)
//	{
//		for(int i=1;i<=prime;i++)
//		{
//			if(isprime(i))
//			{
//				System.out.println(i);
//			}
//			
//		}
//		//return false;
//	}
	
// ---------------------------------------------------------------
	
//	Reverse a string
	
//	public static void main(String[] args) 
//	{
//		
//		String abc="Raghav";
//		String rev="";
//		
//		for(int i=abc.length()-1;i>=0;i--)
//		{
//			rev=rev+abc.charAt(i);
//		}
//		System.out.println(rev);
		
	//------------------------------------------------------------------------
	
	// Reverse a sentance
		
//	public static void main(String[] args) 
//	{
//		
//		String abc[]="This is test the reverse".split(" ");
//		//String [] s1=abc.split("");
//		String rev="";
//		
//		for(int i=abc.length-1;i>=0;i--)
//		{
//			rev +=abc[i]+ " ";
//			
//		}
//		System.out.println(rev);
		
		
		
//  --------------------------------------------------------------------------------
		
//		Reverse an array
		
//	public static void main(String[] arg)
//	{
//	
//		String arr[]= {"abc","def","ghi","jkl"};
//	
//		for(int i=arr.length-1;i>=0;i--)
//		{
//			System.out.println(arr[i]);
//		
//	}
//	------------------------------------------------------------------------------
	
	// Factorial of a number
//	public static void main(String[] arg)
//	{
//	
//		int num=6 , sum=1;
//		
//		for(int i=1;i<=num;i++)
//		{
//			
//			sum=sum*i;
//		
//	}
//		System.out.println(sum);
		
//--------------------------------------------------------------------------

// sum of a digits of a number

//	public static void main(String[] arg)
//	{
//		int num=1234,sum=0,rem;
//		
//		while(num>0)
//		{
//			rem=num%10;
//			sum=sum+rem;
//			num=num/10;
//	}
//	System.out.println(sum);
	
//---------------------------------------------------------------------------------

//	public static boolean main(String[] arg)
//	{
//	
//		int num=1234;
//		
//		while(num>0)
//		{
//			if(num%10>1)
//			{
//				return false;
//			}
//		num=num/10;
//	}
//		return false;
	
//	public static void main(String[] arg)
//	{
//	
//		int a[]= {1,2,3,4,1,6,};
//		
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]== a[j])
//				{
//					System.out.println("duplicate number is:"+a[i]);
//				}
//			}
//		}
//		
//	}
//	
//}
	
//------------------------------------------------------------------------------------------
	
//	public static void main(String[] arg)
//	{
//		
//		int a[]= {1,2,3,4,5,6,5},t;
//		
//		int smallest=a[0];
//		
//		for(int i=1;i<a.length;i++)
//		{
//			if(smallest<a[i])
//			{
//				//t=smallest;
//				smallest=a[i];
//			}
//		}
//		System.out.println(smallest);
//	}
//}
//------------------------------------------------------------------------
	
// 
		
//		/
	public static void main(String[] arg)
	{
		
//--------- java pgm for missing arrary -----------------------------------------------------		
		
//		int a[]= {1,2,3,4,6,7};
//		int len=a.length+1;
//		int totalsum= len*(len+1)/2;
//		int arrsum=0;
//		
//		for(int i=0;i<a.length;i++)
//		{
//			arrsum= arrsum+a[i];
//		}
//		System.out.println(arrsum);
//		
//		System.out.println(totalsum-arrsum);
		
	//----------------remove duplicate value in string--------------------------
		
//		String str="Raghavendar";
//		
//		
//		LinkedHashSet<Character> hs= new LinkedHashSet<Character>();
//		
//		for(int i=0;i<str.length();i++)
//		{
//			
//			
//			hs.add(str.charAt(i));
//		}
//		
//	//	hs.add(str);
//		
//		for(Character s:hs)
//		{
//			System.out.println(s);
//		}
		
	//------------occurence of character----------------------------------
		
		String str="Raghavender";
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		char[] chara= str.toCharArray();
		
		for(char ch:chara)
		{
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		
		for(Map.Entry m: hm.entrySet())
		{
			System.out.println(m.getKey() + "--" + m.getValue());
		}
		
		
		
		
//---------------- java pgm for finding number of vowles,words and constants--------------------------
		
//		String abc="this is test for vowles";
//		
//		int vow=0,cons=0,spaces=0;
//		
//		for(int i=0;i<abc.length();i++)
//		{
//			char ch=abc.charAt(i);
//			
//			if(ch == 'a' || ch =='e' || ch=='i' || ch=='o' || ch=='u' )
//			{
//				++vow;
//			}
//			else if(ch > 'a' && ch <= 'z' )
//			{
//				++cons;
//			}
//		}
//		
//		System.out.println(vow);
//		System.out.println(cons);
		
//---------- java programe for most 2nd largest number ---------------------------------
		
//	int a[]={3,2,3,1,5,6,7};
//	//int smallest=a[0];
//	int t,size=a.length;
//	 
//	for(int i=0;i<a.length;i++)
//	{
//		for(int j=i+1;j<a.length;j++)
//		{
//			if(a[i]>a[j])
//			{
//				t=a[i];
//				a[i]=a[j];
//				a[j]=t;
//				
//			}
//		}
//		System.out.println(a[i]);
//	}
//	
//-----------	java prg for most repeating word.-------------------------------------
//	
//		String para = "Paris in the the spring.Not that that is related.Why are you laughing? Are my my regular expressions THAT bad??";
//        String[] words = para.split("\\s+");
//        int finalCount = 0;
//        int tempCount = 0;
//        String mostlyUsedWord = null;
//        for (String word: words) {
//            tempCount = 0;
//            for (String w: words) {
//                if (word.equalsIgnoreCase(w)) {
//                    tempCount++;
//                }
//            }
//            if (tempCount >= finalCount) {
//                finalCount = tempCount;
//                mostlyUsedWord = word;
//            }
//        }
//        System.out.println("mostlyUsedWord:: = " + mostlyUsedWord + " ,count:: = " + finalCount);
//		
	}
	
}
	
