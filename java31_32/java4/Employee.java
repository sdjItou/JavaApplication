public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getType();
}
