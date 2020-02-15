package me.whizlabs.operatorsAndDecisionConstructs;

public class Data {
    private int value;
    private float value2;
    private int returningTwo;

    public  Data() {
        super();
    }

    public Data(int value) {
        this.value = value;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.value == ((Data) obj).value;
    }

    public Data(float value) {
        this.value2 = value;
    }

    public int getReturningTwo() {
        return 2;
    }

    public int justGetTwo() {
        return 2;
    }

    public void setReturningTwo(int returningTwo) {
        System.out.println("I'm " + returningTwo + " before returning!!!");
        this.returningTwo = returningTwo;
    }
}
