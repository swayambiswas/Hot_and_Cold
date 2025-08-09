public class GameCode
{
    int Max,Min,rand;
    GameCode()
    {
        Max=100; Min=1; rand= genRan();
    }
    GameCode(int M,int m)
    {
        Max=M; Min=m; rand= genRan();
    }
    int genRan()
    {
        return (int)(Math.random()*(Max-Min+1))+Min;
    }
    boolean Check(int num)
    {
        int diff=Math.abs(num-rand);
        if(num==rand)
        {
            System.out.println("Correct Number! CONGRATULATIONS!!");
            return true;
        }
        else
        {
            if(num>rand)
            {
                if(diff<=10)
                {
                    System.out.println("HOT!");
                    System.out.println("TRY LOWER!");
                    return false;
                }
                else
                {
                    System.out.println("COLD!");
                    System.out.println("TRY LOWER!");
                    return false;
                }
            }
            else
            {
                if(diff<=10)
                {
                    System.out.println("HOT!");
                    System.out.println("TRY HIGHER!");
                    return false;
                }
                else
                {
                    System.out.println("COLD!");
                    System.out.println("TRY HIGHER!");
                    return false;
                }
            }
        }
    }
}
