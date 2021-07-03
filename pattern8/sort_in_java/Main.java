package pattern8.sort_in_java;

import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        int[] a = {2,3,1,5,8,3};
        Arrays.sort(a);
        for (int num : a) {
            System.out.print(num);
            System.out.print(" ");
        }
    }
}