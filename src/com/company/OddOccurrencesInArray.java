package com.company;

import java.util.HashSet;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] N = {9,3,9,3,9,7,9};
        solution(N);
    }

    public static int solution(int[] A){
        for (int i = 0; i < A.length; i++) {
            boolean isDuplicated = false;
            for (int j = 0; j < A.length; j++) {
                if(A[i] == A[j] && (i != j)){
                    isDuplicated = true;
                    System.out.println("the elements at indexes " + i + " and " + j  + " have value " + A[i]);
                    break;
                }
            }
            if (!isDuplicated){
                System.out.println("The elements at indexes " + i + " have value " + A[i] + " that is unpaired");
            }
        }
        return 0;
    }
}
