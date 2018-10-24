package com.sorting;

import java.net.URI;
import java.net.URL;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {14,33,27,35,10};
		
		boolean flag = true;
		while(flag){
			flag=false;
			for(int i=0; i<=arr.length-2; i++){
				int op1 = arr[i];
				int op2 = arr[i+1];
				if(op1>op2){
					arr[i]=op2;
					arr[i+1]=op1;
					flag = true;
				}
			}
		}
		
	}

}
