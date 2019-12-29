package Specifications;

public class Ram {
    private int valueMemory;
    private String typeMemory;

    public Ram(int valueMemory, String typeMemory) {
        this.typeMemory = typeMemory;
        this.valueMemory = valueMemory;
    }

    public int getValueMemory() {
        return valueMemory;
    }

    public void setValueMemory(int valueMemory) {
        this.valueMemory = valueMemory;
    }

    public String getTypeMemory() {
        return typeMemory;
    }

    public void setTypeMemory(String typeMemory) {
        this.typeMemory = typeMemory;
    }




}
