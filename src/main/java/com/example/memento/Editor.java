package com.example.memento;

public class Editor {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    // Guarda el estado actual en un memento
    public Memento save() {
        return new Memento(content);
    }

    // Restaura el estado desde un memento
    public void restore(Memento memento) {
        this.content = memento.getContent();
    }
}
