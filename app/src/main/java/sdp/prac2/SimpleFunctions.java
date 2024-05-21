package sdp.prac2;
import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    public static int Task1(int[] a , int[] b){
        int s = 0 ;
        for(int x : b){
            if (x < 0 || x >= a.length) continue;
            else s+= a[x;]
        }
        return s ;
    }

    public static boolean Task5(int[] intList) {
        if (intList == null || intList.length <= 1) {
            return true; // A null or single element intList is considered sorted
        }
        for (int i = 0; i < intList.length - 1; i++) {
            if (intList[i] > intList[i + 1]) {
                return false; // Found an element out of order
            }
        }
        return true; // All elements are in order
    }

    public static List<Integer> task4(List<Integer> list1, List<Integer> list2){
        int len1 = list1.size();
        int len2 = list2.size();
        List<Integer> myList = new ArrayList<>();

        if (len1 != len2){
            return null;
        }
        else{
            for (int i = 0; i < len1; i++){
                int num1 = list1.get(i);
                int num2 = list2.get(len2-1);
                len2--;
                myList.add(num1 * num2);
            }

        }
        return myList;
    }

}
