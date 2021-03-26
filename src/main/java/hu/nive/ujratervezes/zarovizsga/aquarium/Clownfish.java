package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Clownfish extends Fish{

    public Clownfish(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public String status() {
        return getName() + ", weight: " + getWeight() + ", color: " + getColor() + ", short term memory loss: false";
    }

    @Override
    public void feed() {
        setWeight(getWeight() + 1);
    }

    @Override
    public boolean hasMemoryLoss() {
        return false;
    }
}
