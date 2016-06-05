package com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives;

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
