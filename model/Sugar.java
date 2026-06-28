package Kuma_Drinks.model;

public class Sugar {
    private int s_id;
    private String level;

    public Sugar() {
    }

    public Sugar(String level) {
        this.level = level;
    }

    public Sugar(int s_id, String level) {
        this.s_id = s_id;
        this.level = level;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Sugar{" +
                "s_id=" + s_id +
                ", level='" + level + '\'' +
                '}';
    }
}
