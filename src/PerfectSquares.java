class CountSquares {

    static int countSquares(int a, int b)
    {
        int cnt = 0;

        for (int i = a; i <= b; i++)

            for (int j = 1; j * j <= i; j++)
                if (j * j == i)
                    cnt++;
        return cnt;
    }
}

public class PerfectSquares {
    public static void main(String[] args)
    {
        int a = 9, b = 25;
        CountSquares obj = new CountSquares();
        System.out.print("Count of squares is " + obj.countSquares(a, b));
    }
}
