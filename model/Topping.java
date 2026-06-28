package Kuma_Drinks.model;

public class Topping {
    private int t_id;
    private String kind;

    public Topping() {
    }

    public Topping(String kind) {
        this.kind = kind;
    }

    public Topping(int t_id, String kind) {
        this.t_id = t_id;
        this.kind = kind;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "t_id=" + t_id +
                ", kind='" + kind + '\'' +
                '}';
    }
}
