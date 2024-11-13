package ee.ivkhkdev.model;

import java.util.Objects;
import java.util.UUID;

public class Purchase {
    private String name;
    private int cost;
    private int count;
    private UUID ID;

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", count=" + count +
                ", ID=" + ID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return cost == purchase.cost && count == purchase.count && Objects.equals(name, purchase.name) && Objects.equals(ID, purchase.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, count, ID);
    }
    public Purchase(String name,int count,int cost){
        this.name = name;
        this.cost = cost;
        this.count = count;
        this.ID = UUID.randomUUID();
    }
}
