public class Manager extends Employee {
    public static final int MANAGER = 1;

    public Manager(String name) {
        super(name);
    }

    @Override
    public int getType() {
        return MANAGER;
    }
}
