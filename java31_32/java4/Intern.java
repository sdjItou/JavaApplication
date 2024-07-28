public class Intern extends Employee {
    public static final int INTERN = 2;

    public Intern(String name) {
        super(name);
    }

    @Override
    public int getType() {
        return INTERN;
    }
}
