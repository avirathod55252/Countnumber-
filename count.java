public class countnumbr {
    public static int count(int n)
    {
        int x = n; 
        int count=0;
        while (x!=0)
        {
            x/=10;
            count++;
        }
        return count;
    }
    public static void main (String args[])
    {
        int n = 1234588;
        System.out.println(count(n));

    }
}
