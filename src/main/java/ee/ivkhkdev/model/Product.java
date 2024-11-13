package ee.ivkhkdev.model;
import java.util.Objects;
import java.util.UUID;

public class Product {
    private String name;
    private int cost;
    private int count;
    private UUID ID;

    public Product(String name,int count,int cost){
        this.name = name;
        this.cost = cost;
        this.count = count;
        this.ID = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Product{" +
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
        Product product = (Product) o;
        return cost == product.cost && count == product.count && Objects.equals(name, product.name) && Objects.equals(ID, product.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, count, ID);
    }


}

