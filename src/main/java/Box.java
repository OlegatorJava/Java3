import java.util.ArrayList;

public class Box <T extends Fruit>{
    private final ArrayList<T> box;
    private double weight;

    public Box() {
        this.box = new ArrayList<>();
    }

    public ArrayList<T> getBox() {
        return box;
    }

    public double getWeight2(){
        return weight;
    }

    public double getWeight() {
        for (T apple: box) {
            weight += apple.getWeight();
        }
        return weight;
    }

    public void add(T apple) {
        box.add(apple);
    }

    public boolean compare(double w){
        return Math.abs(this.weight - w) < 0.0001;
    }

    public void sprinkle(ArrayList<T> newBox) {
        newBox.addAll(box);
        box.clear();
    }
}
