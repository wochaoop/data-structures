package com.datastructures;

import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        /* 初始化双向队列 */
        Deque<Integer> deque = new LinkedList<>();

        /* 元素入队 */
        deque.offer(10);
        deque.offer(6);
        deque.offer(5);
        deque.offer(8);

//        /* 访问元素 */
//        int peekFirst = deque.peekFirst();  // 队首元素
//        int peekLast = deque.peekLast();    // 队尾元素

//        /* 元素出队 */
//        int popFirst = deque.pollFirst();  // 队首元素出队
//        int popLast = deque.pollLast();    // 队尾元素出队
//
//        /* 获取双向队列的长度 */
//        int size = deque.size();
//
//        /* 判断双向队列是否为空 */
//        boolean isEmpty = deque.isEmpty();

        System.out.println(deque);

    }

}
