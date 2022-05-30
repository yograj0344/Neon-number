class neon 
{
    public static void main(String[] args)
    {
        int n=9,sum=0;
        int squre=n*n;
        while(squre !=0)
        {
            int dig=squre%10;
            sum=sum+dig;
            squre=squre/10;
        }
        if(n==sum)
        {
            System.out.println("is neon number");

        }
        else{
            System.out.println("not neon number");
        }
    }
}