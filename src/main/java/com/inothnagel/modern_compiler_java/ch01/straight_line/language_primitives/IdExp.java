package com.inothnagel.modern_compiler_java.ch01.straight_line.language_primitives;

public class IdExp extends Exp {
    public String id;

    public IdExp(String id) {
        this.id = id;
    }

    public String toString() {
        return id;
    }

    public String getId() {
        return id;
    }
}
