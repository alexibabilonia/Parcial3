import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    @Test
    void testAddAndRemoveTask() {
        TaskManager manager = new TaskManager();
        Task task = new Task(1, "Tarea 1", "Descripción");
        manager.addTask(task);
        assertEquals(1, manager.totalTasks());

        manager.removeTask(1);
        assertEquals(0, manager.totalTasks());
    }

    @Test
    void testMarkTaskCompleted() {
        TaskManager manager = new TaskManager();
        Task task = new Task(2, "Tarea 2", "Descripción");
        manager.addTask(task);
        manager.markTaskCompleted(2);
        assertTrue(task.isCompleted());
    }
}
