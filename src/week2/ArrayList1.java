package week2;

import java.util.ArrayList;

public class ArrayList1 {
    public static int sum(ArrayList<Integer> a) {
        int out=0;
        for (int x=0;x<a.size();x++){
            out+=a.get(x);
        }
        return out;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int x=0;x<4;x++){
            arr1.add(x);
        }
        System.out.println(arr1);
        int total=sum(arr1);
        System.out.println(total);
    }
}
