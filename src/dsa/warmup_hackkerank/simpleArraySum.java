package dsa.warmup_hackkerank;

import java.util.ArrayList;
import java.util.List;

//EASY
//https://www.hackerrank.com/challenges/simple-array-sum
public class simpleArraySum {

    static int simpleArraySum(List<Integer> arr){
        int total=0;
        for(int i=0;i<arr.size();i++){
            total=total+arr.get(i);
        }

        return total;
    }

    public static void main(String[] args) {
        List<Integer> arr;
        arr=List.of(1,2,3,4); System.out.println(simpleArraySum(arr));
        arr=List.of(1);  System.out.println(simpleArraySum(arr));
        arr=List.of(1,2);  System.out.println(simpleArraySum(arr));
    }
}
