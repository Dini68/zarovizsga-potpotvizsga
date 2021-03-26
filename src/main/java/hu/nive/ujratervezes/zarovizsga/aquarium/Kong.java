package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Kong extends Fish{

    public Kong(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public String status() {
        return getName() + ", weight: " + getWeight() + ", color: " + getColor() + ", short term memory loss: false";
    }

    @Override
    public void feed() {
        setWeight(getWeight() + 2);
    }

    @Override
    public boolean hasMemoryLoss() {
        return false;
    }
}
