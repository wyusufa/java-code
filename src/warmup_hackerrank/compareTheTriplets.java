package dsa.warmup_hackkerank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//EASY
//https://www.hackerrank.com/challenges/compare-the-triplets
public class compareTheTriplets {

    static List<Integer> compareTheTriplets(List<Integer> a, List<Integer> b){
        List<Integer> hasil= Arrays.asList(0,0);
        int panjang=a.size(); // asumsi panjang a dan b sama

        for(int i=0;i<panjang;i++){
            if(a.get(i)>b.get(i)){
                hasil.set(0,hasil.get(0)+1);
            }
            else if(a.get(i)<b.get(i)){
                hasil.set(1,hasil.get(1)+1);
            }
        }
        return hasil;
    }

    public static void main(String[] args) {
        List<Integer> a; List<Integer> b;

        a=List.of(17,28,30); b=List.of(99,16,8);
        System.out.println(compareTheTriplets(a,b));
    }
}
