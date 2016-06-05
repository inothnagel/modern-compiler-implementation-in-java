package com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives;

public class LastExpList extends ExpList {
    public Exp head;

    public LastExpList(Exp head) {
        this.head = head;
    }

    public String toString() {
        return head.toString();
    }

    public Exp getHead() {
        return head;
    }
}
