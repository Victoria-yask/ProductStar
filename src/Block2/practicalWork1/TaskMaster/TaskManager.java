package Block2.practicalWork1.TaskMaster;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Project> projects;

    public TaskManager() {
        this.projects = new ArrayList<>();
    }

    public void addProject(Project project) {
        projects.add(project);
        System.out.println("--------------------");
        System.out.println("Проект создан." + "\n Название: " + project.getTitleProject() + "\n Описание: " + project.getDescriptionProject());
    }

    // всего проектов
    public int getProjectsCount() {
        return projects.size();
    }

    //вывести все проекты
    public void displayAllProjects() {
        System.out.println("--------------------");
        System.out.println("Проекты: ");
        for (Project p: projects){
            System.out.println("Название: " + p.getTitleProject() + " Описание: " + p.getDescriptionProject());
        }
    }

}
