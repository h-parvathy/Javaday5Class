package com.lambton;

public class ArrayExample {
    public static void main(String[] args){
        int[] a,b,c; //a,b,c are int array
        int x[], y , z[]; //x and z are int array, y is int
//        int p[] = new int[5];
        int p[] = {10,20,30,40,50,}; //THe comma does not hurt us.
        for(int v:p){
            System.out.println(v);
        }

        System.out.println(p[3]);
        p[2] = 3000; //Upadate 30 to 3000
//        p[5] = 5000; //array out of bbound erroe

        String[] strings = new String[10];
        for(String s: strings){
            System.out.println();// prints  nothing - null
        }

        String[] str = { new String("A"), new String("B"), new String("C")};

        //Array of Objects
        Student students[] = new Student[5];

        students[0] = new Student();

    }
}
