package todo.mongo.todo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import todo.mongo.todo.Model.Task;
import todo.mongo.todo.Service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TodoController {
    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTask();
    }

    @PostMapping
    public String createTask(@RequestBody Task task) {
        taskService.createTask(task.getContent(), task.getDescription());
        return "Task added";
    }
}
