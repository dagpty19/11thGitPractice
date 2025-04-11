public class Task {
    private String description;
    private boolean completed;
    private int priority;

    public Task(String description, int priority) {
        this.description = description;
        this.completed = false;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return "Task: " + description + (completed ? " [Completed]" : " [Pending]") +
                " (Priority: " + priority + ")";
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
