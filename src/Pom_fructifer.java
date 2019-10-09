
public class Pom_fructifer extends Arbore{
    private int nr_fruits;

    Pom_fructifer(String name,int frunze,int ramuri,int nr_fruits){
        super(name,frunze,ramuri);
        this.nr_fruits=nr_fruits;
    }

    public int getNr_fruits(){
        return this.nr_fruits;
    }

    public void setNr_fruits(int nr_fruits){
        this.nr_fruits=nr_fruits; }

    @Override
    public String toString() {
        return (" Eu am un arbore cu denumirea "+getName()+" care are "+ getLeaves()+" de frunze, "+ getBranches()+ " de ramuri si cu " +getNr_fruits()+" de fructe. ");
    }
}

