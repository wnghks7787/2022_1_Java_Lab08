package edu.handong.csee.java.hw2.math;

/**
 * Class of Math Calculator
 */
public class MathCalculator
{

    private String name;

    /**
     * set name of user(Setter function)
     * @param str name of user
     */
    public void setName(String str)
    {
        name = str;
    }

    /**
     * get name of user(Getter function)
     * @return name of user
     */
    public String getName()
    {
        return name;
    }

    /**
     * get Maximum of two integer.
     * @param x integer
     * @param y integer
     * @return x when x is bigger than y. If not, return y
     */
    public int getMax(int x, int y)
    {
        if(x >= y)
            return x;
        else
            return y;
    }

    /**
     * get Minimum of two integer.
     * @param x integer
     * @param y integer
     * @return x when x is smaller than y. If not, return y.
     */
    public int getMin(int x, int y)
    {
        if(x <= y)
            return x;
        else
            return y;
    }

    /**
     * get Absolute number of input integer
     * @param x input integer
     * @return absolute number of x, |x|
     */
    public int getAbs(int x)
    {
        if(x >= 0)
            return x;
        else
            return (x * -1);
    }

    /**
     * get Sum of two integer input
     * @param x integer
     * @param y integer
     * @return sum of two integer number (x + y)
     */
    public int getSum(int x, int y)
    {
        return (x + y);
    }

    /**
     * get Difference of two integer input
     * @param x integer
     * @param y integer
     * @return Difference of two integer number (x - y)
     */
    public int getDiff(int x, int y)
    {
        return (x - y);
    }

    /**
     * get Product of two integer input
     * @param x integer
     * @param y integer
     * @return product of two integer number (x * y)
     */
    public int getProduct(int x, int y)
    {
        return (x * y);
    }

    /**
     * get Quotient of two integer input
     * @param x numerator(integer)
     * @param y denominator(integer)
     * @return Quotient of integer number (x / y)
     */
    public int getQuotient(int x, int y)
    {
        return (x / y);
    }

    /**
     * get Remainder of two integer input
     * @param x numerator(integer)
     * @param y denominator(integer)
     * @return Remainder of integer number (x % y)
     */
    public int getRemainder(int x, int y)
    {
            return (x % y);
    }

    /**
     * calculate power
     * @param x base(integer)
     * @param y exponent(integer)
     * @return power of x to the y
     */
    public int getPower(int x, int y)
    {
        int result = 1;

        if(y < 0)
            return 0;

        for(int i = 0 ; i < y ; i++)
            result *= x;

        return result;
    }

    /**
     * calculate factorial
     * @param n input integer of n factorial
     * @return factorial of n(n!)
     */
    public int getFactorial(int n)
    {
        if((n == 0) || (n == 1))
            return 1;
        else
            return (n * getFactorial(n - 1));
    }

    /**
     * calculate GCD(Greatest Common Divisor)
     * @param x input integer
     * @param y input integer
     * @return GCD of x and y
     */
    public int getGcd(int x, int y)
    {
        int a, b;

        if(x == 0)
            return getAbs(y);
        else if(y == 0)
            return getAbs(x);

        if(getAbs(x) > getAbs(y))
        {
            a = getAbs(x);
            b = getAbs(y);
        }
        else
        {
            a = getAbs(y);
            b = getAbs(x);
        }

        if(a % b == 0)
            return b;
        else
            return getGcd(b, a % b);

    }

    /**
     * calculate LCM(Lowest Common Multiple)
     * @param x input integer
     * @param y input integer
     * @return LCM of x and y
     */
    public int getLcm(int x, int y)
    {
        return ((x * y) / getGcd(x, y));
    }

    /**
     * get square of input integer
     * @param x input integer that want to make square
     * @return square of x (x^2)
     */
    public int getSquare(int x)
    {
        return getPower(x, 2);
    }
}