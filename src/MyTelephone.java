

public class MyTelephone extends MyDevice {
    private String model;
    private String desing;

    MyTelephone(String Name, int Memory, double Weight,String Color,int Price,String model,String desing){
        super(Name,Memory,Weight,Color,Price);
        this.model=model;
        this.desing=desing;
    }

    public void setName(String name) {
        this.model=model;
    }

    public String getName(){
        return this.model;
    }
    public void setDesing(String desing){
        this.desing=desing;
    }

    public String getDesing() {
        return desing;
    }

    @Override
    public String toString() {
        return ("Dispozitivul  meu are denumirea de "+ getName()+ ", are culoarea "+ getColor()+ ", pretul= "+ getPrice()+" modelul= "+ model+ " si desingul "+ desing);
    }
}
