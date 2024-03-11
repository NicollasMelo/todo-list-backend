package com.todolist.project.models.todoModel;

import jakarta.persistence.*;

@Entity
@Table(name = "todo_list")
public class TodoListModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String todo_name;
    private String todo_description;
    private Boolean realized;

    public TodoListModel(String id, String todo_name, String todo_description, Boolean realized) {
        this.id = id;
        this.todo_name = todo_name;
        this.todo_description = todo_description;
        this.realized = realized;
    }

    public TodoListModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTodo_name() {
        return todo_name;
    }

    public void setTodo_name(String todo_name) {
        this.todo_name = todo_name;
    }

    public String getTodo_description() {
        return todo_description;
    }

    public void setTodo_description(String todo_description) {
        this.todo_description = todo_description;
    }

    public Boolean getRealized() {
        return realized;
    }

    public void setRealized(Boolean realized) {
        this.realized = realized;
    }
}
