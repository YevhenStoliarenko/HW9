package MyArray;

public class Fund {
    public int datierung;
    public String reference;

    @Override
    public String toString() {
        return "Fund{" +
                "datierung=" + datierung +
                ", reference='" + reference + '\'' +
                '}';
    }

    public Fund(int datierung, String reference) {
        this.datierung = datierung;
        this.reference = reference;

    }
}
