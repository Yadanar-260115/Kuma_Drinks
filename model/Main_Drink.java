package Kuma_Drinks.model;

public class Main_Drink {
    private int m_id;
    private int category;
    private int price;
    private String name;

    public Main_Drink() {
    }

    public Main_Drink(int category, int price, String name) {
        this.category = category;
        this.price = price;
        this.name = name;
    }

    public Main_Drink(int m_id, int category, int price, String name) {
        this.m_id = m_id;
        this.category = category;
        this.price = price;
        this.name = name;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Main_Drink{" +
                "m_id=" + m_id +
                ", category=" + category +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
