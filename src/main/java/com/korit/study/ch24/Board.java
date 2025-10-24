package com.korit.study.ch24;

import java.util.List;
import java.util.Objects;

public class Board {
    private String title;
    private Writer writer;
    private String content;
    private List<Comment> comments; //댓글의 묶음을 넣어야 함(순서가 존재)

    public Board() {}

    public Board(String title, Writer writer, String content, List<Comment> comments) {
        this.title = title;
        this.writer = writer;
        this.content = content;
        this.comments = comments;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return Objects.equals(title, board.title) && Objects.equals(writer, board.writer) && Objects.equals(content, board.content) && Objects.equals(comments, board.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, writer, content, comments);
    }

    @Override
    public String toString() {
        return "Board{" +
                "title='" + title + '\'' +
                ", writer=" + writer +
                ", content='" + content + '\'' +
                ", comments=" + comments +
                '}';
    }
}
