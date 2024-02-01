package toDoList.webApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import toDoList.business.abstracts.TaskService;
//import toDoList.business.concretes.TaskManager;
//import toDoList.business.request.CreateTaskRequest;
//import toDoList.dataAccess.abstracts.TaskRepository;
import toDoList.entities.concretes.Task;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TasksController {
    private TaskService taskService;

    @Autowired
    public TasksController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/getall")
    public List<Task> getAll() {
        return taskService.getAll();
    }
    @PostMapping("/add")
    public Task add(Task task){
        return  taskService.add(task);
    }

//    @DeleteMapping("/delete")
//    public void deleteById(int id){
//        taskService.deleteById(id);
//    }


//    @PutMapping("/update/{id}")
//    public void save(@RequestBody Task task, @PathVariable int id){
//        taskService.deleteById(id);
//        taskService.save(task);

//    }

    //
//    @PostMapping("/add")
//    public void add(CreateTaskRequest createTaskRequest) {
//        this.taskService.add(createTaskRequest);
//    }

}
