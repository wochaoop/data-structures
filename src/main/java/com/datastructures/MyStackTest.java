package com.datastructures;

import java.util.Scanner;

/**
 * Created by sykus on 2017/12/29.
 * to be or not to - be - - that - - - is
 * it was - the best - of times - - - it	was - the - -
 */
public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> s = new MyStack<>();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.next();
            if (!str.equals("-")) {
                s.push(str);
            } else {
                System.out.print(s.pop() + " ");
            }
        }
    }
}
