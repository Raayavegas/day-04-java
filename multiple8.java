import java.util.*;
class A 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            if((n&7)==0)
            {
                System.out.println("ys");
            }
            else
            {
                System.out.println("no");
            }
        }
    }
}