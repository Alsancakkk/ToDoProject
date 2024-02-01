package toDoList.dataAccess.abstracts;

import toDoList.entities.concretes.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Integer> { // JpaRepository getAll gibi operasyonları sağlar


}
