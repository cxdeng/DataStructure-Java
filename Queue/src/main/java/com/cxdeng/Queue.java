package com.cxdeng;

public interface Queue<E> {

    /**
     * 向队列插入值
     * @param value 待插入值
     * @return 插入成功返回true
     */
    boolean offer(E value);

    /**
     * 从队列头获取值，并移除
     * @return 如果队列非空返回队列头值，否则返回null
     */
    E poll();

    /**
     * 从队列头获取值，不移除
     * @return 如果队列非空返回队列头元素的值，否则返回null
     */
    E peek();

    /**
     * 检查队列是否为空
     * @return 若队列为空返回 true，否则返回 false
     */
    boolean isEmpty();

    /**
     * 检查队列是否已满
     * @return 若队列已满，返回 true，否则返回 false
     */
    boolean isFull();
}
