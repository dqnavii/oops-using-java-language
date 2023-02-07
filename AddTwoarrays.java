import java.util.*;
class AddTwodarrays
{
   public static void main(String args[])
   {    
	
	Scanner s=new Scanner(System.in);
	int row1=s.nextInt();
	int column1=s.nextInt();

      int row2=s.nextInt();
      int column2=s.nextInt();
if(row1==row2 && column1==column2)
{
int a[][]=new int[row1][column1];

for (int i = 0; i < row1; i++)
	{
	    for(int j = 0; j < column1; j++)
	    {
           	a[i][j] = s.nextInt();
	    }
	}

for (int i = 0; i < row1; i++)
	{
        System.out.println(" ");
	    for(int j = 0; j < column1; j++)
	    {
	       System.out.print(a[i][j]+" ");
 	    }
	}     



int b[][]=new int[row2][column2];

for (int i = 0; i < row2; i++)
	{
	    for(int j = 0; j < column2; j++)
	    {
           	b[i][j] = s.nextInt();
	    }
	}

for (int i= 0; i < row2; i++)
	{
        System.out.println(" ");
	    for(int j= 0; j < column2; j++)
	    {
	       System.out.print(b[i][j]+" ");
 	    }
	} 


}
}
}

