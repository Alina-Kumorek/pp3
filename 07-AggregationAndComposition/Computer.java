public class Computer {
    private Processor cpu;
    private String motherboard;
    private String ram;
    private String gpu;
    private String hardDrive;
    private String monitor;
    private String keyboard;
    private String mouse;

    public void setCpu(Processor processor) {
        this.cpu = processor;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public void displaySpecs() {
        System.out.println("CPU:\t\t" + cpu.toString());
        System.out.println("Motherboard:\t" + motherboard);
        System.out.println("RAM:\t\t" + ram);
        System.out.println("GPU:\t\t" + gpu);
        System.out.println("Hard Drive:\t" + hardDrive);
        System.out.println("Monitor:\t" + monitor);
        System.out.println("Keyboard:\t" + keyboard);
        System.out.println("Mouse:\t\t" + mouse);
    }
}