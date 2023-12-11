public class Processor {
    private String model;
    private int cores;
    private float frequency;
    
    public Processor(String model, int cores, float frequency) {
        this.model = model;
        this.cores = cores;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return String.format("%s; %d core(s); %.1f GHz", model, cores, frequency);
    }
}