package day17;

import java.util.Random;

class H15{
    int[][] arr1;
    int[][] arr2;
    int[][] arr3 = new int[2][2];

    public H15(int[][] arr1, int[][] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    void minus(){

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                arr3[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
    }

    void show(){
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.println("arr3[" + i + "][" +j+"] : " +arr3[i][j]);
            }
        }
    }
}


public class HW15 {
    public static void main(String[] args) {
        int[][] arr1= {{4,5},{7,8}};
        int[][] arr2= {{4,5},{7,8}};
        H15 h1 =  new H15(arr1, arr2);
        h1.minus();
        h1.show();

    }
}
