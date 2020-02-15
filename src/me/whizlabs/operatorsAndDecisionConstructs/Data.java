package me.whizlabs.operatorsAndDecisionConstructs;

public class Data {
    private int value;

    public Data(int value) {
        this.value = value;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.value == ((Data) obj).value;
    }
}
