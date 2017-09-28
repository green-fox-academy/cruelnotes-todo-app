public class PrintUsage {

    public String header;

    public PrintUsage(String header) {
        this.header = header;
    }

    public PrintUsage() {
        this("");
    }

    public void printHeader() {
        System.out.println("Command Line Todo application");
        System.out.printf("=============================%n");
        System.out.println("Command line arguments:");
        System.out.println("-l   Lists all the tasks");
        System.out.println("-a   Adds a new task");
        System.out.println("-r   Removes an task");
        System.out.println("-c   Completes an task");
    }

}
