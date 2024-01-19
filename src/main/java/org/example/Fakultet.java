package org.example;

public class Fakultet {
    public static void main(String[] args) {
       // System.out.println(fakultet(5));
        System.out.println(fakultetRec(5));
    }

    public static int fakultet(int n){
        if(n==0) return 1;


        int multip=1;
        if(n>=1){
            for (int i = 1; i <n+1 ; i++) {
                  multip*=i;
            }
        }
        return multip;
    }


    public static int fakultetRec(int n){

        if(n==0 || n==1) return 1;

        else {
            return n*fakultet(n-1);
        }

    }
}
