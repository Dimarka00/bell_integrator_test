package task5;

import java.util.Objects;

public class Item {

    int weight;
    int cost;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return weight == item.weight && cost == item.cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, cost);
    }
}
