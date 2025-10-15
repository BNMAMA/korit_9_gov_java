package com.korit.study.ch14;

public class TodoService {
    TodoList todoList;

    public TodoService(TodoList todoList) {
        this.todoList = todoList;
    }

    void register(TodoRegisterDto todoRegisterDto) {
        Todo todo = todoRegisterDto.toTodo();
        todo.id = todoList.generatedTodoId();
        todoList.add(todo);
    }

    void printAllByUserId(User user) {
        Todo[] foundTodo = todoList.findAllByUserId(user.id);
        for (Todo todo : foundTodo) {
            System.out.println(todo.toString());
        }
    }
}
