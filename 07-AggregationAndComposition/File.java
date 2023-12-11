public class File {
    private String name;
    private String type;

    File(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + "." + type;
    }
}