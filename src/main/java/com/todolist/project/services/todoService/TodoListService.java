package com.todolist.project.services.todoService;

import com.todolist.project.models.todoModel.TodoListModel;
import com.todolist.project.repositories.todoRepository.TodoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoListService {

    @Autowired
    private TodoListRepository repository;

    public List<TodoListModel> listAll() {
        return repository.findAll();
    }

    public Optional<TodoListModel> listById(String id) {
        return repository.findById(id);
    }

    public TodoListModel createTodo(TodoListModel newTodo) {
        return repository.save(newTodo);
    }

    public TodoListModel updateTodo( String id, TodoListModel todo) {
        Optional<TodoListModel> updateTodo = repository.findById(id);
        return repository.save(todo);
    }

    public String deleteTodo(String id) {
        repository.deleteById(id);
        return "Sucesso!";
    }
}
