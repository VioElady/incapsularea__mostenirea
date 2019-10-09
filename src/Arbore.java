

public class Arbore {
    private String name;
    private int leaves;
    private int branches;
    private int stem = 1;

    Arbore(String name, int leaves, int branches){
        this.name=name;
        this.leaves=leaves;
        this.branches=branches;
    }

    public String getName() {
        return this.name;
    }

    public int getLeaves() {
        return this.leaves;
    }

    public int getBranches() {
        return this.branches;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLeaves(int leaves) {
        this.leaves = leaves;
    }

    public void setBranches(int branches) {
    this.branches = branches;
    }
    @Override
    public String toString() {
        return (" Eu am un arbore cu denumirea " + name + " , el are " + leaves + " frunze si "+ branches + " ramuri.");
    }
}
