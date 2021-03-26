package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aquarium {

    public static final int MIN_WEIGHT = 11;

    private List<Fish> fishes = new ArrayList<>();

    public List<Fish> getFishes() {
        return fishes;
    }

    public void addFish(Fish fish) {
        fishes.add(fish);
    }

    public void feed() {
        for (Fish fish: fishes) {
            fish.feed();
        }
    }

    public void removeFish() {
        Iterator<Fish> iterator = fishes.iterator();
        while (iterator.hasNext()) {
            Fish fish = iterator.next();
            if (fish.getWeight() >= MIN_WEIGHT) {
                iterator.remove();
            }
        }
    }

    public List<String> getStatus() {
        List<String> result = new ArrayList<>();
        for (Fish fish: fishes) {
            result.add(fish.status());
        }
        return result;
    }

}
