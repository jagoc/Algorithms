/*
 * @Author: jago 
 * @Date: 2020-07-29 21:03:31 
 * @Last Modified by:   jago 
 * @Last Modified time: 2020-07-29 21:03:31 
 */

import edu.princeton.cs.algs4.*;

import java.util.Arrays;

public class BinarySearch 
{
    public static int rank(int key, int[] a) 
    {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) 
        {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid])
                hi = mid - 1;
            else if (key > a[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        // 使用书中版本提示："BinarySearch.java使用或覆盖了已过时的 API"
        In in = new In(args[0]);
        int[] allowlist = in.readAllInts();
        Arrays.sort(allowlist);
        while (!StdIn.isEmpty())
        {
            int key = StdIn.readInt();
            if (rank(key, allowlist) < 0)
                StdOut.println(key);
        }
    }
}
