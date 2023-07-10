package com.adeelaslam;

public class Lg
{
    //2^k=8
    // Lg 8=3
    public static int lg(int N)
    {
        if (N == 0)
            return -1;
        if (N == 1)
            return 0;
        if (N == 2)
            return 1;
        int difference = N - 2;
        int track = 2;
        int counter = 1;
        for (int i = 0; i < N; i++)
        {
            track *= 2;
            if ((N - track) < difference)
                difference = N - track;
            if (track > N)
                return counter;
            counter++;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int x = 9;
        System.out.println(lg(x));
    }
}