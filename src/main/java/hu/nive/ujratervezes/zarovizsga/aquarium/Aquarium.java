package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aquarium {

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
            if (fish.getWeight() >= 11) {
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
//- `addFish()`, amivel halakat lehet hozzáadni
//
//        - `feed()`, ami megeteti az összes halat az akváriumban, és ezzel megnöveli a súlyukat
//
//        - `removeFish()`, eltávolít minden olyan halat az akváriumból, ami legalább 11 grammos
//
//        - `getStatus()`, ami visszaadja a halak státuszát egy String listában

