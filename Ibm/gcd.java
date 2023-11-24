public class gcd {
    public static int getGcd(int x, int y) {
        if (x == 0) {
            return y;
        }
        if (y == 0) {
            return x;
        }

        if (x > y) {
            return getGcd(x - y, y);
        }
        return getGcd(x, y - x);

    }

    public static int getGcd2(int x, int y)
    {
       if(y==0)
       {
        return x;
       }
       return getGcd2(y, x%y);
    }

    public static int getLcm(int x, int y)
    {
        int gcd = getGcd(x, y);
        return  Math.abs(x*y)/gcd ;
    }
    public static void main(String[] args) {
        System.out.println(getGcd(100, 88));
        System.out.println(getGcd2(0, 88));
        System.out.println(getLcm(20, 30));
    }
}
