package pattern8.sort_in_java_v2;

public class MyArrays {
    /**
     * 对给定的数组进行排序
     * 
     * @param array
     */
    public static void sort(Object[] array) {
        if (array.length <= 1) {
            return;
        }
        for (int i = array.length; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                int x = j - 1;
                int y = j;
                Comparable xObj = (Comparable) array[x];
                Comparable yObj = (Comparable) array[y];
                if (xObj.compareTo(yObj) > 0) {
                    MyArrays.swap(array, x, y);
                }
            }
        }
    }

    /**
     * 交换数组中的两个元素
     * 
     * @param array
     * @param x     第一个元素的下标
     * @param y     第二个元素的下标
     */
    private static void swap(Object[] array, int x, int y) {
        Object temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
