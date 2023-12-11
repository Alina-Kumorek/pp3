import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<File> files;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<File>();
    }

    public void addFile(String nameType) {
        String[] nt = nameType.split("\\.");
        files.add(new File(nt[0], nt[1]));
    }

    public void remFile(String nameType) {
        for (int i = 0; i < files.size(); i++) {
            if (files.get(i).toString().equals(nameType)) {
                files.remove(i);
                break;
            }
        }
    }

    public void display() {
        System.out.println(name);
        System.out.println("----------");
        for (File f: files) {
            System.out.println(f.toString());
        }
        System.out.println("----------");
    }
}