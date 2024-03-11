package com.todolist.project.repositories.todoRepository;

import com.todolist.project.models.todoModel.TodoListModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListRepository extends JpaRepository<TodoListModel, String> {
}
