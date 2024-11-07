package com.example.memento;

import java.util.Stack;

public class Caretaker {
    private final Stack<Memento> history = new Stack<>();

    public void save(Editor editor) {
        history.push(editor.save());
    }

    public void undo(Editor editor) {
        if (!history.isEmpty()) {
            editor.restore(history.pop());
        } else {
            System.out.println("No hay estados previos para deshacer.");
        }
    }
}