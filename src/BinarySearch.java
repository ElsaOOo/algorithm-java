import java.util.Arrays;

/**
 * 二分查找
 */
public class BinarySearch {

  public static int rank(int key, int[] a) {
//    数组必须是有序的
    int lo = 0;
    int hi = a.length - 1;
    while (lo <= hi) {
//      被查找的值要么不存在，要么必须存在于a[lo..hi]之中
      int mi = (hi + lo) / 2;
      if (a[mi] < key) {
        lo = mi + 1;
      } else if (a[mi] > key) {
        hi = mi - 1;
      } else {
        return mi;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] whitelist = {1,3,4,6,2,8,111,32,9};
    Arrays.sort(whitelist);
    int res = BinarySearch.rank(9, whitelist);
    System.out.println(whitelist[res]); // 9
  }
}
