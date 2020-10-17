package com.company;
import java.util.Scanner;

public class Bilet {
    private int numere[]=new int[6];

    public Bilet() {

    }

    public int[] getNumere()
    {
        return numere;
    }

    public void citireNr()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++)
            numere[i]=sc.nextInt();
    }
}
