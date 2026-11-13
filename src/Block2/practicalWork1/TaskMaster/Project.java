package Block2.practicalWork1.TaskMaster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Project implements Manageable {
    private String titleProject;
    private String descriptionProject;
    private List<Task> tasks;


    public Project(String titleProject, String descriptionProject) {
        this.titleProject = titleProject;
        this.descriptionProject = descriptionProject;
        this.tasks = new ArrayList<>();
    }

    public String getTitleProject() {
        return titleProject;
    }

    public void setTitleProject(String titleProject) {
        this.titleProject = titleProject;
    }

    public String getDescriptionProject() {
        return descriptionProject;
    }

    public void setDescriptionProject(String descriptionProject) {
        this.descriptionProject = descriptionProject;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    //добавить задачу
    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("--------------------");
        System.out.println("Задача создана в проекте " + titleProject + "\n Название: " + task.getTitle() + "\n Описание: " + task.getDescription() + "\n Дата выполнения: "
                + task.getFormattedDueDate() + "\n Статус: " + task.getStatus() + "\n Исполнитель: " + task.getAssignee());
    }

    //назначить задачу
    @Override
    public void assign(Task task, String assigneeName) {
        task.setAssignee(assigneeName);
        System.out.println("--------------------");
        System.out.println("Задача " + task.getTitle() + " назначена на " + task.getAssignee());
    }

    //начать выполнение задачи
    @Override
    public void start(Task task) {
        task.setStatus(TaskStatus.IN_PROGRESS);
        System.out.println("--------------------");
        System.out.println("Задача " + task.getTitle() + " переведа в статус " + task.getStatus());
    }

    //завершить задачу
    @Override
    public void complete(Task task) {
        task.setStatus(TaskStatus.DONE);
        System.out.println("--------------------");
        System.out.println("Задача " + task.getTitle() + " переведа в статус " + task.getStatus());
    }

    //класс TaskComparator - правила для сортировки задач
    public static class TaskComparator implements Comparator<Task> {
        private final String criteria;

        public TaskComparator(String criteria) {
            this.criteria = criteria;
        }

        @Override
        public int compare(Task t1, Task t2) {

            //сортировка по дате (от понедельника к воскресенью)
            if ("dueDate".equalsIgnoreCase(criteria)) {
                return t1.getDueDate().compareTo(t2.getDueDate());
            }

            // сортировка по статусу (TODO, IN_PROGRESS, DONE)
            else if ("status".equalsIgnoreCase(criteria)) {
                return t1.getStatus().compareTo(t2.getStatus());
            }

            // сортировка по исполнителю (по алфавиту)
            else if ("assignee".equalsIgnoreCase(criteria)) {
                return t1.getAssignee().compareTo(t2.getAssignee());
            }
            return 0;
        }
    }

    //сортировка задач
    public void sortTasks(String criteria) {
        tasks.sort(new TaskComparator(criteria));
        System.out.println("--------------------");
        System.out.println("Задачи отсортированы по критерию: " + criteria + " в проекте " + titleProject);
    }

    //печать списка задач
    public void printTasks() {
        for (Task t : tasks) {
            System.out.println(
                    "Название: " + t.getTitle() +
                            " | День: " + t.getFormattedDueDate() +
                            " | Статус: " + t.getStatus() +
                            " | Исполнитель: " + t.getAssignee()
            );
        }
    }

        //класс ProjectStats - статистика проектам и задачам
    public static class ProjectStats {

        //всего задач по проекту
        public static void printTotalTask(Project project) {
            int countProject = project.getTasks().size();
            System.out.println("---------------------");
            System.out.println("Всего задач: " + countProject + " в проекте " + project.getTitleProject());
        }

        //всего задач по статусу
        public static void printTasksByStatus(Project project) {
            int todoCount = 0;
            int inProgressCount = 0;
            int doneCount = 0;

            for (Task task : project.getTasks()) {
                if (task.getStatus() == TaskStatus.TODO) {
                    todoCount++;
                } else if (task.getStatus() == TaskStatus.IN_PROGRESS) {
                    inProgressCount++;
                } else if (task.getStatus() == TaskStatus.DONE) {
                    doneCount++;
                }
            }

            System.out.println("---------------------");
            System.out.println("Статистика задач по статусам для проекта: " + project.getTitleProject());
            System.out.println("TODO: " + todoCount);
            System.out.println("IN_PROGRESS: " + inProgressCount);
            System.out.println("DONE: " + doneCount);
        }
    }

}


