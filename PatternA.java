package Assignment2;

public class PatternA {

public static void main(String[] args) {
		
	char ch='a';
	char c;
	for(int i=1;i<=3;i++)           // FOR LOOP FOR NUMBER OF ROWS UPTO ROW NUM 3
	{
		c=ch;
		for(int j=i;j<3;j++)        // FOR LOOP FOR PRINTING SPACES
		{
		System.out.print(" ");
		}
		
		for(int k=0;k<i;k++)        // FOR LOOP FOR PRINTING ALPHABETS IN ASCENDING ORDER  
		{
		System.out.print(c);
		++c;
		}
		c-=2;
		
		for(int l=1;l<i;l++)        // FOR LOOP FOR PRINTING ALPHABETS IN DESCENDING ORDER
		{
		System.out.print(c);
		--c;
		}
		
		System.out.println();       // INTRODUCING NEW LINE

	}
    
	for(int i=2;i>=1;i--)           // FOR LOOP FOR NUMBER OF ROWS FROM 4
	{
		c=ch;
		for(int j=i;j<=2;j++)        // FOR LOOP FOR PRINTING SPACES
		{
		System.out.print(" ");
		}
		
		for(int k=i;k>0;k--)        // FOR LOOP FOR PRINTING ALPHABETS IN ASCENDING ORDER  
		{
		System.out.print(c);
		++c;
		}
		c-=2;
		
		for(int l=i;l>1;l--)        // FOR LOOP FOR PRINTING ALPHABETS IN DESCENDING ORDER
		{
		System.out.print(c);
		--c;
		}
		
		System.out.println();       // INTRODUCING NEW LINE

	}
        
    }


}
