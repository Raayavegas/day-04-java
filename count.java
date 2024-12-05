import java.util.*;
class A 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int k=sc.nextInt();
            int c=0;
            for(int j=1;j<=k;j++)
            {
                if((k%j)==0)
                {
                c=c+1;
                }
            }
             System.out.println(c);
        }
    }  

}