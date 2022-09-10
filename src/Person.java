public class Person {

    private String name;
    private String surName;
    private int quantityTickets;

    public Person(String name, String surName, int quantityTickets) {
        this.name = name;
        this.surName = surName;
        this.quantityTickets = quantityTickets;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getQuantityTickets() {
        return quantityTickets;
    }

    public void setQuantityTickets(int quantityTickets) {
        this.quantityTickets = quantityTickets;
    }
}