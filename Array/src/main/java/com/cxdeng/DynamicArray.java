package com.cxdeng;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.IntStream;

public class DynamicArray implements Iterable<Integer> {

    // 逻辑大小
    private int size = 0;

    // 容量
    private int capacity = 10;

    private int[] arr = new int[capacity];

    /**
     * 向数组最后添加新元素
     * @param elem 待添加元素
     */
    public void addLast(int elem) {
        // 检查和扩容数组
        checkAndExpand();

        arr[size] = elem;
        size++;
    }


    /**
     * 向 [0, size)位置添加元素
     * @param index 索引位置
     * @param elem 待添加元素
     */
    public void add(int index, int elem) {
        // 检查和扩容数组
        checkAndExpand();

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }

        arr[index] = elem;
        size++;
    }


    /**
     * 检查和扩容数组
     */
    private void checkAndExpand() {
        // 容量检查
        if (size == capacity) {
            // 进行扩容
            capacity += capacity >> 1;
            int[] newArr = new int[capacity];

            // 复制旧数组的元素至新数组
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }

            arr = newArr;
        }
    }


    /**
     * 查询元素
     * @param index 索引位置在 [0, size) 区间内
     * @return 该索引位置的元素
     */
    public int get(int index) {  // [0, size)
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        return arr[index];
    }


    /**
     * 从 [0, size) 范围删除元素
     * @param index 索引位置
     * @return 被删除的元素
     */
    public int remove(int index) {   // [0, size)
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        int removedElem = arr[index];

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[size - 1] = 0;
        size--;

        return removedElem;
    }


    public void printArr() {
        System.out.print("[");

        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }

        System.out.println("]");
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int cur = 0;

            @Override
            public boolean hasNext() {
                return cur < size;
            }

            @Override
            public Integer next() {
                return arr[cur++];
            }
        };
    }


    public IntStream stream() {
        // Arrays.copyOfRange() 前闭后开
        return IntStream.of(Arrays.copyOfRange(arr, 0, size));
    }
}
