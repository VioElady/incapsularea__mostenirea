

public class Arbore {
    private String name;
    private int frunze;
    private int ramuri;
    private int tulpina = 1;

    Arbore(String name, int frunze, int ramuri){
        this.name=name;
        this.frunze=frunze;
        this.ramuri=ramuri;
    }

    Arbore(String name,int frunze) {
        this.name = name;
        this.frunze = frunze;
    }

    public String getName() {
        return this.name;
    }

    public int getFrunze() {
        return this.frunze;
    }

    public int getRamuri() {
        return this.ramuri;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFrunze(int frunze) {
        this.frunze = frunze;
    }

    public void setRamuri(int ramuri) {
    this.ramuri = ramuri;
    }
    public String toString() {
        return (" Eu un arbore cu denumirea " + this.name + " , el are " + this.frunze + " frunze si "+ this.ramuri + " ramuri");
    }
}
