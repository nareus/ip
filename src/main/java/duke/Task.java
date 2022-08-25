package duke;

public abstract class Task {
    private boolean isDone = false;
    private String item;

    public void setDone() {this.isDone = true;}

    public void setNotDone() {
        this.isDone = false;
    }
    public abstract String getTask();

    public void setItem(String item) {
        this.item = item;
    }

    public String getItem() {
        return this.item;
    }

    public String getStatusIcon() {
        return (isDone ? "[X] " : "[ ] "); // mark done task with X
    }
}