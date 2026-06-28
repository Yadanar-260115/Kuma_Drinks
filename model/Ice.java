package Kuma_Drinks.model;

public class Ice {
    private int i_id;
    private int price;
    private String amount;

    public Ice() {
    }

    public Ice(int price, String amount) {
        this.price = price;
        this.amount = amount;
    }

    public Ice(int i_id, int price, String amount) {
        this.i_id = i_id;
        this.price = price;
        this.amount = amount;
    }

    public int getI_id() {
        return i_id;
    }

    public void setI_id(int i_id) {
        this.i_id = i_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Ice{" +
                "i_id=" + i_id +
                ", price=" + price +
                ", amount='" + amount + '\'' +
                '}';
    }
}
