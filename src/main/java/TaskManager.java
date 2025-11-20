import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(int id) {
        tasks.removeIf(t -> t.getId() == id);
    }

    public Optional<Task> getTask(int id) {
        return tasks.stream().filter(t -> t.getId() == id).findFirst();
    }

    public void markTaskCompleted(int id) {
        getTask(id).ifPresent(Task::markCompleted);
    }

    public int totalTasks() {
        return tasks.size();
    }
}
