import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class AddNewTask {

    public String task;

    public AddNewTask(String task) {
        this.task = task;
    }

    public AddNewTask() {
        this("");
    }

    public void writeLine(String task) {
        Path fileSource = Paths.get("src/my-todo-log.txt");

        List<String> content = new ArrayList();
        content.add(task);

        try {
            Files.write(fileSource, content, StandardOpenOption.APPEND);
        } catch (IOException e) {
            //    System.out.println("Unable to read file: my-file.txt");
        }
    }
}
