package com.lambton;

public class classActivity {
    public static int[] reverse(int[] a){
        int[] p = new int[a.length];
        int temp = 0;
        for (int i = a.length-1; i >= 0; i--) {
            p[temp]=a[i];
            temp++;
        }
        return p;
    }
    public static int[] ascending(int[] a) {
        //Sort the array in ascending order
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static int[] descending(int[] a) {
            //Sort the array in ascending order
            int temp = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = i+1; j < a.length; j++) {
                    if(a[i] < a[j]) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            return a;
    }

    public static void odd(int[] a) {
        for(int v :a){
            if(v%2!=0){
                System.out.print(v);
                System.out.print(" ");}
        }
    }

    public static void even(int[] a) {
        for(int v :a){
            if(v%2==0){
                System.out.print(v);
                System.out.print(" ");}
        }
    }
    public static int sum(int[] a) {
        int sum =0;
        System.out.print("Sum of all elements");
        for(int v :a){
            sum +=v;
        }
        return sum;
    }

    public static void main(String[] args){
        int p[] = {99,10,22,20,30,66,40,50,60,70};
        System.out.println("\nString in reverse order is : \n");
        int result[] = reverse(p);
        for(int v : result)
            System.out.println(v);
        System.out.println("\nString in ascending order is : \n");
        result = ascending(p);
        for(int v : result)
            System.out.println(v);
        System.out.println("\nString in descending order is : \n");
        result = descending(p);
        for(int v : result)
            System.out.println(v);
        System.out.println("\nPrint the sum of all elements : \n"+
                sum(p)+ "\n"
                );
        System.out.println("Print all odd elements :");
        odd(p);
        System.out.println("\n\nPrint all even elements :");
        even(p);

        }

}
