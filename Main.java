package com.company;
import java.math.BigDecimal;
import java.io.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	//4.3 a
        String s="Gabriel";
        int nrVoc=0, nrCon=0;
        char v[]={'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for(int i=0;i<v.length;i++) {
            if (s.contains(String.valueOf(v[i])))
                nrVoc++;
        }
        nrCon=s.length()-nrVoc;
        System.out.println("Vocale "+nrVoc+" Consoane "+nrCon);
    //4.3 b TEMA
        String sir="Maria";
        int vocale=0, consoane=0;
        int[] a =new int[sir.length()];
        int indice=0;
        int lungime=sir.length();
        System.out.println("Introduceti caracterul");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        System.out.println("c= "+c);
        for(int i=0;i<lungime;i++) {
            if(s.charAt(i)==c) {
                a[indice] = i;
                indice = indice + 1;
            }
        }
        System.out.println("Caracterul se afla pe pozitiile: ");
        for(int i=0;i<indice;i++)
            System.out.print(a[i]+ " ");
        System.out.println();
    ///4.4
        String sir1="Ana";
        String sir2=new String("Ana");
        String sir3="Ana"+"";
        System.out.println(sir1==sir2);
        System.out.println(sir1.equals(sir2));
        System.out.println(sir1==sir3);
    ///4.5 a tema
        Main op=new Main();
        int combinatii=op.combinations(49,6);
        System.out.println("Sansa este de 1 la "+combinatii);
        BigDecimal sansa=new BigDecimal(1*100f/combinatii);
        System.out.println("Sansa este de: "+sansa+ " %");
    ///4.5 b C-ul este tema+citirea de la tastatura
    ///4.5 c
        int []castigatoare=new int[6];
        for(int i=0;i<6;i++)
        {
            int val=(int)(48*Math.random())+1;
           castigatoare[i]=val;
        }
        System.out.println("Numerele castigatoare sunt: ");
        for(int i=0;i<6;i++)
        {
            System.out.print(castigatoare[i]+" ");
        }
        long comp=0;
        for(int i=0;i<6;i++)
        {
            comp=comp | ((long) 1 << castigatoare[i]);
        }
        System.out.println("");
        System.out.println("Ordonare crescatoare: ");
        for(int i=0;i<50;i++)
        {
            long bit= comp & (long) 1 << i;
            if(bit>=1){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        System.out.println("Ordonare descrescatoare: ");
        for(int i=49;i>=0;i--)
        {
            long bit= comp & (long) 1 << i;
            if(bit>=1){
                System.out.print(i + " ");
            }
        }


    }
    public int combinations(int n, int k){
        if(k==0 || n==0)
            return 1;
        return combinations(n-1,k-1)+combinations(n-1, k);
    }
}
