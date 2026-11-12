package Block2.practicalWork1.JavaBeans;

public enum PastryType {
    WITHSUGAR("с сахаром"),
    WITHOUTSUGAR("без сахара");

    private final String ruName;

    PastryType(String ruName) {
        this.ruName = ruName;
    }

    @Override
    public String toString() {
        return ruName;
    }
}
