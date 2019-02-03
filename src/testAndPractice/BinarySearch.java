package testAndPractice;

import java.util.List;

public class BinarySearch {
    public int BinarySearch(int[] array, int target) {
        if (array == null || array.length == 0) return Integer.MIN_VALUE;
        int start = 0, end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (array[mid] == target) return mid;
            else if (array[mid] > target) start = mid + 1;
            else end = mid - 1;
        }
        return Integer.MIN_VALUE;
    }

    int aPowB(int a, int b) {
        if (b == 0) return 1;
        int res = aPowB(a, b/2);
        if (b % 2 == 0){
            res = res * res;
        } else {
            res = res * res * a;
        }
        return res;
    }

    int[] clostestK(int[] array, int target, int k) {
        if (array == null || array.length == 0) return null;
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left)/2;
//            if (array[mid] == target)
        }
        return new int[]{};
    }


    String addChar(char[] chars) {
        if (chars == null || chars.length == 0) return new String();
        StringBuilder builder =new StringBuilder();
        for(int i = 0; i < chars.length; i++) {
            builder.append(chars[i]);
        }
        return builder.toString();
    }

    String reserveCharBu(char[] chars) {
        if (chars == null || chars.length == 0) return new String();
        StringBuilder builder =new StringBuilder();
        for(int i = 0; i < chars.length; i++) {
            builder.append(chars[i]);
        }
        builder.reverse();
        return builder.toString();
    }

    String reverseCharLoop(char[] chars) {
        if (chars == null || chars.length == 0) return "";
        String res = new String();
        for(int i = chars.length; i > 0; i--) {
           res += chars[i];
        }
        return res;
    }


}
