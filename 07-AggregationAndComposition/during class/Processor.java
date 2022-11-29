
public class Processor {
    
    private String brandProcessor;
    private String model;
    private String material;
    private int numberOfCores;
    private int memoryRAM;

    public void setBrandProcessor(String brandProcessor) {
        this.brandProcessor = brandProcessor;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public void setMemoryRAM(int memoryRAM) {
        this.memoryRAM = memoryRAM;
    }

    public double sum(double a, double b){
        return a+b;
    }

    public String toString() {
        return "Processor [brandProcessor=" + brandProcessor + ", model=" + model + ", material=" + material
                + ", numberOfCores=" + numberOfCores + ", memoryRAM=" + memoryRAM + "]";
    }
    

    public Processor(String brandProcessor, String model, String material, int numberOfCores, int memoryRAM) {
        setBrandProcessor(brandProcessor);
        setModel(model);
        setMaterial(material);
        setNumberOfCores(numberOfCores);
        setMemoryRAM(memoryRAM);
    }

    public static void main(String[] args){
    }

}