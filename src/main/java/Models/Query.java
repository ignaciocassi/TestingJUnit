package Models;

public class Query {

    private String operation;
    private int index;
    private int value;

    public Query(String operation, int index, int value) {
        this.operation = operation;
        this.index = index;
        this.value = value;
    }

    public Query(String operation, int index) {
        this.operation = operation;
        this.index = index;
    }

    public String getOperation() {
        return this.operation;
    }

    public int getIndex() {
        return this.index;
    }

    public int getValue() {
        return this.value;
    }
}
