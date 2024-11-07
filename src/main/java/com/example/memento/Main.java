package com.example.memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Caretaker caretaker = new Caretaker();

        // Set initial content and save state
        editor.setContent("Version 1 of the content.");
        System.out.println("Current content: " + editor.getContent());
        caretaker.save(editor);

        // Make changes and save each state
        editor.setContent("Version 2 of the content.");
        System.out.println("Current content: " + editor.getContent());
        caretaker.save(editor);

        editor.setContent("Version 3 of the content.");
        System.out.println("Current content: " + editor.getContent());
        caretaker.save(editor);

        editor.setContent("Version 4 of the content.");
        System.out.println("Current content: " + editor.getContent());

        // Undo changes multiple times
        caretaker.undo(editor);
        System.out.println("After undo: " + editor.getContent());

        caretaker.undo(editor);
        System.out.println("After undo: " + editor.getContent());

        caretaker.undo(editor);
        System.out.println("After undo: " + editor.getContent());

        // Attempt another undo to test when history is empty
        caretaker.undo(editor);
        System.out.println("After undo: " + editor.getContent());
    }
}
