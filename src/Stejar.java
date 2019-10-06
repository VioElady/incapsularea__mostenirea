
public class Stejar extends Arbore{
    private int nr_fruits;

    Stejar(String name,int frunze,int ramuri,int nr_fruits){
        super(name,frunze,ramuri);
        this.nr_fruits=nr_fruits;
    }

    public int getNr_fruits(){
        return this.nr_fruits;
    }

    public void setNr_fruits(int nr_fruits){
       this.nr_fruits=nr_fruits; }
}
