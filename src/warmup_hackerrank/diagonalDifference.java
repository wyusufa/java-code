package dsa.warmup_hackkerank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



//EASY
//https://www.hackerrank.com/challenges/diagonal-difference
public class diagonalDifference {

    static int diagonalDifference(List<List<Integer>> arr){
        int jumlahSatu=0;
        int jumlahDua=0;
        int panjang=arr.get(0).size();
        int tailIndex=panjang-1;
        for(int i=0;i<panjang;i++){
            jumlahSatu=jumlahSatu+arr.get(i).get(i);
            jumlahDua=jumlahDua+arr.get(i).get(tailIndex-i);
        }

        return Math.abs(jumlahDua-jumlahSatu);
    }

    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1,2,3));
        arr.add(Arrays.asList(4,5,6));
        arr.add(Arrays.asList(9,8,9));

        System.out.println(diagonalDifference(arr));
    }
}
