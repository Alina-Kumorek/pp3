// 12.	Write programs for the other two classes defined in the “During Class” section.

public class ComputerFileTest {
    public static void main(String[] args) {
        ComputerFile c = new ComputerFile("example", "txt", 16, "C:\\Documents");
        System.out.println(c.getPath());
        c.move("D:\\Private");
        System.out.println(c.getPath());
    }
}