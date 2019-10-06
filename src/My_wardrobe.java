

public class My_wardrobe {
    private int number;
    private int number_pants;
    private String[] colors ={"red","black","blue"};
    private String[] models={"pants","jackets","pullovers","skirts"};

    My_wardrobe(int number,int number_pants){
        this.number=number;
        this.number_pants=number_pants;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber_pants(int number_pants) {
        this.number_pants = number_pants;
    }

    public int getNumber_pants() {
        return number_pants;
    }
}
