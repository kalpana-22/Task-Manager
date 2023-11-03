package com.tasks.accessingdatarest.Controller;

import ch.qos.logback.core.status.Status;
import com.tasks.accessingdatarest.Model.Tasks;
import com.tasks.accessingdatarest.Model.Tasks;
import com.tasks.accessingdatarest.Service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("tasks")
public class TaskController {

    @Autowired
    TasksService tasksService;

    @GetMapping("allTasks")
    public ResponseEntity<List<Tasks>> getAllTasks() {
        return tasksService.getAllTasks();
    }

    @GetMapping("type/{status}")
    public ResponseEntity<List<Tasks>> getTasksByStatus(@PathVariable("status") com.tasks.accessingdatarest.Model.Status status){
        return tasksService.getTasksByStatus(status);
    }

    @GetMapping("userId")
    public ResponseEntity<List<Tasks>> getTasksByUserId(@RequestParam int userId){
        return tasksService.getTasksByUserId(userId);
    }

    @PostMapping("add")
    public ResponseEntity<String> addTask(@RequestBody Tasks task){
        return tasksService.addTask(task);
    }

    @DeleteMapping("remove")
    public ResponseEntity<String> removeTask(@RequestParam int id){
        return tasksService.removeTask(id);
    }

    @PutMapping("update")
    public ResponseEntity<Tasks> updateTaskByStatus(@RequestParam int id,@RequestParam com.tasks.accessingdatarest.Model.Status status){
        return tasksService.updateTaskByStatus(id,status);
    }
}
