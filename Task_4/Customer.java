package by.epam.Unit04;

import java.util.Objects;

public class Customer {
    private String name;
    private String transport;

    public Customer(String name, String transport) {
        this.name = name;
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public void getVariantOfTraveling(){
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return name.equals(customer.name) &&
                transport.equals(customer.transport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, transport);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transport='" + transport + '\'' +
                '}';
    }
}
