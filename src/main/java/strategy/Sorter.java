package strategy;

/**
 *  排序器
 */
public class Sorter {

    /**
     *  默认排序，从小到大，需要提供比较器策略
     * @param array
     * @param comparator
     * @param <E>
     * @return
     */
    public static <E> E[] sort(E[] array, Comparator<E> comparator){
        E[] clone = array.clone();
        for (int i = 0; i < clone.length; i++) {
            int minPos = i;
            for (int j = i+1; j < clone.length; j++) {
                if (comparator.compare(clone[i], clone[j]) > 0)
                    minPos = j;
            }
            swap(clone, i, minPos);
        }
        return clone;
    }

    private static <E> void swap(E[] arrays, int i, int j){
        E temp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = temp;
    }

}
