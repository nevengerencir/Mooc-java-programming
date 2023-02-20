public class Gift {
    private int weight;
    private String name;
    public Gift(String name, int weight){
        this.name=name;
        this.weight=weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return getName() + " (" +getWeight()+ "kg)";
    }
}
