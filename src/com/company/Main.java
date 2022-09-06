package com.company;

public class Main {
    public static boolean even(int n){
        if((n&1)==0){
            System.out.println(System.nanoTime());
            return true;
        }
        System.out.println(System.nanoTime());
        return false;
    }
    public static void ckeck_Kth_Bit(int n,int k){
        if(((1<<k-1)&n)==0){
            System.out.println("Kth bit is not set");
        }else{
            System.out.println("Kth bit is set");
        }
    }

    public static void main(String[] args) {
//        int x=5,y=3;
//        System.out.println("5^3 = "+(x^y));
//        System.out.println("5&3 = "+(x&y));
//        System.out.println("5|3 = "+(x|y));
//        System.out.println("~1 = "+(~1));
//        System.out.println("3<<30 = "+(3<<30));
//        System.out.println("-3<<3="+(-3<<3));
//        System.out.println("3>>1 = "+(3>>1));
//        System.out.println("-3>>1 = "+(-3>>1));
//
//        System.out.println("-3>>>1 = "+(-3>>>1));
//        System.out.println(even(94));
        ckeck_Kth_Bit(5,3);

    }
}
