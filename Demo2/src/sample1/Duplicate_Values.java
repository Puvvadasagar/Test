package sample1;

public class Duplicate_Values {

	public static void main(String[] args) throws Exception{
		 String string = "great responsibility";
		 int count = 0;
		 int i,j;
		 
		 
		 // Convert given string in to character array
		 //char string1 []= string.toCharArray();
		 
		 System.out.println("Duplicate characters in the given string");
		 
		 
		 // Count each character present in the string
		 // Converting characters in to numbers
		 
		 
		 String [] s  = string.split(" ");
		 Integer [] numbers = new Integer[s.length];
		 int k=0;
		 for(String x: s)
		 {
			 numbers[k]=Integer.parseInt(x);
			 k++;
		 }
		 
		 for(i=0;i<numbers.length;i++)
		 {
			 count =1;
			 for(j=i+1;j<numbers.length;j++)
			 {
				 if(numbers[i] == numbers[j] && numbers[i]!=' ')
				 {
					 count++;
					 numbers[j]=(int)'0';
					 }
				 }
		 }
			 if(count>1 && numbers[i]!='0')
          {
	          System.out.println(numbers[i]);
	      }
	}
	
}
		 
