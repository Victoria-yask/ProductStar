package Block2.practicalWork1.TaskMaster;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {
    private String title;
    private String description;
    private Date dueDate;
    private TaskStatus status;
    private String assignee;

    public Task(String title, String description, Date dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = TaskStatus.TODO;
        this.assignee = "Не назначена";
    }

    public final String getTitle() {
        return title;
    }

    public final void setTitle(String title) {
        this.title = title;
    }

    public final String getDescription() {
        return description;
    }

    public final void setDescription(String description) {
        this.description = description;
    }

    public final Date getDueDate() {
        return dueDate;
    }

    public final void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public final TaskStatus getStatus() {
        return status;
    }

    public final void setStatus(TaskStatus status) {
        this.status = status;
    }

    public final String getAssignee() {
        return assignee;
    }

    public final void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public final String getFormattedDueDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return dateFormat.format(dueDate);
    }
}
