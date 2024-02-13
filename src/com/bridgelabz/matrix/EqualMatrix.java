package com.bridgelabz.matrix;

public class EqualMatrix {
    public int checkMatrices(int[][]a,int[][]b){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i][j]==b[i][j]){
                    return  1;  // if matrices are equal
                }
                return  0;  // if matrices are not equal
            }
        }
        return 0;
    }
}
