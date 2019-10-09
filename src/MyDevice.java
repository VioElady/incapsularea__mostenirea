
public class MyDevice {
    private String name;
    private int price;
    private int memory;
    private String color;
    private double weight;


    MyDevice(String name, int memory, double weight,String color,int price) {
        this.name = name;
        this.memory = memory;
        this.weight = weight;
        this.color=color;
        this.price=price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return ("Dispozitivul  meu are denumirea de "+ name+ ", are culoarea "+ color+ " si are pretul de "+ price+ " si greutatea de "+ weight );
    }
}