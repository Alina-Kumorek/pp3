// 8.	Based on the created class diagrams, define all classes.

public class ComputerFile {
    private String name;
    private String type;
    private int size;
    private String dateCreated;
    private String path;

    private static String currentDate = "2023-11-26";

    public ComputerFile(String name, String type, int size, String path) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.path = path;
        this.dateCreated = ComputerFile.currentDate;
    }

    public String getNameType() {
        return name + "." + type;
    }

    public int getSize() {
        return size;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getPath() {
        return path + "\\" + name + "." + type;
    }

    public void open() {
        System.out.println("File " + name + "." + type + " is opened.");
    }

    public void copy(String path) {
        System.out.println("File " + name + "." + type + " is copied to " + path + ".");
    }

    public void move(String path) {
        this.path = path;
        System.out.println("File " + name + "." + type + " is moved to " + path + ".");
    }

    public void delete() {
        System.out.println("File " + name + "." + type + " is deleted.");
    }
}