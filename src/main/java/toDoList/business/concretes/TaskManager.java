package toDoList.business.concretes;

import toDoList.business.abstracts.TaskService;


import org.springframework.stereotype.Service;
//import toDoList.business.request.CreateTaskRequest;
import toDoList.dataAccess.abstracts.TaskRepository;
import toDoList.entities.concretes.Task;

import java.util.List;


@Service // Bu sınıf bir Business nesnesidir.
public class TaskManager implements TaskService {

    private TaskRepository taskRepository;

    public TaskManager(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task add(Task task) {
        return taskRepository.save(task);
    }

//    @Override
//    public void deleteById(int id) {
//        taskRepository.deleteById(id);
//    }

//    @Override
//    public void save(Task task) {
//        deleteById(task.getId());
//        add(task);
//
//    }


//    @Override
//    public void add(CreateTaskRequest createTaskRequest) {
//    Task task = new Task();
//    task.setName();
//    this.taskRepository.save(task);
//
//    }
//
//    @Override
//    public void update() {
//
//    }
//
//    @Override
//    public void delete() {
//
//    }
}
