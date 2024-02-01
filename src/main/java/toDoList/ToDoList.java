package toDoList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "toDoList")
@SpringBootApplication
public class ToDoList {

	public static void main(String[] args) {
		SpringApplication.run(ToDoList.class, args);
	}

}
