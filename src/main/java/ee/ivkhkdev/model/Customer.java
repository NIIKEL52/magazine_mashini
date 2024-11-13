package ee.ivkhkdev.model;

import java.util.UUID;

public class Customer {
    private UUID id;
    private String firstName;
    private String lastName;
    private String phone;
    private int money;

    public Customer() {
        this.id = UUID.randomUUID();
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Customer(String firstName, String lastName, String phone, int money) {
        this.id = UUID.randomUUID();
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
        this.money = money;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;
        return id.equals(customer.id) && firstName.equals(customer.firstName) && lastName.equals(customer.lastName) && phone.equals(customer.phone);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + phone.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
