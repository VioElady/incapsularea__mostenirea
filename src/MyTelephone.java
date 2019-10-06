

public class MyTelephone extends MyNootebook {
    private String modely;

    MyTelephone(String name, int memory, float weight,String color,int price,String modely){
        super(name,memory,weight,color,price);
        this.modely=modely;
    }

    public void setName(String name) {
        this.modely=modely;
    }

    public String getName(){
        return this.modely;
    }

    public void setColor(String color)
    {
        super.setColor(color);
    }

    public String getColor(){
        return super.getColor();
    }
}
