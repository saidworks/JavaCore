package com.perscholas.java_basics;

import java.util.Arrays;
// function that verify that all number from 1 to K are in the array 
class Solution {
	public Solution() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int[] A = {1,2,3,4};
		System.out.println(solution(A,6));
	}
	
	public static boolean solution(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                return false;
          
        }
        for(int j=0;j<=K;j++) {
            if (A[0] != 1 && A[n-1] != K && Arrays.asList(A).contains(j))
                return false;
            else
                return true;
        }
    return false;
    }
}