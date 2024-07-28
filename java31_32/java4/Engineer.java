public class Engineer extends Employee {
    public static final int ENGINEER = 0;

    public Engineer(String name) {
        super(name);
    }

    @Override
    public int getType() {
        return ENGINEER;
    }
}
