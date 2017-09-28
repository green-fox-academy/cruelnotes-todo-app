import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ListTasks {

    String logPath;


    public ListTasks(String logPath) {
        this.logPath = logPath;
    }

    public ListTasks() {
        this("src/my-todo-log.txt");
    }
 //   Path fileSource = Paths.get("src/my-file.txt");

    public void printList() throws IOException {
        Path fileSource = Paths.get(logPath);
        FileReader fReader = new FileReader(logPath);
        if (fReader.read() == -1) {
            System.out.println("No todos for today! :)");
        } else {
            int i = 1;
            List<String> lines = null;
              try {
                lines = Files.readAllLines(fileSource);

            } catch (IOException e) {
                System.out.println("Unable to read file: my-todo-log.txt");
            }

//            for (String line: lines) {
//                if (!"".equals(line.trim())) {
//                    System.out.println(line);
//                }
//            }

            for (String line: lines) {
                System.out.println(i + " - " + line);
                i++;
            }
        }
    }
}

