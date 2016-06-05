package com.inothnagel.modern_compiler_java.ch01.straight_line;

/**
 * Created by inothnagel on 2016/06/05.
 */
public class PairExpList extends ExpList {
    public Exp head;
    public ExpList tail;

    public PairExpList(Exp head, ExpList tail) {
        this.head = head;
        this.tail = tail;
    }

    public String toString() {
        return head.toString() + ", " + tail.toString();
    }
}
