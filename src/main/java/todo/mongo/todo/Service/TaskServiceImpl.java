package todo.mongo.todo.Service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todo.mongo.todo.Model.Task;
import todo.mongo.todo.Repository.TaskRepository;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    @Override
    public void createTask(String content, String description) {
        Task task = new Task();
        task.setContent(content);
        task.setDescription(description);
        task.setCompleted(false);
        taskRepository.save(task);
    }

    @Override
    public void deleteTask(ObjectId id) {
        // Implement delete logic
    }

    @Override
    public void toggleTask(ObjectId id) {
        // Implement toggle logic
    }
}
