package Block2.practicalWork1.TaskMaster;

public interface Manageable {

    void assign(Task task, String assigneeName);
    public void start(Task task);
    public void complete(Task task);

}
