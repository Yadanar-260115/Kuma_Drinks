package Kuma_Drinks.model;

public class Category {
    private int c_id;
    private String type;

    public Category() {
    }

    public Category(String type) {
        this.type = type;
    }

    public Category(int c_id, String type) {
        this.c_id = c_id;
        this.type = type;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Category{" +
                "c_id=" + c_id +
                ", type='" + type + '\'' +
                '}';
    }
}