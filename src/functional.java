public class functional {

    public int reminder(int a, int b)
    {
        return a%b;
    }

    public double triArea(double height, double flor)
    {
        return height*flor*0.5;
    }

    public int animals(int chicken, int cow, int pig)
    {
        return (chicken * 2) + (cow * 4) + (pig * 4);
    }

    public boolean profitableGamble(double prob, int prize, int pay)
    {
        return prob * prize > pay;
    }

    public String operation(int N, int a, int b)
    {
        if (a+b == N)
        {
            return "added";
        }
        else if (a-b == N)
        {
            return "subtracted";
        }
        else if (a*b == N)
        {
            return "multiplication";
        }
        else if (a/b == N)
        {
            return "divide";
        }
        else
            return "none";

    }

    public int ctoa(char symbol)
    {
        return symbol;
    }

    public int addUpTo(int num)
    {
        return ((1 + num)/2)*num;
    }

    public int nextEdge(int a, int b)
    {
        return (a+b)-1;
    }

    public int sumOfCubes(short[] numbers)
    {
        int sum1 = 0;

        for (short number : numbers) {
            sum1 += number*number*number;
        }

        return sum1;
    }

    public boolean abcmath(short a, short b, short c)
    {
        for (int i = 0; i < b; i++)
        {
            a *= 2;
        }
        return a%c == 0;
    }


}
