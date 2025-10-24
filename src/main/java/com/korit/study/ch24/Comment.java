package com.korit.study.ch24;

import java.util.Objects;

public class Comment {
    private Writer writer;
    private String content;

    public Comment() {}

    public Comment(Writer writer, String content) {
        this.writer = writer;
        this.content = content;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(writer, comment.writer) && Objects.equals(content, comment.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(writer, content);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "writer=" + writer +
                ", content='" + content + '\'' +
                '}';
    }
}
