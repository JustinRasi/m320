public class Passagier {
    private String name;

    public Passagier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Passagier{" +
                "name='" + name + '\'' +
                '}';
    }
}
