package Kuma_Drinks.model;

import java.time.LocalDate;

public class Order {
    private int o_id;
    private LocalDate date;
    private int category;
    private int m_id;
    private int t_id;
    private int i_id;
    private int s_id;
    private boolean size;
    private int amount;


    public Order() {
    }

    public Order(int category, boolean size, int amount) {
        this.category = category;
        this.size = size;
        this.amount = amount;
    }

    public Order(int o_id, LocalDate date, int category, int m_id, int t_id, int i_id, int s_id, boolean size, int amount) {
        this.o_id = o_id;
        this.date = date;
        this.category = category;
        this.m_id = m_id;
        this.t_id = t_id;
        this.i_id = i_id;
        this.s_id = s_id;
        this.size = size;
        this.amount = amount;
    }

    public int getO_id() {
        return o_id;
    }

    public void setO_id(int o_id) {
        this.o_id = o_id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public int getI_id() {
        return i_id;
    }

    public void setI_id(int i_id) {
        this.i_id = i_id;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public boolean isSize() {
        return size;
    }

    public void setSize(boolean size) {
        this.size = size;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "o_id=" + o_id +
                ", date=" + date +
                ", category=" + category +
                ", m_id=" + m_id +
                ", t_id=" + t_id +
                ", i_id=" + i_id +
                ", s_id=" + s_id +
                ", size=" + size +
                ", amount=" + amount +
                '}';
    }
}
