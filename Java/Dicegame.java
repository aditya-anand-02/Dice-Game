public class Dicegame {
    public static void main(String[] args) {
        int s=calc(3, 4, 5);
        int r1= roll();
        int r2=roll();
        int r3=roll();
        System.out.println("The rolled die are "+r1+", "+r2+", "+r3);
        if(s>(r1+r2+r3))
        {
            System.out.println("Loss");
        }
        else{
            System.out.println("Vicrory");
        }


        
        
    }
    public static int roll()
    {
        double a=(Math.random()*6)+1;
        return (int)a;
    }

    public static int calc(int x, int y, int z)
    {
        int sum1=x+y+z;
       return sum1;
    }
    
}
