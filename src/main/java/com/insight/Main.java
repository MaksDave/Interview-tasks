package com.insight;

public class Main {
    //BubleSort
    static void bubbleSort(int[] numbersArray){
        for(int window=0;window<numbersArray.length-1;window++)
            for(int sorter=0;sorter<numbersArray.length-window-1;sorter++)
                if(numbersArray[sorter]>numbersArray[sorter+1]){
                    int t=numbersArray[sorter]; numbersArray[sorter]=numbersArray[sorter+1]; numbersArray[sorter+1]=t;
                }
    }
    //QuickSort
    static void quickSort(int[] a,int l,int r){
        if(l<r){
            int p=a[r], i=l-1;
            for(int j=l;j<r;j++)
                if(a[j]<=p){i++; int t=a[i]; a[i]=a[j]; a[j]=t;}
            int t=a[i+1]; a[i+1]=a[r]; a[r]=t;
            quickSort(a,l,i); quickSort(a,i+2,r);
        }
    }
    //FindElement in array
    static int find(int[] a,int x){
        for(int i=0;i<a.length;i++) if(a[i]==x) return i;
        return -1;
    }
    //Palindrome check
    static boolean isPalindrome(String s){
        for(int i=0,j=s.length()-1;i<j;i++,j--)
            if(s.charAt(i)!=s.charAt(j)) return false;
        return true;
    }
    //Reverse String
    static String reverse(String s){
        char[] c=s.toCharArray();
        for(int i=0,j=c.length-1;i<j;i++,j--){
            char t=c[i]; c[i]=c[j]; c[j]=t;
        }
        return new String(c);
    }
    //Find Max in Array
    static int max(int[] a){
        int m=a[0];
        for(int v:a) if(v>m) m=v;
        return m;
    }
    //Factorial recursive
    static int fact(int n){return n<=1?1:n*fact(n-1);}
    //Fibonacci recursive
    static int fib(int n){return n<=1?n:fib(n-1)+fib(n-2);}
    //Check Prime
    boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++) if(n%i==0) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] numberStore={1,2,3,4,5,6,7,8,9,10};
        System.out.println(find(numberStore, 6));
    }
}