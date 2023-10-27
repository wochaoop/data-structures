package com.datastructures;

import java.util.NoSuchElementException;

/**
 * Created by sykus on 2017/12/29.
 */
public class MyStack<E> {

    private Node<E> head;//头结点
    private Node<E> top;//栈顶
    private int size;//栈中元素个数

    public MyStack() {
        head = new Node<E>();
        head.next = null;
        top = null;//栈顶初始化为null
        size = 0;
    }

    /**
     * 把item压入栈中
     *
     * @param item
     */
    public void push(E item) {
        /********** Begin *********/
        Node<E> newNode = new Node<>();
        newNode.item = item;
        newNode.next = top;
        top = newNode;
        size++;
        /********** End *********/
    }

    /**
     * 返回它栈顶元素并删除
     */
    public E pop() {
        if (isEmpty())
            throw new NoSuchElementException("栈为空！");

        /********** Begin *********/

        if (isEmpty()) {
            throw new NoSuchElementException("栈为空！");
        }
        E item = top.item;
        top = top.next;
        size--;
        return item;

        /********** End *********/
    }

    /**
     * 返回栈中元素个数
     *
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * 判断一个栈是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return (null == head);
    }

    //链表结点内部类
    private static class Node<E> {
        private E item;
        private Node<E> next;
    }
}
