package todo.mongo.todo.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import todo.mongo.todo.Model.Task;

@Repository
public interface TaskRepository extends MongoRepository<Task, ObjectId> {
}
