package todo.mongo.todo.Service;

import org.bson.types.ObjectId;
import todo.mongo.todo.Model.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTask();
    void createTask(String content, String description);
    void deleteTask(ObjectId id);
    void toggleTask(ObjectId id);
}
