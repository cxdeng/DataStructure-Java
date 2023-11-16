package com.cxdeng;

public interface Stack<E> {

    /**
     * 向栈顶压入元素
     * @param value 待压入元素
     * @return  成功返回 true，失败返回 false
     */
    boolean push(E value);

    /**
     * 从栈顶弹出元素
     * @return 栈非空返回栈顶元素，栈为空返回 null
     */
    E pop();

    /**
     * 返回栈顶元素，不弹出
     * @return 栈非空返回栈顶元素，栈为空返回 null
     */
    E peek();

    /**
     * 判断栈是否为空
     * @return 若为空返回 true，否则返回 false
     */
    boolean isEmpty();

    /**
     * 判断栈是否已满
     * @return 若满为 true，否则返回 false
     */
    boolean isFull();


}
