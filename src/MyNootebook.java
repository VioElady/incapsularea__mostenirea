

   public class MyNootebook {
       private String name;
       private int price;
       private int memory;
       private String color;
       private float weight;


       MyNootebook(String name, int memory, float weight,String color,int price) {
           this.name = name;
           this.memory = memory;
           this.weight = weight;
           this.color=color;
           this.price=price;
       }

       MyNootebook(int price, int memory, String color, String name) {
           this.price = price;
           this.memory = memory;
           this.color = color;
           this.name = name;
       }

       public String getName() {
           return this.name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public String getColor() {
           return this.color;
       }

       public void setColor(String color) {
           this.color = color;
       }

       public String toString() {
           return ("Dispozitivul  meu are deumirea de "+ this.name+ ", are culoarea "+ this.getColor()+ " si are pretul de "+ this.price );
       }
   }
