/*
Write a program to find the n-th ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.

Note that 1 is typically treated as an ugly number.
*/
public class Solution {
    public int nthUglyNumber(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        int i2=0;
        int i3=0;
        int i5=0;
        list.add(1);
        int i=0;
        while(i<n){
            
            int min=Math.min(list.get(i2)*2,Math.min(list.get(i3)*3,list.get(i5)*5));
            list.add(min);
            if(min==list.get(i2)*2) i2++;
            if(min==list.get(i3)*3) i3++;
            if(min==list.get(i5)*5) i5++;
            i++;
        }
        System.out.println(list.toString());
        return list.get(n-1);
        
        
    }
}
