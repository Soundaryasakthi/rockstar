import java.util.Scanner;

class myCode
{
    public static void main (String[] args) 
    {
        int i,sum=0;
        float avg;
        Scanner sc=new Scanner(System.in);
        int a[]={10,20,30,40,50};
        for(i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        avg=sum/a.length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
