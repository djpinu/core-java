package com.testcore;

public class LeftTriangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=n-1;j>=n-i;j--){
                
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            // Print spaces before stars
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                // System.out.print("*");
                System.out.print(i);
            }

            // Move to the next line after each row
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<n-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
