package com.ccsi;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPowerThree(81));
    }
    //Given an integer,write a function to determine if it is a power of three.
    //method 1，power of N 的通用方法。除1之外，对3取余等于0，同时一直除3到最后等于1（3/3）.
    public static boolean isPowerThree(int num){
        if(num<=0)return false;
        while(num!=1){
            if(num%3!=0) break;
            num/=3;
        }
        return num==1;
    }
    //method 2 数学方法，找到最大的3的n次方，也就是3^19，用这个数去除num，判断余数是否为0；
    public static boolean isPowerThree1(int num){
        int Max3PowerInt=1162261467;//3^19, 3^20=3486784401>MaxInt32
        int MaxInt32=2147483647;//2^31-1;
        if(num<=0||num>Max3PowerInt) return false;
        return Max3PowerInt%num==0;
    }
}
