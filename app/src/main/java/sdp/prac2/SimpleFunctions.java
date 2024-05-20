package sdp.prac2;
import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

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

}
