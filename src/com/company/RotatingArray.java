package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotatingArray {

    public static void main(String[] args) {
        int[] N = {1,2,3,4,5};
        int K = 6;
        solution(N,K);
        //System.out.println(solution(N,K));

    }

    /**
     *
     * @param N array consisting N integers
     * @param K : K times rotation of array
     */
    public static void solution(int[] N, int K){
        //before rotation
        System.out.println(Arrays.toString(N));
        int last = 0;
        for (int i = 0; i < K; i++) {
            last = N[N.length-1];
            for (int j = N.length-1; j > 0; j--) {
                N[j] = N[j-1];
            }
            N[0] = last;
        }

        for (int j : N) {
            System.out.print(j + " ");
        }
    }
}
