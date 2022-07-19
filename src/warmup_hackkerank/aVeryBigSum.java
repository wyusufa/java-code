package dsa.warmup_hackkerank;

import java.util.Arrays;
import java.util.List;

//EASY
//https://www.hackerrank.com/challenges/a-very-big-sum
public class aVeryBigSum {
    static long aVeryBigSum(List<Long> ar){
        long jumlah=0;
        for(int i=0;i<ar.size();i++){
            jumlah=jumlah+ar.get(i);
        }
        return jumlah;
    }

    public static void main(String[] args) {
        List<Long> masuk= List.of(1000000001L,1000000002L,1000000003L,1000000004L,1000000005L);
        System.out.println(aVeryBigSum(masuk));
    }
}
