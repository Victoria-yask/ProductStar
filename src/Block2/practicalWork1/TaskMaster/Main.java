package Block2.practicalWork1.TaskMaster;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Main {

    // метод для создания даты (год, месяц, день)
    private static Date createDate(int year, int month, int day) {
        LocalDate localDate = LocalDate.of(year, month, day);
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        //создаем проекты
        Project smartLiving = new Project("Умный дом", "Система управления умным домом");
        Project javaBeans = new Project("Кофейня", "Симулятора работы кофейни для обучения баристов");

        //добавляем проекты
        taskManager.addProject(smartLiving);
        taskManager.addProject(javaBeans);

        //создаем задачи
        Task task1SL = new Task("Анализ структуры классов Умного дома", "Исследовать базовую структуру классов для системы управления умным домом", createDate(2026, 11, 20));
        Task task2SL = new Task("Создание структуры классов Умного дома", "Создть базовую структуру классов для системы управления умным домом", createDate(2026, 12, 10));
        Task task1JB = new Task("Анализ базовой версии симулятора кофейни", "Исследовать базовую версию симулятора кофейни", createDate(2026, 11, 20));
        Task task2JB = new Task("Создание базовой версии симулятора кофейни", "Создать базовую версию симулятора кофейни", createDate(2026, 12, 10));

        //добавляем задачу в проект
        smartLiving.addTask(task1SL);
        smartLiving.addTask(task2SL);
        javaBeans.addTask(task1JB);
        javaBeans.addTask(task2JB);

        //назначаем задачу
        smartLiving.assign(task1SL, "Иван");
        smartLiving.assign(task2SL, "Артем");
        javaBeans.assign(task1JB, "Владислав");

        //выполняем задачу
        smartLiving.start(task1SL);
        smartLiving.start(task2SL);
        javaBeans.start(task1JB);

        //завершаем задачу
        smartLiving.complete(task1SL);

        //сортируем задачи по исполнителю и выводим
        smartLiving.sortTasks("assignee");
        smartLiving.printTasks();

        javaBeans.sortTasks("assignee");
        javaBeans.printTasks();

        //сортируем задачи по дате и выводим
        smartLiving.sortTasks("dueDate");
        smartLiving.printTasks();

        javaBeans.sortTasks("dueDate");
        javaBeans.printTasks();

        //сортируем задачи по статусу и выводим
        smartLiving.sortTasks("status");
        smartLiving.printTasks();

        javaBeans.sortTasks("status");
        javaBeans.printTasks();
        
        //выводим количество проектов
        System.out.println("--------------------");
        System.out.println("Всего проектов " + taskManager.getProjectsCount());

        //выводим описание всех проектов
        taskManager.displayAllProjects();

        //выводим количество задач в проекте
        Project.ProjectStats.printTotalTask(smartLiving);
        Project.ProjectStats.printTotalTask(javaBeans);

        //выводим задачи по статусам
        Project.ProjectStats.printTasksByStatus(smartLiving);
        Project.ProjectStats.printTasksByStatus(javaBeans);

    }
}
