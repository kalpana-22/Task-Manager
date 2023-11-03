package com.tasks.accessingdatarest.Service;

import com.tasks.accessingdatarest.Dao.TaskDao;
import com.tasks.accessingdatarest.Model.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TasksService {

    @Autowired
    TaskDao taskDao;
    public ResponseEntity<List<Tasks>> getAllTasks() {
        try {
            return new ResponseEntity<>(taskDao.findAll(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Tasks>> getTasksByStatus(com.tasks.accessingdatarest.Model.Status status) {
        try {
            return new ResponseEntity<>(taskDao.findByStatus(status), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Tasks>> getTasksByUserId(int userId) {
        try {
            return new ResponseEntity<>(taskDao.findByUserId(userId), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addTask(Tasks task) {
        task.setUserId(1);//Until multiple user access creation
        taskDao.save(task);
        return new ResponseEntity<>("Create Success",HttpStatus.OK);
    }

    public ResponseEntity<String> removeTask(int id) {
        taskDao.delete(taskDao.getById(id));
        return new ResponseEntity<>("Delete Success",HttpStatus.OK);
    }

    public ResponseEntity<Tasks> updateTask(Tasks updatedTask) {
        try {
            int taskId = updatedTask.getId();
            Optional<Tasks> existingTaskOptional = taskDao.findById(taskId);

            if (existingTaskOptional.isPresent()) {
                Tasks existingTask = existingTaskOptional.get();

                existingTask.setStatus(updatedTask.getStatus());
                existingTask.setLastUpdatedDateTime(new Date());

                return new ResponseEntity<>(taskDao.save(existingTask), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(new Tasks(), HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(new Tasks(), HttpStatus.BAD_REQUEST);
        }
    }
}
