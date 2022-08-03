public class customer {
    int id ;
    String name;
    char geneder;

    public customer(int id, String name, char geneder) {
        this.id = id;
        this.name = name;
        this.geneder = geneder;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGeneder() {
        return geneder;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGeneder(char geneder) {
        this.geneder = geneder;
    }

    @Override
    public String toString() {
        return "customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", geneder=" + geneder +
                '}';
    }
}
