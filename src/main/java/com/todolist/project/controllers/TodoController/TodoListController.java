package com.todolist.project.controllers.TodoController;

import com.todolist.project.models.todoModel.TodoListModel;
import com.todolist.project.services.todoService.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class TodoListController {

    @Autowired
    private TodoListService service;


    @GetMapping("todo_list")
    public ResponseEntity listAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.listAll());
    }

    @GetMapping("todo_list/{id}")
    public ResponseEntity listById(@PathVariable(value="id")String id) {
        if(id == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID não encontrado!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(service.listById(id));
    }

    @PostMapping("todo_list")
    public ResponseEntity<TodoListModel> createTodo(@RequestBody TodoListModel newTodo) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createTodo(newTodo));
    }

    @PutMapping("todo_list/{id}")
    public ResponseEntity<TodoListModel> updateTodo(@PathVariable(value = "id") @RequestBody TodoListModel updatedTodo) {
        return ResponseEntity.status(HttpStatus.OK).body(service.createTodo(updatedTodo));
    }

    @DeleteMapping("todo_list/{id}")
    public String deleteTodo(@PathVariable(value = "id") String id) {
            service.deleteTodo(id);
        return "Deletado com sucesso!!";
    }
}
