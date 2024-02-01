package toDoList.business.abstracts;



import org.springframework.stereotype.Service;
//import toDoList.business.request.CreateTaskRequest;
//import toDoList.business.response.GetAllTaskResponse;
import toDoList.entities.concretes.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAll(); // Tüm taskları ekrana getirme


    Task add(Task task);

//    void deleteById(int id);

    //    void save(Task task);


//    void add(CreateTaskRequest createTaskRequest);
////    void update();  // Task Güncelleme
////    void delete();  // Task silme
//



}
